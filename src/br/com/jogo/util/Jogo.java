/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.util;

import br.com.jogo.view.MainVIEW;

/**
 *
 * @author VictorKaiqui
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
                new MainVIEW().setVisible(true);
            }
        });
    }
}
