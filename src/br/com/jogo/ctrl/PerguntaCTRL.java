/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.ctrl;

import br.com.jogo.dao.PerguntaDAO;
import br.com.jogo.negocio.Pergunta;
import br.com.jogo.view.PerguntasVIEW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VictorKaiqui
 */
public class PerguntaCTRL implements ActionListener {
    
    private PerguntasVIEW view;
    
    public PerguntaCTRL(PerguntasVIEW view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getSalvarButton()) {
        }
    }
    
    public void salvarPegunta() {
        
        Pergunta p = new Pergunta();
        
        p.setPergunta(view.getPerguntaTextPane().getText());
        p.setRespostaA(view.getRespostaATextField().getText());
        p.setRespostaB(view.getRespostaBTextField().getText());
        p.setRespostaC(view.getRespostaCTextField().getText());
        p.setRespostaD(view.getRespostaDTextField().getText());
        PerguntaDAO pDao = new PerguntaDAO();
        pDao.salvarPergunta(p);
        
        
    }
}
