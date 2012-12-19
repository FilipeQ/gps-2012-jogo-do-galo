/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;



/**
 *
 * @author Carlitos
 */
public class Estados{
    Jogo j;
    
    public Estados(Jogo j)
    {
        this.j=j;
        j.getEcra().nVisiveis();
    }

    public Jogo getJ() {
        return j;
    }

    public void setJ(Jogo j) {
        this.j = j;
    }
    
    public void verTop(){};
    public void jogar(){};
}
