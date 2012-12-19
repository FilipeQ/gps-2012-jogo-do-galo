/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

/**
 *
 * @author Carlitos
 */
public class Estado_VerTop extends Estados{
    
    
    Estado_VerTop(Jogo j)
    {
        super(j);
        //j.getEcra().getPrincipal1_panel().setVisible(false);
        
    }
    
    
    @Override
    public void verTop()
    {
        j.getAcessoBd().top3();
        j.getEcra().criarPodio_panel();
    }
    
    @Override
    public void jogar(){}
    
}
