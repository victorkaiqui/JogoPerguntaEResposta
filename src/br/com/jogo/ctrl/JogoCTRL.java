/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.ctrl;

import br.com.jogo.view.JogoVIEW;
import br.com.jogo.view.RodadaVIEW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VictorKaiqui
 */
public class JogoCTRL implements ActionListener {

    JogoVIEW view;

    public JogoCTRL(JogoVIEW view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        verificaJogadores(e);

        if (e.getSource() == view.getJogarButton()) {

            RodadaVIEW r = new RodadaVIEW(view, true);
            r.setVisible(true);

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
