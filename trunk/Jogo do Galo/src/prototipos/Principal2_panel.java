/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Hugo
 */
public class Principal2_panel extends javax.swing.JPanel implements Observer{

    /**
     * Creates new form Principal2_panel
     */
    private Jogo j;
    private Icon icon;
    
    public Principal2_panel(Jogo j) {
        this.j=j;
        initComponents();
        loadPerfil();
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
    
    private void loadPerfil()
    {
        lbl_nome_1.setText(j.getJogador(0).getNome());
        bt_icon_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/"+j.getJogador(0).getImagem())));
        
        lbl_nome_2.setText(j.getJogador(1).getNome());
        bt_icon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/"+j.getJogador(1).getImagem())));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nome_1 = new javax.swing.JLabel();
        lbl_nome_2 = new javax.swing.JLabel();
        bt_ret = new javax.swing.JButton();
        bt_ver_top = new javax.swing.JButton();
        bt_jogar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bt_icon_2 = new javax.swing.JButton();
        bt_icon_1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

        lbl_nome_1.setFont(new java.awt.Font("Alice in Wonderland", 0, 48)); // NOI18N
        lbl_nome_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nome_1.setText("Hugo Duarte");
        add(lbl_nome_1);
        lbl_nome_1.setBounds(190, 350, 210, 50);

        lbl_nome_2.setFont(new java.awt.Font("Alice in Wonderland", 0, 48)); // NOI18N
        lbl_nome_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nome_2.setText("Filipe Carlos");
        add(lbl_nome_2);
        lbl_nome_2.setBounds(570, 350, 240, 50);

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
        bt_ret.setBounds(100, 523, 60, 60);

        bt_ver_top.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        bt_ver_top.setForeground(new java.awt.Color(255, 255, 255));
        bt_ver_top.setText("Ver Top");
        bt_ver_top.setBorder(null);
        bt_ver_top.setContentAreaFilled(false);
        bt_ver_top.setCursor(setCursor(2));
        bt_ver_top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ver_topActionPerformed(evt);
            }
        });
        add(bt_ver_top);
        bt_ver_top.setBounds(230, 510, 160, 80);

        bt_jogar.setFont(new java.awt.Font("Alice in Wonderland", 0, 48)); // NOI18N
        bt_jogar.setForeground(new java.awt.Color(255, 255, 255));
        bt_jogar.setText("Jogar");
        bt_jogar.setBorder(null);
        bt_jogar.setContentAreaFilled(false);
        bt_jogar.setCursor(setCursor(2));
        bt_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_jogarActionPerformed(evt);
            }
        });
        add(bt_jogar);
        bt_jogar.setBounds(590, 500, 130, 70);

        jLabel6.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel6.setText("Jogador 1");
        add(jLabel6);
        jLabel6.setBounds(230, 170, 130, 43);

        jLabel7.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        jLabel7.setText("Jogador 2");
        add(jLabel7);
        jLabel7.setBounds(620, 160, 130, 43);

        bt_icon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/interrogacao.png"))); // NOI18N
        bt_icon_2.setBorder(null);
        bt_icon_2.setBorderPainted(false);
        bt_icon_2.setContentAreaFilled(false);
        bt_icon_2.setCursor(setCursor(2));
        bt_icon_2.setFocusPainted(false);
        bt_icon_2.setFocusable(false);
        bt_icon_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_icon_2ActionPerformed(evt);
            }
        });
        add(bt_icon_2);
        bt_icon_2.setBounds(610, 210, 150, 128);

        bt_icon_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/interrogacao.png"))); // NOI18N
        bt_icon_1.setBorder(null);
        bt_icon_1.setBorderPainted(false);
        bt_icon_1.setContentAreaFilled(false);
        bt_icon_1.setCursor(setCursor(2));
        bt_icon_1.setFocusPainted(false);
        bt_icon_1.setFocusable(false);
        bt_icon_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_icon_1ActionPerformed(evt);
            }
        });
        add(bt_icon_1);
        bt_icon_1.setBounds(220, 220, 150, 128);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal1.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_retActionPerformed
        j.apagaJogadores();
        j.getEcra().getPrincipal2_panel().setVisible(false);
        j.getEcra().getInicio_panel().setVisible(true);
        j.deleteObservers();
    }//GEN-LAST:event_bt_retActionPerformed

    private void bt_ver_topActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ver_topActionPerformed
        j.getEcra().getPrincipal2_panel().setVisible(false);
        j.setEstados(new Estado_VerTop(j));
        j.verTop();//vai ver o top players
    }//GEN-LAST:event_bt_ver_topActionPerformed

    private void bt_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_jogarActionPerformed
        j.getEcra().getPrincipal2_panel().setVisible(false);
        j.getEcra().criarJogo_panel();
        j.getEcra().getJogo_panel().setVisible(true);
        j.deleteObservers();
        j.addObserver(j.getEcra().getJogo_panel());//adiciona o observer a janela
    }//GEN-LAST:event_bt_jogarActionPerformed

    private void bt_icon_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_icon_1ActionPerformed
        j.setJogActivo(0);//coloca activo 1 jogador
        icon = new Icon(j);//abre os icons
    }//GEN-LAST:event_bt_icon_1ActionPerformed

    private void bt_icon_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_icon_2ActionPerformed
        j.setJogActivo(1);//coloca activo 1 jogador
        icon = new Icon(j);//abre os icons
    }//GEN-LAST:event_bt_icon_2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_icon_1;
    private javax.swing.JButton bt_icon_2;
    private javax.swing.JButton bt_jogar;
    private javax.swing.JButton bt_ret;
    private javax.swing.JButton bt_ver_top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_nome_1;
    private javax.swing.JLabel lbl_nome_2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        bt_icon_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/"+j.getJogador(0).getImagem())));
        
        bt_icon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/"+j.getJogador(1).getImagem())));
    }
}
