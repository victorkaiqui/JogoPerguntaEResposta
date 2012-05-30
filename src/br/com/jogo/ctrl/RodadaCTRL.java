/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.ctrl;

import br.com.jogo.dao.PerguntaDAO;
import br.com.jogo.negocio.Pergunta;
import br.com.jogo.view.RodadaVIEW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author VictorKaiqui
 */
public class RodadaCTRL implements ActionListener {

    private RodadaVIEW view;

    public RodadaCTRL(RodadaVIEW view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        verificaSelecionado(e);


        if (e.getSource() == view.getProximoButton()) {
            carregar();
        }

    }

    public void carregar() {
        
        List<Pergunta> perguntas = new PerguntaDAO().selecionarPergunta();

        Random r = new Random();

        int perguntaRandom = r.nextInt(perguntas.size());

        Pergunta p = perguntas.get(perguntaRandom);

        view.getPerguntaTextPane().setText(p.getPergunta());
        view.getRespostaATextField().setText(p.getRespostaA());
        view.getRespostaBTextField().setText(p.getRespostaB());
        view.getRespostaCTextField().setText(p.getRespostaC());
        view.getRespostaDTextField().setText(p.getRespostaD());
        
      if(p.getResposta().equals("A") && view.getAlternativaCertaARadioButton().isSelected()){
          JOptionPane.showConfirmDialog(view, "A");
      }
      if(p.getResposta().equals("B") && view.getAlternativaCertaBRadioButton().isSelected()){
          JOptionPane.showConfirmDialog(view, "B");
      }
      if(p.getResposta().equals("C") && view.getAlternativaCertaCRadioButton().isSelected()){
          JOptionPane.showConfirmDialog(view, "C");
      }
      if(p.getResposta().equals("D") && view.getAlternativaCertaDRadioButton().isSelected()){
          JOptionPane.showConfirmDialog(view, "D");;
      }
    }

    public void verificaSelecionado(ActionEvent e) {

        if (e.getSource() == view.getAlternativaCertaARadioButton()) {
            view.getAlternativaCertaBRadioButton().setSelected(false);
            view.getAlternativaCertaCRadioButton().setSelected(false);
            view.getAlternativaCertaDRadioButton().setSelected(false);
        }
        if (e.getSource() == view.getAlternativaCertaBRadioButton()) {
            view.getAlternativaCertaARadioButton().setSelected(false);
            view.getAlternativaCertaCRadioButton().setSelected(false);
            view.getAlternativaCertaDRadioButton().setSelected(false);
        }
        if (e.getSource() == view.getAlternativaCertaCRadioButton()) {
            view.getAlternativaCertaARadioButton().setSelected(false);
            view.getAlternativaCertaBRadioButton().setSelected(false);
            view.getAlternativaCertaDRadioButton().setSelected(false);
        }
        if (e.getSource() == view.getAlternativaCertaDRadioButton()) {
            view.getAlternativaCertaARadioButton().setSelected(false);
            view.getAlternativaCertaBRadioButton().setSelected(false);
            view.getAlternativaCertaCRadioButton().setSelected(false);
        }

    }
}
