/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.ctrl;

import br.com.jogo.negocio.Jogador;
import br.com.jogo.view.JogoVIEW;
import br.com.jogo.view.RodadaVIEW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VictorKaiqui
 */
public class JogoCTRL implements ActionListener {

    private JogoVIEW view;
    private List<Jogador> jogadores = new ArrayList<Jogador>();

    public JogoCTRL(JogoVIEW view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        verificaJogadores(e);
        contaJogadores(e);
        
        if (e.getSource() == view.getJogarButton()) {

            RodadaVIEW r = new RodadaVIEW(view, true);
            r.setVisible(true);

        }

    }

    public void contaJogadores(ActionEvent e) {

        if (view.getJogador1RadioButton().isSelected()) {

            Jogador j1 = new Jogador();
            j1.setId(1);
            j1.setNome(view.getJogador1TextField().getText());
            j1.setPlacar(0);
            jogadores.add(j1);

        }
        if (view.getJogador2RadioButton().isSelected()) {

            Jogador j2 = new Jogador();
            j2.setId(2);
            j2.setNome(view.getJogador2TextField().getText());
            j2.setPlacar(0);
            jogadores.add(j2);

        }
        if (view.getJogador3RadioButton().isSelected()) {

            Jogador j3 = new Jogador();
            j3.setId(3);
            j3.setNome(view.getJogador3TextField().getText());
            j3.setPlacar(0);
            jogadores.add(j3);

        }
        if (view.getJogador4RadioButton().isSelected()) {

            Jogador j4 = new Jogador();
            j4.setId(4);
            j4.setNome(view.getJogador4TextField().getText());
            j4.setPlacar(0);
            jogadores.add(j4);

        }
    }

    public void verificaJogadores(ActionEvent e) {
        if (e.getSource() == view.getJogador1RadioButton()) {
            if (view.getJogador1RadioButton().isSelected()) {
                view.getJogador1TextField().setEnabled(true);
            }
            if (view.getJogador1RadioButton().isSelected() == false) {
                view.getJogador1TextField().setEnabled(false);
            }
        }
        if (e.getSource() == view.getJogador2RadioButton()) {
            if (view.getJogador2RadioButton().isSelected()) {
                view.getJogador2TextField().setEnabled(true);
            }
            if (view.getJogador2RadioButton().isSelected() == false) {
                view.getJogador2TextField().setEnabled(false);
            }
        }
        if (e.getSource() == view.getJogador3RadioButton()) {
            if (view.getJogador3RadioButton().isSelected()) {
                view.getJogador3TextField().setEnabled(true);
            }
            if (view.getJogador3RadioButton().isSelected() == false) {
                view.getJogador3TextField().setEnabled(false);
            }
        }
        if (e.getSource() == view.getJogador4RadioButton()) {
            if (view.getJogador4RadioButton().isSelected()) {
                view.getJogador4TextField().setEnabled(true);
            }
            if (view.getJogador4RadioButton().isSelected() == false) {
                view.getJogador4TextField().setEnabled(false);
            }
        }
    }
}
