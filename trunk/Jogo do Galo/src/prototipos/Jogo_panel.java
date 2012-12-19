
package prototipos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo
 */
public class Jogo_panel extends javax.swing.JPanel implements Observer{

    /**
     * Creates new form Jogo_panel
     */
    Jogo j;
    public Jogo_panel(Jogo j) {
        this.j=j;
        j.setJogActivo(0);//caso entre do perfil e sempre o 1 jogador a jogar
        initComponents();   //inicia o ecra
        inicio(); //inicializa os dados de jogo
    }
    
    public Cursor setCursor(int i){
        Image image = null;
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        if(i==2)
            image = tk.getImage(getClass().getResource("/imagens/atras.png"));
        else if(i==0){
            image = tk.getImage(getClass().getResource("/imagens/X.png"));
        }else if(i==1){
            image = tk.getImage(getClass().getResource("/imagens/O.png"));
        }
        
        Cursor cursor = tk.createCustomCursor(image, getLocation(), "meuCursor");
        
        
        return cursor;
    }
    
    public void inicio(){
        j.setEstados(new Estado_UmJogador(j));//mete no estado 1jogador
        j.zeraPintaBotoes();//inicializa a matriz que vai receber os 3 botoes vencedores
        j.colocaMatrizZeros(); //chama a funÃ§Ã£o que mete a matriz toda a -1
        j.inicializaBotoes();//chama a funÃ§aÃµ de inicializar os botoes
        preencheBotoes();//chama a funÃ§aÃµ de de prencher os botoes
        jl_nome.setText(j.getJogadores().get(j.getJogActivo()).getNome());//mete na label o nome do jogador que vai jogar
        jl_tipo.setText(j.getJogadores().get(j.getJogActivo()).getTipo().toUpperCase());// coloca o tipo desse jogador X ou O
    }
    
