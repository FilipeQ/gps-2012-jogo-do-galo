
package prototipos;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Jogo extends Observable{
    private static final int COLUNAS = 3;//numero de colunas da matriz do galo
    private static final int LINHAS = 3;//numero de linhas da matriz
    private List<Jogador> jogadores;//lista de jogadores que tao para jogar
    private List<Jogador> lstTop3;//lista que vai receber o top3 de jogadores vindos da BD
    private String[] botoes;//vai guardar o valor de cada Botao
    private BD acessoBd;//variavel do tipo BD, para acader a class BD
    private int matrizJogo[][];//matriz de jogo
    private int jogActivo;//guarda o jogador que esta activo
    private Estados estados;//Variavel tipo Estado, acede aos estados
    private Ecra ecra;//acede ao a class Ecra
    private int tipoJog;//guarda se o jogo e co pc ou 2jogadores
    private int guardaFimJogo;//vai guardar o valor de fim do jogo
    private int idVencedor;//vai guardar o id do jogador vencedor
    private int[] pintaBotoes;//variavel que vai receber 1 nas posicoes dos botoes para pintar
    
    public Jogo()
    {
        //Inicializaçao de variaveis
        idVencedor=-1;
        guardaFimJogo=-1;
        jogActivo=0;
        matrizJogo = new int[LINHAS][COLUNAS];
        botoes = new String[LINHAS*COLUNAS];
        pintaBotoes = new int[LINHAS*COLUNAS];
        lstTop3= new ArrayList<>();
        jogadores= new ArrayList<>();
        acessoBd = new BD(this);
        ecra = new Ecra(this);
        ecra.getInicio_panel().setVisible(true);//torna visibel o painel inicial
    }

    //devolve a posicao do index do array
    public int getPosPintaBotoes(int index){
        return pintaBotoes[index];
    }
    
    public int[] getPintaBotoes() {
        return pintaBotoes;
    }

    public void setPosPintaBotoes(int pos){
        pintaBotoes[pos]=1;//1 vai significar que os botoes vao mudar de cor
    }
    
    //inicializa array pintaBotoes
    public void zeraPintaBotoes(){
        for(int i=0;i<pintaBotoes.length;i++)
        {
            pintaBotoes[i]=0;
        }
    }
    
    public int getIdVencedor() {
        return idVencedor;
    }

    public void setIdVencedor(int idVencedor) {
        this.idVencedor = idVencedor;
    }
    
    //actualiza vista
    public void actualizaVista(){
        setChanged();
        notifyObservers();
    }
    
    public int getGuardaFimJogo() {
        return guardaFimJogo;
    }

    public void setGuardaFimJogo(int guardaFimJogo) {
        this.guardaFimJogo = guardaFimJogo;
    }

    public int getTipoJog() {
        return tipoJog;
    }

    public void setTipoJog(int tipoJog) {
        this.tipoJog = tipoJog;
    }

    public int getJogActivo() {
        return jogActivo;
    }

    public void setJogActivo(int jogActivo) {
        this.jogActivo = jogActivo;
    }
    
    public String[] getBotoes() {
        return botoes;
    }

    //vai retornar o valor do botao com o referido index
    public String getBotaoValor(int index){
        return botoes[index];
    }
    
    public void setBotoes(String tipo, int index) {
        botoes[index]=tipo;
    }

    public void inicializaBotoes(){
        for(int i=0;i<botoes.length;i++)
        {
            botoes[i]="";
        }
    }
    
    public void colocaMatrizZeros(){
        for(int i=0;i<COLUNAS;i++)
        {
            for(int j=0;j<LINHAS;j++)
            {
                matrizJogo[i][j]=-1;
            }
        }
    }
    
    public void criaJogadorComputador(){
        Jogador jog = new Jogador("Computador","","",0,"o");
        jogadores.add(jog);  
    }
    
    //vai aceder a funçao jogar dos estado que estiver e actualiza a vista
    public void jogar(){
        getEstados().jogar();
        setChanged();
        notifyObservers();
        
    }
    
    //acede a funçao verTop do respectivo estado
    public void verTop(){
        getEstados().verTop();
    }
    
    public int getValorMatriz(int c, int l){
        return matrizJogo[c][l];
    }
    
    public void setMatrizJogada(int c, int l, int valor_jog){
        matrizJogo[c][l]=valor_jog;
    }
    
    public List<Jogador> getLstTop3() {
        return lstTop3;
    }

    public void setLstTop3(List<Jogador> lstTop3) {
        this.lstTop3 = lstTop3;
    }
    
    public void setJogadorTop(Jogador jog){
        lstTop3.add(jog);
    }
    
    public Jogador getJogadorTop(int index){
        return lstTop3.get(index);
    }
    
    public void limpaTop(){
        lstTop3.clear();
    }
    
    public BD getAcessoBd() {
        
        return acessoBd;
    }

    public void setAcessoBd(BD acessoBd) {
        this.acessoBd = acessoBd;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
    
    public void apagaJogadores(){
        jogadores.clear();
    }
    
    public Jogador getJogador(int index){
        return jogadores.get(index);
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    
    public void setJogador(Jogador jog) {
        jogadores.add(jog);
    }

    public int[][] getMatrizJogo() {
        return matrizJogo;
    }

    public void setMatrizJogo(int[][] matriz_jogo) {
        this.matrizJogo = matriz_jogo;
    }

    public Ecra getEcra() {
        return ecra;
    }

    public void setEcra(Ecra ecra) {
        this.ecra = ecra;
    }
    
    
    
}
