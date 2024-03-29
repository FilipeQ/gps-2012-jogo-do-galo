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
public class Principal1_panel extends javax.swing.JPanel implements Observer{

    /**
     * Creates new form Principal1_panel
     */
    Jogo j;
    public Principal1_panel(Jogo j) {
        this.j=j;
        initComponents();
        loadPerfil();
    }

    public Cursor setCursor(int i)
    {
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
        bt_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/"+j.getJogador(0).getImagem())));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_ret = new javax.swing.JButton();
        bt_ver_top = new javax.swing.JButton();
        bt_jogar = new javax.swing.JButton();
        lbl_nome_1 = new javax.swing.JLabel();
        bt_icon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

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

        bt_ver_top.setFont(new java.awt.Font("Alice in Wonderland", 0, 36)); // NOI18N
        bt_ver_top.setForeground(new java.awt.Color(255, 255, 255));
        bt_ver_top.setText("Ver Top");
        bt_ver_top.setBorder(null);
        bt_ver_top.setBorderPainted(false);
        bt_ver_top.setContentAreaFilled(false);
        bt_ver_top.setCursor(setCursor(2));
        bt_ver_top.setFocusPainted(false);
        bt_ver_top.setFocusable(false);
        bt_ver_top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ver_topActionPerformed(evt);
            }
        });
        add(bt_ver_top);
        bt_ver_top.setBounds(230, 510, 170, 70);

        bt_jogar.setFont(new java.awt.Font("Alice in Wonderland", 0, 48)); // NOI18N
        bt_jogar.setForeground(new java.awt.Color(255, 255, 255));
        bt_jogar.setText("Jogar");
        bt_jogar.setBorder(null);
        bt_jogar.setBorderPainted(false);
        bt_jogar.setContentAreaFilled(false);
        bt_jogar.setCursor(setCursor(2));
        bt_jogar.setFocusPainted(false);
        bt_jogar.setFocusable(false);
        bt_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_jogarActionPerformed(evt);
            }
        });
        add(bt_jogar);
        bt_jogar.setBounds(560, 500, 177, 80);

        lbl_nome_1.setFont(new java.awt.Font("Alice in Wonderland", 0, 45)); // NOI18N
        lbl_nome_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nome_1.setText("Filipe");
        add(lbl_nome_1);
        lbl_nome_1.setBounds(350, 320, 250, 50);

        bt_icon.setBorder(null);
        bt_icon.setBorderPainted(false);
        bt_icon.setContentAreaFilled(false);
        bt_icon.setCursor(setCursor(2));
        bt_icon.setFocusPainted(false);
        bt_icon.setFocusable(false);
        bt_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_iconActionPerformed(evt);
            }
        });
        add(bt_icon);
        bt_icon.setBounds(400, 200, 150, 130);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal2.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_retActionPerformed
        j.apagaJogadores();
        j.getEcra().getPrincipal1_panel().setVisible(false);
        j.getEcra().getInicio_panel().setVisible(true);
        j.deleteObservers();// apaga os observers
    }//GEN-LAST:event_bt_retActionPerformed

    private void bt_ver_topActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ver_topActionPerformed
        j.getEcra().getPrincipal1_panel().setVisible(false);
        j.setEstados(new Estado_VerTop(j));
        j.verTop();//vai ver o top players
        
    }//GEN-LAST:event_bt_ver_topActionPerformed

    private void bt_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_jogarActionPerformed
        j.getEcra().getPrincipal1_panel().setVisible(false);
        j.getEcra().criarJogo_panel();
        j.getEcra().getJogo_panel().setVisible(true);
        j.deleteObservers();// apaga os observers
        j.addObserver(j.getEcra().getJogo_panel());//adiciona o observer a janela
        
    }//GEN-LAST:event_bt_jogarActionPerformed

    private void bt_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_iconActionPerformed
       j.setJogActivo(0);//coloca activo 1 jogador
       Icon icon = new Icon(j);//abre os icons
       
    }//GEN-LAST:event_bt_iconActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_icon;
    private javax.swing.JButton bt_jogar;
    private javax.swing.JButton bt_ret;
    private javax.swing.JButton bt_ver_top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_nome_1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        bt_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/"+j.getJogador(0).getImagem())));//altera imagem
    }
}
