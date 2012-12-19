/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.GroupLayout;
import javax.swing.JFrame;

/**
 *
 * @author Carlos
 */
public class Ecra extends JFrame{
   
    private Inicio_panel inicio_panel;
    private Jogo_panel jogo_panel;
    private Login1_panel login1_panel;
    private Login2_panel login2_panel;
    private Podio_panel podio_panel;
    private Principal1_panel principal1_panel;
    private Principal2_panel principal2_panel;
    private vitoria_panel vit_panel;
    private empate_panel emp_panel;
    
    private Container cp;
    
    private Jogo j;
    
    public Ecra(Jogo j)
    {
        this.j=j;
        setTitle("Jogo do Galo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(1000, 650);
        setVisible(true);
        criarObjectos();
        setLayout(new GroupLayout(cp));
        disporVista();
        nVisiveis();
        
    }

    

    public JFrame getFrame()
    {
        return this;
    }
    
    public void criarObjectos()
    {
        cp = getContentPane();
        inicio_panel = new Inicio_panel(j);
        
        login1_panel = new Login1_panel(j);
        login2_panel = new Login2_panel(j);
        
        //principal1_panel = new Principal1_panel(j);
        
        
    }
    
    public void criarPodio_panel()
    {
        podio_panel = new Podio_panel(j);
        cp.add(podio_panel);
        podio_panel.setSize(1000, 650);
    }
    
    public void criarJogo_panel()
    {
        jogo_panel = new Jogo_panel(j);
        cp.add(jogo_panel);
        jogo_panel.setSize(1000, 650);
    }
    
    public void destroiJogoPanel()
    {
        jogo_panel.removeAll();
        cp.remove(jogo_panel);
    }
    
    public void criarPrincipal2()
    {
        principal2_panel = new Principal2_panel(j);
        cp.add(principal2_panel);
        principal2_panel.setSize(1000, 650);
    }
    
    public void criaPrincipal()
    {
        principal1_panel = new Principal1_panel(j);
        cp.add(principal1_panel);
        principal1_panel.setSize(1000, 650);
    }
    
    public void criaVitoria()
    {
        vit_panel = new vitoria_panel(j);
        cp.add(vit_panel);
        vit_panel.setSize(1000, 650);
    }
    
    public void criaEmpatePanel()
    {
        emp_panel = new empate_panel(j);
        cp.add(emp_panel);
        emp_panel.setSize(1000, 650);
    }
    
    public void disporVista()
    {
        cp.add(inicio_panel);
        inicio_panel.setSize(1000, 650);
        
        cp.add(login1_panel);
        login1_panel.setSize(1000, 650);
        cp.add(login2_panel);
        login2_panel.setSize(1000, 650);
        
        //cp.add(principal1_panel);
        //principal1_panel.setSize(1000, 650);
        
        
        
    }
    
    public void nVisiveis()
    {
        inicio_panel.setVisible(false);
        //jogo_panel.setVisible(false);
        login1_panel.setVisible(false);
        login2_panel.setVisible(false);
        //podio_panel.setVisible(false);
        //principal1_panel.setVisible(false);
        //principal2_panel.setVisible(false);
    }

    public empate_panel getEmp_panel() {
        return emp_panel;
    }

    public void setEmp_panel(empate_panel emp_panel) {
        this.emp_panel = emp_panel;
    }
 
    public vitoria_panel getVit_panel() {
        return vit_panel;
    }

    public void setVit_panel(vitoria_panel vit_panel) {
        this.vit_panel = vit_panel;
    }

    public Inicio_panel getInicio_panel() {
        return inicio_panel;
    }

    public void setInicio_panel(Inicio_panel inicio_panel) {
        this.inicio_panel = inicio_panel;
    }

    public Jogo_panel getJogo_panel() {
        return jogo_panel;
    }

    public void setJogo_panel(Jogo_panel jogo_panel) {
        this.jogo_panel = jogo_panel;
    }

    public Login1_panel getLogin1_panel() {
        return login1_panel;
    }

    public void setLogin1_panel(Login1_panel login1_panel) {
        this.login1_panel = login1_panel;
    }

    public Login2_panel getLogin2_panel() {
        return login2_panel;
    }

    public void setLogin2_panel(Login2_panel login2_panel) {
        this.login2_panel = login2_panel;
    }

    public Podio_panel getPodio_panel() {
        return podio_panel;
    }

    public void setPodio_panel(Podio_panel podio_panel) {
        this.podio_panel = podio_panel;
    }

    public Principal1_panel getPrincipal1_panel() {
        return principal1_panel;
    }

    public void setPrincipal1_panel(Principal1_panel principal1_panel) {
        this.principal1_panel = principal1_panel;
    }

    public Principal2_panel getPrincipal2_panel() {
        return principal2_panel;
    }

    public void setPrincipal2_panel(Principal2_panel principal2_panel) {
        this.principal2_panel = principal2_panel;
    }
    
    
}
