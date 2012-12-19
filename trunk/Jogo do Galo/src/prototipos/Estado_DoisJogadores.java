
package prototipos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlitos
 */
public class Estado_DoisJogadores extends Estados{
   
    
    Estado_DoisJogadores(Jogo j){
        super(j);
        j.setJogActivo(1);//coloca jogador 2 activo
    }
    
    @Override
    public void jogar(){
        
        int fimJogo;
        
        if(j.getJogadores().get(1).getNome().equalsIgnoreCase("Computador"))//caso seja o pc
        {
            
                computador(j.getMatrizJogo());//joga o pc
        }
        
        fimJogo=verificaFimJogo(j.getMatrizJogo());//vai verificar se o jogo vai terminar ou nao
        
        //caso o final seja ganho pelo jogador2 mete-o na variavel de vencedor
        if(fimJogo==2)
            j.setIdVencedor(j.getJogActivo());
        
        j.setGuardaFimJogo(fimJogo);//guarda o fim do jogo 
              
        j.setEstados(new Estado_UmJogador(j));//muda estado para o outro jogador
        
        
    }
    
    @Override
    public void verTop(){}
    
    
    
    public void computador(int m[][]){
       //vai criar uma jogada para o computador
        for(int i=0;i<3;i++)
            for(int l=0;l<3;l++)//mudar variavel do ciclo j e n passar o jj 
                if(m[i][l]==-1)
                {
                    m[i][l]=2;//colaca 2 porque e o numero do jogador PC que e o jogador 2
                    j.setBotoes(j.getJogadores().get(1).getTipo(), (i*3)+(l));//coloca no array de botoes o tipo de jogada que efectuou
                    j.setMatrizJogada(i, l, 2);//coloca a jogada na matriz
                    return;
                }
    }
    
    public int verificaFimJogo(int m[][]){
        int valor;
        
        for(int i=0;i<3;i++) //verifica se alguem ganhou nas linhas e devolve o numero do jogador que ganhou
        {
            if(m[i][0]!=-1)
                valor=m[i][0];//recebe o valor da primeira posição caso estaja preenchida se estiver vazia(-1) dá ao valor um numero diferente de 1 ou 2 ou -1
            else
                valor=55;
                      
                if(m[i][0]==valor && m[i][1]==valor && m[i][2]==valor)//caso todos coincidam devolve o valor
                {
                    //vai guardar nas posicoes certas dos botoes que fizeram a sequencia de 3
                    j.setPosPintaBotoes((i*3)+(0));
                    j.setPosPintaBotoes((i*3)+(1));
                    j.setPosPintaBotoes((i*3)+(2));
                    return valor;
                }
            
        }
        
        for(int i=0;i<3;i++) //verifica se alguem ganhou nas colunas e devolve o numero do jogador que ganhou
        {
            if(m[0][i]!=-1)
                valor=m[0][i];//recebe o valor da primeira posição caso estaja preenchida se estiver vazia(-1) dá ao valor um numero diferente de 1 ou 2 ou -1
            else
                valor=55;
             
                if(m[0][i]==valor && m[1][i]==valor && m[2][i]==valor)
                {
                    j.setPosPintaBotoes((0*3)+(i));
                    j.setPosPintaBotoes((1*3)+(i));
                    j.setPosPintaBotoes((2*3)+(i));
                    return valor;
                }
            
        }
        
        //vai ser verificado as diagonais
        if(m[0][0]!=-1)//recebe o valor da primeira posição caso estaja preenchida se estiver vazia(-1) dá ao valor um numero diferente de 1 ou 2 ou -1
            valor=m[0][0];
        else
            valor=55;
       
        if(m[0][0]==valor && m[1][1]==valor && m[2][2]==valor)//verifica se ganha nas diagonais
        {
            j.setPosPintaBotoes((0*3)+(0));
            j.setPosPintaBotoes((1*3)+(1));
            j.setPosPintaBotoes((2*3)+(2));
            return valor;
        }
        
        if(m[2][0]!=-1)//recebe o valor da primeira posição caso estaja preenchida se estiver vazia(-1) dá ao valor um numero diferente de 1 ou 2 ou -1
            valor=m[2][0];
        else
            valor=55;
        
        if(m[2][0]==valor && m[1][1]==valor && m[0][2]==valor)
        {
            j.setPosPintaBotoes((2*3)+(0));
            j.setPosPintaBotoes((1*3)+(1));
            j.setPosPintaBotoes((0*3)+(2));
            return valor;
        }
        
        //verifica se o tabuleiro esta todo completo ou nao, se estiver vai devolver o 3 senao devolve -1 e segue o jogo
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(m[i][j]==-1)
                    return -1;// devolve -1 se nimguem ganhou e ainda se pode continuar a jogar
        
        return 3;// devolve 3 se empatarem e o jogo acabou
    }
}
