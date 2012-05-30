/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.view;

import br.com.jogo.ctrl.JogoCTRL;
import javax.swing.*;

/**
 *
 * @author VictorKaiqui
 */
public class JogoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form JogoVIEW
     */
    private JogoCTRL controle;

    public JogoVIEW() {
        initComponents();
        
        controle = new JogoCTRL(this);
        
        jogador1TextField.setEnabled(false);
        jogador2TextField.setEnabled(false);
        jogador3TextField.setEnabled(false);
        jogador4TextField.setEnabled(false);
        
        jogador1RadioButton.addActionListener(controle);
        jogador2RadioButton.addActionListener(controle);
        jogador3RadioButton.addActionListener(controle);
        jogador4RadioButton.addActionListener(controle);
        
        jogarButton.addActionListener(controle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        qtdRodadasLabel = new javax.swing.JLabel();
        qtdRodadasTextField = new javax.swing.JTextField();
        jogador1RadioButton = new javax.swing.JRadioButton();
        jogador1TextField = new javax.swing.JTextField();
        placarLabel = new javax.swing.JLabel();
        placarJogador1Label = new javax.swing.JLabel();
        nomeJogadorLabel = new javax.swing.JLabel();
        placarJogador2Label = new javax.swing.JLabel();
        jogador2RadioButton = new javax.swing.JRadioButton();
        jogador2TextField = new javax.swing.JTextField();
        jogador3RadioButton = new javax.swing.JRadioButton();
        jogador3TextField = new javax.swing.JTextField();
        placarJogador3Label = new javax.swing.JLabel();
        placarJogador4Label = new javax.swing.JLabel();
        jogador4RadioButton = new javax.swing.JRadioButton();
        jogador4TextField = new javax.swing.JTextField();
        jogarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        qtdRodadasLabel.setText("Quantidade de rodadas:");

        jogador1RadioButton.setText("Jogador 1:");

        placarLabel.setText("Placar");

        nomeJogadorLabel.setText("Nome jogador:");

        jogador2RadioButton.setText("Jogador 2:");

        jogador3RadioButton.setText("Jogador 3:");

        jogador4RadioButton.setText("Jogador 4:");

        jogarButton.setText("Começar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jogarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jogador1RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jogador1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jogador2RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jogador2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jogador3RadioButton)
                                .addGap(12, 12, 12)
                                .addComponent(jogador3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placarJogador3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(placarJogador2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(placarJogador1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(placarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jogador4RadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(jogador4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placarJogador4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(qtdRodadasLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(qtdRodadasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(nomeJogadorLabel)))
                    .addContainerGap(162, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(placarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placarJogador1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jogador1RadioButton)
                        .addComponent(jogador1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jogador2RadioButton)
                        .addComponent(jogador2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(placarJogador2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jogador3RadioButton)
                        .addComponent(jogador3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(placarJogador3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jogador4RadioButton)
                        .addComponent(jogador4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(placarJogador4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jogarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtdRodadasLabel)
                        .addComponent(qtdRodadasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(nomeJogadorLabel)
                    .addGap(219, 219, 219)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jogador1RadioButton;
    private javax.swing.JTextField jogador1TextField;
    private javax.swing.JRadioButton jogador2RadioButton;
    private javax.swing.JTextField jogador2TextField;
    private javax.swing.JRadioButton jogador3RadioButton;
    private javax.swing.JTextField jogador3TextField;
    private javax.swing.JRadioButton jogador4RadioButton;
    private javax.swing.JTextField jogador4TextField;
    private javax.swing.JButton jogarButton;
    private javax.swing.JLabel nomeJogadorLabel;
    private javax.swing.JLabel placarJogador1Label;
    private javax.swing.JLabel placarJogador2Label;
    private javax.swing.JLabel placarJogador3Label;
    private javax.swing.JLabel placarJogador4Label;
    private javax.swing.JLabel placarLabel;
    private javax.swing.JLabel qtdRodadasLabel;
    private javax.swing.JTextField qtdRodadasTextField;
    // End of variables declaration//GEN-END:variables

    public JogoCTRL getControle() {
        return controle;
    }
    
    public void setControle(JogoCTRL controle) {
        this.controle = controle;
    }
    
    public JPanel getjPanel1() {
        return jPanel1;
    }
    
    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
    
    public JRadioButton getJogador1RadioButton() {
        return jogador1RadioButton;
    }
    
    public void setJogador1RadioButton(JRadioButton jogador1RadioButton) {
        this.jogador1RadioButton = jogador1RadioButton;
    }
    
    public JTextField getJogador1TextField() {
        return jogador1TextField;
    }
    
    public void setJogador1TextField(JTextField jogador1TextField) {
        this.jogador1TextField = jogador1TextField;
    }
    
    public JRadioButton getJogador2RadioButton() {
        return jogador2RadioButton;
    }
    
    public void setJogador2RadioButton(JRadioButton jogador2RadioButton) {
        this.jogador2RadioButton = jogador2RadioButton;
    }
    
    public JTextField getJogador2TextField() {
        return jogador2TextField;
    }
    
    public void setJogador2TextField(JTextField jogador2TextField) {
        this.jogador2TextField = jogador2TextField;
    }
    
    public JRadioButton getJogador3RadioButton() {
        return jogador3RadioButton;
    }
    
    public void setJogador3RadioButton(JRadioButton jogador3RadioButton) {
        this.jogador3RadioButton = jogador3RadioButton;
    }
    
    public JTextField getJogador3TextField() {
        return jogador3TextField;
    }
    
    public void setJogador3TextField(JTextField jogador3TextField) {
        this.jogador3TextField = jogador3TextField;
    }
    
    public JRadioButton getJogador4RadioButton() {
        return jogador4RadioButton;
    }
    
    public void setJogador4RadioButton(JRadioButton jogador4RadioButton) {
        this.jogador4RadioButton = jogador4RadioButton;
    }
    
    public JTextField getJogador4TextField() {
        return jogador4TextField;
    }
    
    public void setJogador4TextField(JTextField jogador4TextField) {
        this.jogador4TextField = jogador4TextField;
    }
    
    public JButton getJogarButton() {
        return jogarButton;
    }
    
    public void setJogarButton(JButton jogarButton) {
        this.jogarButton = jogarButton;
    }
    
    public JLabel getNomeJogadorLabel() {
        return nomeJogadorLabel;
    }
    
    public void setNomeJogadorLabel(JLabel nomeJogadorLabel) {
        this.nomeJogadorLabel = nomeJogadorLabel;
    }
    
    public JLabel getPlacarJogador1Label() {
        return placarJogador1Label;
    }
    
    public void setPlacarJogador1Label(JLabel placarJogador1Label) {
        this.placarJogador1Label = placarJogador1Label;
    }
    
    public JLabel getPlacarJogador2Label() {
        return placarJogador2Label;
    }
    
    public void setPlacarJogador2Label(JLabel placarJogador2Label) {
        this.placarJogador2Label = placarJogador2Label;
    }
    
    public JLabel getPlacarJogador3Label() {
        return placarJogador3Label;
    }
    
    public void setPlacarJogador3Label(JLabel placarJogador3Label) {
        this.placarJogador3Label = placarJogador3Label;
    }
    
    public JLabel getPlacarJogador4Label() {
        return placarJogador4Label;
    }
    
    public void setPlacarJogador4Label(JLabel placarJogador4Label) {
        this.placarJogador4Label = placarJogador4Label;
    }
    
    public JLabel getPlacarLabel() {
        return placarLabel;
    }
    
    public void setPlacarLabel(JLabel placarLabel) {
        this.placarLabel = placarLabel;
    }
    
    public JLabel getQtdRodadasLabel() {
        return qtdRodadasLabel;
    }
    
    public void setQtdRodadasLabel(JLabel qtdRodadasLabel) {
        this.qtdRodadasLabel = qtdRodadasLabel;
    }
    
    public JTextField getQtdRodadasTextField() {
        return qtdRodadasTextField;
    }
    
    public void setQtdRodadasTextField(JTextField qtdRodadasTextField) {
        this.qtdRodadasTextField = qtdRodadasTextField;
    }
}
