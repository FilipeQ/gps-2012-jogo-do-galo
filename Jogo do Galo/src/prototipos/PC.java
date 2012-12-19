/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class PC extends Thread{
    Jogo j;
    public PC(Jogo j) {
        this.j=j;
    }

    
    
    @Override
    public void run() {
        try {
            this.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        j.jogar();
    }
    
}
