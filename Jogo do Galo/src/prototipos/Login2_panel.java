/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Login2_panel extends javax.swing.JPanel {

    /**
     * Creates new form Login2_panel
     */
    Jogo j;
    public Login2_panel(Jogo j) {
        this.j=j;
        initComponents();
        inicialiCaixasTexto();
    }

    public void inicialiCaixasTexto(){
        tb_utilizador_1.setDocument(new FixaTamanhoTextBox(20));
        pf_password_1.setDocument(new FixaTamanhoTextBox(20));
        tb_utilizador_2.setDocument(new FixaTamanhoTextBox(20));
        pf_password_2.setDocument(new FixaTamanhoTextBox(20));
    }
    
    public Cursor setCursor(int i){
        Image image;
        Toolkit tk = Toolkit.getDefaultToolkit();
        if(i==1)
            image = tk.getImage(getClass().getResource("/imagens/atras.png"));
        else
            image = tk.getImage(getClass().getResource("/imagens/seta2.png"));
        
        Cursor cursor = tk.createCustomCursor(image, getLocation(), "meuCursor");
        
        
        return cursor;
    }
    
    private void limparDados1()
    {
        tb_utilizador_1.setText("");
        pf_password_1.setText("");
    }
    
    private void limparDados2()
    {
        tb_utilizador_2.setText("");
        pf_password_2.setText("");
    }
    
    private boolean login1()
    {
        String nome="";
        String pw1 ="";
        char[] pw = null;
        int op=0;
        
        
        nome = tb_utilizador_1.getText();
        pw = pf_password_1.getPassword();
        
        if(nome.equalsIgnoreCase("") || pw.length==0)
            JOptionPane.showMessageDialog(null, "Preencher Campos Login e Password","login", JOptionPane.OK_OPTION);
        else
        {
            
            for(int i=0;i<pw.length;i++)
            {
                pw1+=pw[i];
            }
            //JOptionPane.showMessageDialog(null, pw1+" : "+nome,"login", JOptionPane.OK_OPTION);
            if(j.getAcessoBd().verificaLogin(nome, pw1,1)==true)
            {
                return true; 
            }else
            {
                op=JOptionPane.showConfirmDialog(null, "Nome: "+nome,"Confirmação do Nome", JOptionPane.YES_NO_OPTION);
                if(op==0)
                {
                    if(j.getAcessoBd().registar(nome,pw1,1)==1)
                        JOptionPane.showMessageDialog(null,"Password Inválida","Login", JOptionPane.OK_OPTION);
                    else
                    {
                        return true; 
                    }   
                    limparDados1();
                }else
                {
                    limparDados1();
                }
                //regista jogador e segue po perfil
            }
        }
        return false;
    }
    
    private boolean login2()
    {
        String nome="";
        String pw1 ="";
        char[] pw = null;
        int op=0;
        
        
        nome = tb_utilizador_2.getText();
        pw = pf_password_2.getPassword();
        
        if(nome.equalsIgnoreCase("") || pw.length==0)
            JOptionPane.showMessageDialog(null, "Preencher Campos Login e Password","login", JOptionPane.OK_OPTION);
        else
        {
            
            for(int i=0;i<pw.length;i++)
            {
                pw1+=pw[i];
            }
            //JOptionPane.showMessageDialog(null, pw1+" : "+nome,"login", JOptionPane.OK_OPTION);
            if(j.getAcessoBd().verificaLogin(nome, pw1,2)==true)
            {
                return true; 
            }else
            {
                op=JOptionPane.showConfirmDialog(null, "Nome: "+nome,"Confirmação do Nome", JOptionPane.YES_NO_OPTION);
                if(op==0)
                {
                    if(j.getAcessoBd().registar(nome,pw1,2)==1)
                        JOptionPane.showMessageDialog(null,"Password Inválida","Login", JOptionPane.OK_OPTION);
                    else
                    {
                        return true; 
                    }
                    limparDados2();
                }else
                {
                    limparDados2();
                }
                //regista jogador e segue po perfil
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pf_password_1 = new javax.swing.JPasswordField();
        pf_password_2 = new javax.swing.JPasswordField();
        tb_utilizador_2 = new javax.swing.JTextField();
        tb_utilizador_1 = new javax.swing.JTextField();
        bt_ret = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

        bt_ok.setFont(new java.awt.Font("Alice in Wonderland", 0, 48)); // NOI18N
        bt_ok.setForeground(new java.awt.Color(255, 255, 255));
        bt_ok.setText("OK");
        bt_ok.setBorder(null);
        bt_ok.setBorderPainted(false);
        bt_ok.setContentAreaFilled(false);
        bt_ok.setCursor(setCursor(2));
        bt_ok.setFocusPainted(false);
        bt_ok.setFocusable(false);
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });
        add(bt_ok);
        bt_ok.setBounds(440, 500, 100, 80);

        jLabel2.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");
        add(jLabel2);
        jLabel2.setBounds(120, 230, 140, 50);

        jLabel3.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Senha:");
        add(jLabel3);
        jLabel3.setBounds(110, 290, 150, 50);

        jLabel4.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome:");
        add(jLabel4);
        jLabel4.setBounds(520, 230, 140, 50);

        jLabel5.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Senha:");
        add(jLabel5);
        jLabel5.setBounds(520, 290, 140, 50);

        jLabel1.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel1.setText("Jogador 1");
        add(jLabel1);
        jLabel1.setBounds(230, 160, 130, 43);

        jLabel7.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel7.setText("Jogador 2");
        add(jLabel7);
        jLabel7.setBounds(640, 160, 140, 40);

        pf_password_1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        pf_password_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_password_1ActionPerformed(evt);
            }
        });
        add(pf_password_1);
        pf_password_1.setBounds(270, 290, 180, 50);

        pf_password_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        add(pf_password_2);
        pf_password_2.setBounds(670, 290, 180, 50);

        tb_utilizador_2.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        add(tb_utilizador_2);
        tb_utilizador_2.setBounds(670, 230, 180, 50);

        tb_utilizador_1.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        add(tb_utilizador_1);
        tb_utilizador_1.setBounds(270, 230, 180, 50);

        bt_ret.setBorder(null);
        bt_ret.setBorderPainted(false);
        bt_ret.setContentAreaFilled(false);
        bt_ret.setCursor(setCursor(1));
        bt_ret.setFocusPainted(false);
        bt_ret.setFocusable(false);
        bt_ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_retActionPerformed(evt);
            }
        });
        add(bt_ret);
        bt_ret.setBounds(103, 523, 60, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login2.png"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1000, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
        if(tb_utilizador_1.getText().equalsIgnoreCase(tb_utilizador_2.getText()))
        {
            JOptionPane.showMessageDialog(null,"Nomes Repetidos","Nome", JOptionPane.OK_OPTION);
            limparDados1();
            limparDados2();
        }
        else
        {
            if(login1()==true && login2()==true)
            {
                limparDados1();
                limparDados2();
                j.getEcra().getLogin2_panel().setVisible(false);
                j.getEcra().criarPrincipal2();
                j.setEstados(new Estado_Perfil(j,j.getTipoJog()));
                j.addObserver(j.getEcra().getPrincipal2_panel());//adiciona o observer a janela
            }
            else
            {
                j.apagaJogadores();
            }
        }
    }//GEN-LAST:event_bt_okActionPerformed

    private void pf_password_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_password_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_password_1ActionPerformed

    private void bt_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_retActionPerformed
       j.getEcra().getLogin2_panel().setVisible(false);
       j.getEcra().getInicio_panel().setVisible(true);
    }//GEN-LAST:event_bt_retActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ok;
    private javax.swing.JButton bt_ret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField pf_password_1;
    private javax.swing.JPasswordField pf_password_2;
    private javax.swing.JTextField tb_utilizador_1;
    private javax.swing.JTextField tb_utilizador_2;
    // End of variables declaration//GEN-END:variables
}
