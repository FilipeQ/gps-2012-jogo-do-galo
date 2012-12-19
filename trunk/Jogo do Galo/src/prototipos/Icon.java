/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class Icon  extends JDialog implements ActionListener{
    private Jogo j;
    private java.util.List<JButton> cBar;
    private Box box;
    private JPanel pPrincipal;
    private JScrollPane jspane;
    private Container cp;
    private List<String> list;
    
    public Icon(Jogo j) {
        this.j=j;
        setTitle("Escolha um Icon!!!");
        setSize(600,500);
        setLocationRelativeTo(j.getEcra().getFrame());
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        j.getEcra().getFrame().setEnabled(false);
        initComponents();
        adicionarListeners();
    }

    private void initComponents() {
        cp = this.getContentPane();
        cBar= new ArrayList<>();
        list = new ArrayList<>();
        JButton aux;
        
        File f = new File("src//imagens//icons//");
        
        //recebo as imagens com formato png
        File[] imagensDoDiretorio = f.listFiles(new FileFilter() {

            @Override
            public boolean accept(File b) {
                return b.getName().endsWith(".png");
            }
        }); 
        
        //coloco o nome das imagens para um array de strings
        
        for(int i=0;i<imagensDoDiretorio.length;i++)
        {
            list.add(imagensDoDiretorio[i].getName());
        }
        
        
        
        pPrincipal= new JPanel();
        pPrincipal.setLayout(new GridLayout(0,4));
        
        
        for(int i=0;i<list.size();i++)
        {      
            aux=new JButton(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/"+list.get(i))));
            aux.setPreferredSize(new Dimension(150,120));
            aux.setMaximumSize(new Dimension(150,120));
            aux.setMinimumSize(new Dimension(150,120)); 
            cBar.add(aux);    
        }
        
        //adiciona a vista 
         
        for(int i=0;i<cBar.size();i++)
            pPrincipal.add(cBar.get(i));
        
        jspane = new JScrollPane(pPrincipal);
        cp.add(jspane);
        
    }
    
    public void adicionarListeners()
    {
        for(int i=0;i<cBar.size();i++)
            cBar.get(i).addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<cBar.size();i++)
        {
            if(e.getSource()==cBar.get(i))
            {
               j.getAcessoBd().alteraIcon(list.get(i),j.getJogActivo());//regista o icon escolhido
               j.getEcra().getFrame().setEnabled(true);
               j.actualizaVista();
               dispose();
                
            }
        }
    }
}