    //verifica qul o tipo qur foi jogado X ou O
    public int verJogada(){
        if(jl_tipo.getText().equalsIgnoreCase("x"))//se foi jogado X devolve 1
            return 1;
        else
            return 2;// se foi jogado O devolve 2
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        jl_nome = new javax.swing.JLabel();
        jl_tipo = new javax.swing.JLabel();
        bt_ret = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

        bt_1.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_1.setBorder(null);
        bt_1.setBorderPainted(false);
        bt_1.setContentAreaFilled(false);
        bt_1.setCursor(setCursor(j.getJogActivo()));
        bt_1.setFocusPainted(false);
        bt_1.setFocusable(false);
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });
        add(bt_1);
        bt_1.setBounds(233, 173, 150, 110);

        bt_2.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_2.setBorder(null);
        bt_2.setBorderPainted(false);
        bt_2.setContentAreaFilled(false);
        bt_2.setCursor(setCursor(j.getJogActivo()));
        bt_2.setFocusPainted(false);
        bt_2.setFocusable(false);
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });
        add(bt_2);
        bt_2.setBounds(400, 173, 180, 110);

        bt_3.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_3.setBorder(null);
        bt_3.setBorderPainted(false);
        bt_3.setContentAreaFilled(false);
        bt_3.setCursor(setCursor(j.getJogActivo()));
        bt_3.setFocusPainted(false);
        bt_3.setFocusable(false);
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });
        add(bt_3);
        bt_3.setBounds(590, 173, 140, 110);

        bt_4.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_4.setBorder(null);
        bt_4.setBorderPainted(false);
        bt_4.setContentAreaFilled(false);
        bt_4.setCursor(setCursor(j.getJogActivo()));
        bt_4.setFocusPainted(false);
        bt_4.setFocusable(false);
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });
        add(bt_4);
        bt_4.setBounds(233, 293, 150, 130);

        bt_7.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_7.setBorder(null);
        bt_7.setBorderPainted(false);
        bt_7.setContentAreaFilled(false);
        bt_7.setCursor(setCursor(j.getJogActivo()));
        bt_7.setFocusPainted(false);
        bt_7.setFocusable(false);
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });
        add(bt_7);
        bt_7.setBounds(230, 430, 150, 110);

        bt_8.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_8.setBorder(null);
        bt_8.setContentAreaFilled(false);
        bt_8.setCursor(setCursor(j.getJogActivo()));
        bt_8.setFocusPainted(false);
        bt_8.setFocusable(false);
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });
        add(bt_8);
        bt_8.setBounds(400, 430, 180, 110);

        bt_9.setBackground(new java.awt.Color(255, 255, 255));
        bt_9.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_9.setBorder(null);
        bt_9.setContentAreaFilled(false);
        bt_9.setCursor(setCursor(j.getJogActivo()));
        bt_9.setFocusPainted(false);
        bt_9.setFocusable(false);
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });
        add(bt_9);
        bt_9.setBounds(590, 430, 140, 110);

        bt_6.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_6.setBorder(null);
        bt_6.setContentAreaFilled(false);
        bt_6.setCursor(setCursor(j.getJogActivo()));
        bt_6.setFocusPainted(false);
        bt_6.setFocusable(false);
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });
        add(bt_6);
        bt_6.setBounds(590, 300, 140, 120);

        bt_5.setFont(new java.awt.Font("Alice in Wonderland", 0, 250)); // NOI18N
        bt_5.setBorder(null);
        bt_5.setBorderPainted(false);
        bt_5.setContentAreaFilled(false);
        bt_5.setCursor(setCursor(j.getJogActivo()));
        bt_5.setFocusPainted(false);
        bt_5.setFocusable(false);
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });
        add(bt_5);
        bt_5.setBounds(400, 300, 180, 120);

        jl_nome.setFont(new java.awt.Font("Alice in Wonderland", 0, 70)); // NOI18N
        jl_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_nome.setText("Computador");
        add(jl_nome);
        jl_nome.setBounds(370, 60, 270, 70);

        jl_tipo.setFont(new java.awt.Font("Alice in Wonderland", 0, 120)); // NOI18N
        jl_tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_tipo.setText("X");
        add(jl_tipo);
        jl_tipo.setBounds(630, 40, 120, 100);

        bt_ret.setBorder(null);
        bt_ret.setBorderPainted(false);
        bt_ret.setContentAreaFilled(false);
        bt_ret.setCursor(setCursor(2));
        bt_ret.setFocusPainted(false);
        bt_ret.setFocusable(false);
        bt_ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_retActionPerformed(evt);
            }
        });
        add(bt_ret);
        bt_ret.setBounds(100, 523, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pagina de jogar.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        j.setMatrizJogada(0, 0,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 0);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        j.setMatrizJogada(0, 1,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 1);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        j.setMatrizJogada(0, 2,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 2);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        j.setMatrizJogada(1, 0,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 3);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        j.setMatrizJogada(1, 1,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 4);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        j.setMatrizJogada(1, 2,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 5);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        j.setMatrizJogada(2, 0,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 6);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        j.setMatrizJogada(2, 1,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 7);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        j.setMatrizJogada(2, 2,verJogada());//actualiza a matriz quando se carrega neste botao com a jogada efetuada
        j.setBotoes(jl_tipo.getText().toLowerCase(), 8);//coloca o tipo para o array de string para depois colocar nos botoes, necessario por causa do pc jogar
        j.jogar();//chama a funÃ§aÃµ de jogar da class jogo
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_retActionPerformed
        j.getEcra().getJogo_panel().setVisible(false);//tira o ecra de jogo de visivel
        j.getEcra().destroiJogoPanel();//destroi o painel
        j.setEstados(new Estado_Perfil(j,j.getTipoJog()));// coloca o painel de estado de perfil de 1 jogador ou dois jogadores
        j.deleteObservers();// apaga os observers
        if(j.getTipoJog()==1)
            j.addObserver(j.getEcra().getPrincipal1_panel());//adiciona o observer a janela
        else
            j.addObserver(j.getEcra().getPrincipal2_panel());//adiciona o observer a janela
    }//GEN-LAST:event_bt_retActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton bt_ret;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_tipo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        opaque(false);//coloca botoes opacos
        colocaBotoesCursor(j.getJogActivo());//coloca botoes com cursor
        jl_nome.setText(j.getJogadores().get(j.getJogActivo()).getNome());//actualiza a label a dizer que jogador esta a jogar
        jl_tipo.setText(j.getJogadores().get(j.getJogActivo()).getTipo().toUpperCase());// actualiza a label a dizer que tipo esta a jogar X ou O
        preencheBotoes(); //coloca os botoes
        
        //vai ver se o jogo ja acabou, se acabou vai entrar aqui
        if(j.getGuardaFimJogo()!=-1)
        {
            colocaBotoesEnable(true);
            pintaBotoes();//pinta os botoes que ganharam
           
            colocaBotoesEnable(false);//bloqueia os botoes
            Final fim = new Final(j);//vai proceder ao final
            fim.start();
            
        }else
        {
            jogaPC();// chama a funÃ§Ã£o que coloca o computador a jogar
        } 
        
    }
    
    public void jogaPC(){
        if(j.getJogadores().get(1).getNome().equalsIgnoreCase("Computador") && j.getJogActivo()==1)//caso seja o pc a jogar tem de fazer esta actualizaÃ§Ã£o
        { 
            jl_nome.setText(j.getJogadores().get(1).getNome());//coloca na label o nome do jogador que vai jogar
            jl_tipo.setText(j.getJogadores().get(1).getTipo().toUpperCase());// coloca na label o tipo X ou O que o jogador esta a jogar
            colocaBotoesEnable(false);//coloca os botoes todos a falso
            PC t = new PC(j);//cria uma tread para quando pc jogar puder actualizar a parte
            t.start();// comeÃ§a a thread  
        }  
    }
    
    //coloca todos os botoes a activos ou desactivos, dependendo do que recebe na variavel b (true ou false)
    public void colocaBotoesEnable(boolean b){
        bt_1.setEnabled(b);
        bt_2.setEnabled(b);
        bt_3.setEnabled(b);
        bt_4.setEnabled(b);
        bt_5.setEnabled(b);
        bt_6.setEnabled(b);
        bt_7.setEnabled(b);
        bt_8.setEnabled(b);
        bt_9.setEnabled(b);
    }
    
    //coloca botoes co cursor certo
    public void colocaBotoesCursor(int i){
        bt_1.setCursor(setCursor(i));
        bt_2.setCursor(setCursor(i));
        bt_3.setCursor(setCursor(i));
        bt_4.setCursor(setCursor(i));
        bt_5.setCursor(setCursor(i));
        bt_6.setCursor(setCursor(i));
        bt_7.setCursor(setCursor(i));
        bt_8.setCursor(setCursor(i));
        bt_9.setCursor(setCursor(i));
    }
    
    public void preencheBotoes(){
        for(int i=0;i<j.getBotoes().length;i++)         //vai precorrer todos os botoes
        {
            if(i==0)    //quando o i e 0 altera o botao 1
            {
                bt_1.setText(j.getBotaoValor(i)); //coloca no botao a jogada X ou O
                if(!bt_1.getText().equals(""))   // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_1.setEnabled(false);
                else
                    bt_1.setEnabled(true); // se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo 
            }
            if(i==1)    //quando o i Ã© 1 altera o botao 2
            {
                bt_2.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_2.getText().equals(""))      // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_2.setEnabled(false);
                else
                    bt_2.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
            if(i==2)    //quando o i e 2 altera o botao 3
            {
                bt_3.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_3.getText().equals(""))      // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_3.setEnabled(false);
                else
                    bt_3.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
            if(i==3)    //quando o i Ã© 3 vai altera o botao 4
            {
                bt_4.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_4.getText().equals(""))      // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_4.setEnabled(false);
                else
                    bt_4.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
            if(i==4)    //quando o i Ã© 4 altera o botao 5
            {
                bt_5.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_5.getText().equals(""))      // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_5.setEnabled(false);
                else
                    bt_5.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
            if(i==5)    //quando o i Ã© 5 altera o botao 6
            {
                bt_6.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_6.getText().equals(""))      // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_6.setEnabled(false);
                else
                    bt_6.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
            if(i==6)    //quando o i Ã© 6 altera o botao 7
            {
                bt_7.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_7.getText().equals(""))     // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_7.setEnabled(false);
                else
                    bt_7.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
            if(i==7)    //quando o i Ã© 7 altera o botao 8
            {
                bt_8.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_8.getText().equals(""))    // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_8.setEnabled(false);
                else
                    bt_8.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
            if(i==8)    //quando o i Ã© 8 altera o botao 9
            {
                bt_9.setText(j.getBotaoValor(i));//coloca no botao a jogada X ou O
                if(!bt_9.getText().equals(""))    // se ja se jogou no botao o botao tem escrito um X ou O e o botao deixa de estar activo
                    bt_9.setEnabled(false);
                else
                    bt_9.setEnabled(true);// se ainda nao se jogou nesta posiÃ§Ã£o o botao nao tem nada escrito, logo esta activo
            }
        }
    }
    
    //vai pintar os botoes caso estejam marcados para isso
    public void pintaBotoes(){
        for(int i=0;i<j.getPintaBotoes().length;i++)         //vai precorrer todos os botoes
        {
            
            if(i==0 && j.getPosPintaBotoes(i)==1)    //quando o i e 0 altera o botao 1
            {
                bt_1.setOpaque(true);
                bt_1.setBackground(Color.red); //coloca cor no botao
                //bt_1.setForeground(Color.red);
            }
            if(i==1 && j.getPosPintaBotoes(i)==1)    //quando o i Ã© 1 altera o botao 2
            {
                bt_2.setOpaque(true);
                bt_2.setBackground(Color.red); //coloca cor no botao
            }
            if(i==2 && j.getPosPintaBotoes(i)==1)    //quando o i e 2 altera o botao 3
            {
                bt_3.setOpaque(true);
                bt_3.setBackground(Color.red); //coloca cor no botao
            }
            if(i==3 && j.getPosPintaBotoes(i)==1)    //quando o i Ã© 3 vai altera o botao 4
            {
                bt_4.setOpaque(true);
                bt_4.setBackground(Color.red); //coloca cor no botao
            }
            if(i==4 && j.getPosPintaBotoes(i)==1)    //quando o i Ã© 4 altera o botao 5
            {
                bt_5.setOpaque(true);
                bt_5.setBackground(Color.red); //coloca cor no botao
            }
            if(i==5 && j.getPosPintaBotoes(i)==1)    //quando o i Ã© 5 altera o botao 6
            {
                bt_6.setOpaque(true);
                bt_6.setBackground(Color.red); //coloca cor no botao
            }
            if(i==6 && j.getPosPintaBotoes(i)==1)    //quando o i Ã© 6 altera o botao 7
            {
                bt_7.setOpaque(true);
                bt_7.setBackground(Color.red); //coloca cor no botao
            }
            if(i==7 && j.getPosPintaBotoes(i)==1)    //quando o i Ã© 7 altera o botao 8
            {
                bt_8.setOpaque(true);
                bt_8.setBackground(Color.red); //coloca cor no botao
            }
            if(i==8 && j.getPosPintaBotoes(i)==1)    //quando o i Ã© 8 altera o botao 9
            {
                bt_9.setOpaque(true);
                bt_9.setBackground(Color.red); //coloca cor no botao
            }
        }
        
    }
    
    //coloca os botoes opacos ou nao
    public void opaque(boolean valor){
        bt_1.setOpaque(valor);
        bt_2.setOpaque(valor);
        bt_3.setOpaque(valor);
        bt_4.setOpaque(valor);
        bt_5.setOpaque(valor);
        bt_6.setOpaque(valor);
        bt_7.setOpaque(valor);
        bt_8.setOpaque(valor);
        bt_9.setOpaque(valor);
    }
           
}
