/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.ctrl;

import br.com.jogo.view.JogoVIEW;
import br.com.jogo.view.MainVIEW;
import br.com.jogo.view.PerguntaVIEW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VictorKaiqui
 */
public class MainCTRL implements ActionListener {

    MainVIEW view;

    public MainCTRL(MainVIEW view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getJogarButton()) {

            JogoVIEW j = new JogoVIEW();
            j.setVisible(true);

        }
        if (e.getSource() == view.getPerguntaButton()) {

            PerguntaVIEW p = new PerguntaVIEW();
            p.setVisible(true);

        }
    }
}
