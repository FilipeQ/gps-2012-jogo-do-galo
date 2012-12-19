/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Hugo
 */
public class empate_panel extends javax.swing.JPanel {

    /**
     * Creates new form empate_panel
     */
    Jogo j;
    public empate_panel(Jogo j) {
        this.j=j;
        initComponents();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_ret = new javax.swing.JButton();
        bt_jogar_novamente = new javax.swing.JButton();
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
        bt_ret.setBounds(100, 523, 70, 60);

        bt_jogar_novamente.setFont(new java.awt.Font("Alice in Wonderland", 0, 32)); // NOI18N
        bt_jogar_novamente.setForeground(new java.awt.Color(255, 255, 255));
        bt_jogar_novamente.setText("Jogar Novamente");
        bt_jogar_novamente.setBorder(null);
        bt_jogar_novamente.setBorderPainted(false);
        bt_jogar_novamente.setContentAreaFilled(false);
        bt_jogar_novamente.setCursor(setCursor(2));
        bt_jogar_novamente.setFocusPainted(false);
        bt_jogar_novamente.setFocusable(false);
        bt_jogar_novamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_jogar_novamenteActionPerformed(evt);
            }
        });
        add(bt_jogar_novamente);
        bt_jogar_novamente.setBounds(350, 470, 240, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/empate.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_jogar_novamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_jogar_novamenteActionPerformed
        j.getEcra().getEmp_panel().setVisible(false);
        j.getEcra().getJogo_panel().setVisible(true);
    }//GEN-LAST:event_bt_jogar_novamenteActionPerformed

    private void bt_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_retActionPerformed
        j.getEcra().getEmp_panel().setVisible(false);
        j.setEstados(new Estado_Perfil(j,j.getTipoJog()));
        j.deleteObservers();
        if(j.getTipoJog()==1)
            j.addObserver(j.getEcra().getPrincipal1_panel());//adiciona o observer a janela
        else
            j.addObserver(j.getEcra().getPrincipal2_panel());
    }//GEN-LAST:event_bt_retActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_jogar_novamente;
    private javax.swing.JButton bt_ret;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
