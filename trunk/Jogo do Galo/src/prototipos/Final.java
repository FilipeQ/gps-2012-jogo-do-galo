/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Final extends Thread{
    private Jogo j;
    
    public Final(Jogo j) {
        this.j=j;
    }
    
    @Override
    public void run() {
        try {
            this.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //vai dispultar os paneis respectivos
        if(j.getGuardaFimJogo()!=3)// vitoria
        {
            j.getEcra().criaVitoria();
            j.getEcra().getJogo_panel().setVisible(false);
            j.getEcra().getVit_panel().setVisible(true);
        }
        else//empate
        {
            j.getEcra().criaEmpatePanel();
            j.getEcra().getJogo_panel().setVisible(false);
            j.getEcra().getEmp_panel().setVisible(true);
        }
        j.setGuardaFimJogo(-1);//coloca o fim do jogo a -1
        j.colocaMatrizZeros();//limpa matriz, coloca a -1 toda a matriz
        j.inicializaBotoes();//limpa array com os valores dos botoes
        j.actualizaVista();//vai actualizar o ecra
        
    }
}
