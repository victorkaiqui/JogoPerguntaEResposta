/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.negocio;

/**
 *
 * @author VictorKaiqui
 */
public class Jogador {

    private int id;
    private String nome;
    private int placar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }
}
