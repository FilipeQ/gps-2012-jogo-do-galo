/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

/**
 *
 * @author Carlitos
 */
public class Jogador {
    String nome;
    String pw;
    String imagem;
    int ganhos;
    String tipo;//X ou O

    public Jogador(String nome, String pw, String imagem,int ganhos,String tipo) {
        this.nome = nome;
        this.pw = pw;
        this.imagem = imagem;
        this.ganhos=ganhos;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getGanhos() {
        return ganhos;
    }

    public void setGanhos(int ganhos) {
        this.ganhos = ganhos;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    
}
