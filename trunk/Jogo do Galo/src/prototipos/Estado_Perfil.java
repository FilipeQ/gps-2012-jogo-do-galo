package prototipos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Estado_Perfil extends Estados {

    public Estado_Perfil(Jogo j,int i) {
        super(j);
        if(i==1)
            j.getEcra().getPrincipal1_panel().setVisible(true);
        else
            j.getEcra().getPrincipal2_panel().setVisible(true);
    }
    
    @Override
    public void jogar(){}
    
    @Override
    public void verTop(){}
    
}
