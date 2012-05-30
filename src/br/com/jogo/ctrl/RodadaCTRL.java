/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.ctrl;

import br.com.jogo.dao.PerguntaDAO;
import br.com.jogo.negocio.Jogador;
import br.com.jogo.negocio.Pergunta;
import br.com.jogo.view.JogoVIEW;
import br.com.jogo.view.RodadaVIEW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

/**
 *
 * @author VictorKaiqui
 */
public class RodadaCTRL implements ActionListener {

    private RodadaVIEW view;
    private Pergunta p;
    private int proximoJogador = 1;
    private int rodada;
    private List<Jogador> jogadores;
    private Jogador jogadorAtual;

    public RodadaCTRL(RodadaVIEW view, List<Jogador> jogadores) {
        this.view = view;
        this.jogadores = jogadores;
        carregarPergunta();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        verificaSelecionado(e);

        if (e.getSource() == view.getProximoButton()) {
            verificaResposta(p);
            carregarPergunta();
        }

    }

    public void carregarPergunta() {

        List<Pergunta> perguntas = new PerguntaDAO().selecionarPergunta();

        Random r = new Random();

        int perguntaRandom = r.nextInt(perguntas.size());

        jogadorAtual = proximoJogador();
        view.setTitle(jogadorAtual.getNome());

        p = perguntas.get(perguntaRandom);
        view.getPerguntaTextPane().setText(p.getPergunta());
        view.getRespostaATextField().setText(p.getRespostaA());
        view.getRespostaBTextField().setText(p.getRespostaB());
        view.getRespostaCTextField().setText(p.getRespostaC());
        view.getRespostaDTextField().setText(p.getRespostaD());

    }

    private Jogador proximoJogador() {
        if (proximoJogador > jogadores.size()) {
            proximoJogador = 1;
        }
        return jogadores.get(proximoJogador++ - 1);

    }

    public void verificaResposta(Pergunta p) {

        if (p.getResposta().equals("A") && view.getAlternativaCertaARadioButton().isSelected()) {
            System.out.println("A");
            jogadorAtual.incrementaPlacar();
        }
        if (p.getResposta().equals("B") && view.getAlternativaCertaBRadioButton().isSelected()) {
            System.out.println("B");
            jogadorAtual.incrementaPlacar();
        }
        if (p.getResposta().equals("C") && view.getAlternativaCertaCRadioButton().isSelected()) {
            jogadorAtual.incrementaPlacar();
        }
        if (p.getResposta().equals("D") && view.getAlternativaCertaDRadioButton().isSelected()) {
            jogadorAtual.incrementaPlacar();
        }
        JogoVIEW parent = (JogoVIEW) view.getParent();
        parent.getControle().atualizaPlacar();

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

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
