/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.view;

import br.com.jogo.ctrl.PerguntaCTRL;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author VictorKaiqui
 */
public class PerguntasVIEW extends javax.swing.JFrame {

    /**
     * Creates new form PerguntasVIEW
     */
    PerguntaCTRL controle;

    public PerguntasVIEW() {
        initComponents();

        controle = new PerguntaCTRL(this);
        SalvarButton.addActionListener(controle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        perguntaTextPane = new javax.swing.JTextPane();
        ALabel = new javax.swing.JLabel();
        BLabel = new javax.swing.JLabel();
        CLabel = new javax.swing.JLabel();
        DLabel = new javax.swing.JLabel();
        respostaATextField = new javax.swing.JTextField();
        respostaBTextField = new javax.swing.JTextField();
        respostaCTextField = new javax.swing.JTextField();
        respostaDTextField = new javax.swing.JTextField();
        alternativaCertaARadioButton = new javax.swing.JRadioButton();
        alternativaCertaBRadioButton = new javax.swing.JRadioButton();
        alternativaCertaCRadioButton = new javax.swing.JRadioButton();
        alternativaCertaDRadioButton = new javax.swing.JRadioButton();
        SalvarButton = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(perguntaTextPane);

        ALabel.setText("A)");

        BLabel.setText("B)");

        CLabel.setText("C)");

        DLabel.setText("D)");

        SalvarButton.setText("Salvar pergunta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(DLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(respostaDTextField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(respostaCTextField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ALabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(respostaATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(respostaBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(alternativaCertaARadioButton)
                                .addComponent(alternativaCertaBRadioButton)
                                .addComponent(alternativaCertaCRadioButton)
                                .addComponent(alternativaCertaDRadioButton)))
                        .addComponent(SalvarButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ALabel)
                            .addComponent(respostaATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(alternativaCertaARadioButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BLabel)
                            .addComponent(respostaBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(alternativaCertaBRadioButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CLabel)
                            .addComponent(respostaCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(alternativaCertaCRadioButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(alternativaCertaDRadioButton)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DLabel)
                            .addComponent(respostaDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                    .addComponent(SalvarButton)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PerguntasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PerguntasVIEW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALabel;
    private javax.swing.JLabel BLabel;
    private javax.swing.JLabel CLabel;
    private javax.swing.JLabel DLabel;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JRadioButton alternativaCertaARadioButton;
    private javax.swing.JRadioButton alternativaCertaBRadioButton;
    private javax.swing.JRadioButton alternativaCertaCRadioButton;
    private javax.swing.JRadioButton alternativaCertaDRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane perguntaTextPane;
    private javax.swing.JTextField respostaATextField;
    private javax.swing.JTextField respostaBTextField;
    private javax.swing.JTextField respostaCTextField;
    private javax.swing.JTextField respostaDTextField;
    // End of variables declaration//GEN-END:variables

    public JButton getSalvarButton() {
        return SalvarButton;
    }

    public void setSalvarButton(JButton SalvarButton) {
        this.SalvarButton = SalvarButton;
    }

    public JRadioButton getAlternativaCertaARadioButton() {
        return alternativaCertaARadioButton;
    }

    public void setAlternativaCertaARadioButton(JRadioButton alternativaCertaARadioButton) {
        this.alternativaCertaARadioButton = alternativaCertaARadioButton;
    }

    public JRadioButton getAlternativaCertaBRadioButton() {
        return alternativaCertaBRadioButton;
    }

    public void setAlternativaCertaBRadioButton(JRadioButton alternativaCertaBRadioButton) {
        this.alternativaCertaBRadioButton = alternativaCertaBRadioButton;
    }

    public JRadioButton getAlternativaCertaCRadioButton() {
        return alternativaCertaCRadioButton;
    }

    public void setAlternativaCertaCRadioButton(JRadioButton alternativaCertaCRadioButton) {
        this.alternativaCertaCRadioButton = alternativaCertaCRadioButton;
    }

    public JRadioButton getAlternativaCertaDRadioButton() {
        return alternativaCertaDRadioButton;
    }

    public void setAlternativaCertaDRadioButton(JRadioButton alternativaCertaDRadioButton) {
        this.alternativaCertaDRadioButton = alternativaCertaDRadioButton;
    }

    public JTextPane getPerguntaTextPane() {
        return perguntaTextPane;
    }

    public void setPerguntaTextPane(JTextPane perguntaTextPane) {
        this.perguntaTextPane = perguntaTextPane;
    }

    public JTextField getRespostaATextField() {
        return respostaATextField;
    }

    public void setRespostaATextField(JTextField respostaATextField) {
        this.respostaATextField = respostaATextField;
    }

    public JTextField getRespostaBTextField() {
        return respostaBTextField;
    }

    public void setRespostaBTextField(JTextField respostaBTextField) {
        this.respostaBTextField = respostaBTextField;
    }

    public JTextField getRespostaCTextField() {
        return respostaCTextField;
    }

    public void setRespostaCTextField(JTextField respostaCTextField) {
        this.respostaCTextField = respostaCTextField;
    }

    public JTextField getRespostaDTextField() {
        return respostaDTextField;
    }

    public void setRespostaDTextField(JTextField respostaDTextField) {
        this.respostaDTextField = respostaDTextField;
    }
}
