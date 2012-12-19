/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlitos
 */
public class BD {
   public Connection con;
   public Jogo j;
    public BD(Jogo j) {
        con = null;
        this.j=j;
    }
      
  
   
   public void Conexao() {  
  
      try {  
         Class.forName("com.mysql.jdbc.Driver");   
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_galo","root","123456");  
         //System.out.println("Coectado com sucesso");
         
     }   
     catch (ClassNotFoundException e){  
         System.out.println("Classe não encontrada");  
     }  
  
     catch (Exception e){  
         System.out.println("Problemas com o BD "+e);  
     }
     
   } 
   
   public boolean verificaLogin(String nome, String pw,int id)
   {
       int ver=0;
       Jogador jog;
       String query ="SELECT nome, ganhos, imagem FROM jogadores WHERE nome='"+nome+"' and pw='"+pw+"';";
       Conexao();
        try {
           Statement stm = con.createStatement();  

           ResultSet rs = stm.executeQuery(query);
           while(rs.next())
           {
               ver=1;
               if(id==1)
                   jog = new Jogador(nome,pw,rs.getString("imagem"),rs.getInt("ganhos"),"x");
               else
                   jog = new Jogador(nome,pw,rs.getString("imagem"),rs.getInt("ganhos"),"o");
               j.setJogador(jog);
               //JOptionPane.showMessageDialog(null,"Nome: "+rs.getString("nome"),"login", JOptionPane.OK_OPTION);
           }
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(ver==1)
            return true;
        else
            return false;
   }
   
   public int registar(String nome, String pw,int id)
   {
       Jogador jog=null;
       int ver=0;
       String queryInsert = "insert into jogadores (nome,pw) values ('"+nome+"','"+pw+"');";
       String query ="SELECT nome FROM jogadores WHERE nome='"+nome+"';";
       
       Conexao();
       
       Statement stm = null;
       
       
        try {
            stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
           ResultSet rs = stm.executeQuery(query);
           //vai ver se existe o user caso exista a pass foi mal introduzida
           while(rs.next())
           {
               ver=1;
           }
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(ver ==0)
        {
            try {
                stm.executeUpdate(queryInsert);
                if(id == 1)
                    jog = new Jogador(nome,pw,"interrogacao.png",0,"x");
                else
                    jog = new Jogador(nome,pw,"interrogacao.png",0,"o");
                j.setJogador(jog);
            } catch (SQLException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(ver==0)
            return 0;
        else
            return 1;
   }

   
   public void top3()
   {
        try {
            Jogador jog;
            String query1 ="SELECT nome,pw,ganhos,imagem FROM jogadores WHERE ganhos=(select MIN(ganhos) from (SELECT ganhos FROM jogadores ORDER BY ganhos DESC LIMIT 1)as ola ) ORDER BY nome Limit 1;";
            
            String query2 ="select nome,pw,ganhos,imagem from (SELECT * FROM jogadores WHERE ganhos=(select MIN(ganhos) from (SELECT ganhos FROM jogadores ORDER BY ganhos DESC LIMIT 2)as ola ) ORDER BY nome Limit 2) as ola2"
                    + " where nome!=(SELECT nome FROM jogadores WHERE ganhos=(select MIN(ganhos) from (SELECT ganhos FROM jogadores ORDER BY ganhos DESC LIMIT 1)as ola ) ORDER BY nome Limit 1);";
            
            String query3 ="select nome,pw,Max(ganhos) as ganhos,imagem from (SELECT * FROM jogadores WHERE ganhos=(select MIN(ganhos) from (SELECT ganhos FROM jogadores ORDER BY ganhos DESC LIMIT 3)as ola ) ORDER BY nome Limit 3) as ola2 "
                            + "where nome!=(SELECT nome FROM jogadores WHERE ganhos=(select MIN(ganhos) from (SELECT ganhos FROM jogadores ORDER BY ganhos DESC LIMIT 1)as ola ) ORDER BY nome Limit 1) " 
                            + "and nome!= (select nome from (SELECT nome,ganhos FROM jogadores WHERE ganhos=(select MIN(ganhos) from (SELECT ganhos FROM jogadores ORDER BY ganhos DESC LIMIT 2)as ola ) ORDER BY nome Limit 2) as ola2 "
                            + "where nome!=(SELECT nome FROM jogadores WHERE ganhos=(select MIN(ganhos) from (SELECT ganhos FROM jogadores ORDER BY ganhos DESC LIMIT 1)as ola ) ORDER BY nome Limit 1));";
            Conexao();
            
            Statement stm = con.createStatement();  

            ResultSet rs = stm.executeQuery(query1);
            while(rs.next())
             {
                 jog = new Jogador(rs.getString("nome"),rs.getString("pw"),rs.getString("imagem"),rs.getInt("ganhos"),"");
                 j.setJogadorTop(jog);
                 //JOptionPane.showMessageDialog(null,"Nome: "+rs.getString("nome"),"TOP1", JOptionPane.OK_OPTION);
             }
            
            rs = stm.executeQuery(query2);
            while(rs.next())
            {
                jog = new Jogador(rs.getString("nome"),rs.getString("pw"),rs.getString("imagem"),rs.getInt("ganhos"),"");
                j.setJogadorTop(jog);
                //JOptionPane.showMessageDialog(null,"Nome: "+rs.getString("nome"),"TOP1", JOptionPane.OK_OPTION);
            }
            
            rs = stm.executeQuery(query3);
            while(rs.next())
            {
                jog = new Jogador(rs.getString("nome"),rs.getString("pw"),rs.getString("imagem"),rs.getInt("ganhos"),"");
                j.setJogadorTop(jog);
                //JOptionPane.showMessageDialog(null,"Nome: "+rs.getString("nome"),"TOP1", JOptionPane.OK_OPTION);
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
   
   
   public void gravarVencedor(int ganhos, String nome)
   {
       String query1 = "update jogadores set ganhos="+ganhos+" where nome='"+nome+"'";
       Conexao();
       
       Statement stm;
        try {
            stm = con.createStatement();
            stm.executeUpdate(query1);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }      
   }
   
   public void alteraIcon(String icon, int id){
       
       String query1 = "update jogadores set imagem='"+icon+"' where nome='"+j.getJogadores().get(id).getNome()+"'";
       Conexao();
       
       Statement stm;
        try {
            stm = con.createStatement();
            stm.executeUpdate(query1);
            j.getJogadores().get(id).setImagem(icon);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }   
   }
}
