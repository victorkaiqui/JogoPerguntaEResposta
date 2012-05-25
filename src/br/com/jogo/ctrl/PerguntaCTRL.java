/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.ctrl;

import br.com.jogo.dao.PerguntaDAO;
import br.com.jogo.negocio.Pergunta;
import br.com.jogo.view.PerguntaVIEW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VictorKaiqui
 */
public class PerguntaCTRL implements ActionListener {
    
    private PerguntaVIEW view;
    
    public PerguntaCTRL(PerguntaVIEW view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getSalvarButton()) {
            salvarPegunta();
        }
    }
    
    public void salvarPegunta() {
        
        Pergunta p = new Pergunta();
        
        p.setPergunta(view.getPerguntaTextPane().getText());
        p.setRespostaA(view.getRespostaATextField().getText());
        p.setRespostaB(view.getRespostaBTextField().getText());
        p.setRespostaC(view.getRespostaCTextField().getText());
        p.setRespostaD(view.getRespostaDTextField().getText());
        
        if (view.getAlternativaCertaARadioButton().isSelected()) {
            p.setResposta("A");
        }
        if (view.getAlternativaCertaBRadioButton().isSelected()) {
            p.setResposta("B");
        }
        if (view.getAlternativaCertaCRadioButton().isSelected()) {
            p.setResposta("C");
        }
        if (view.getAlternativaCertaDRadioButton().isSelected()) {
            p.setResposta("D");
        }
        
        PerguntaDAO pDao = new PerguntaDAO();
        pDao.salvarPergunta(p);
        
    }
}
