/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author VictorKaiqui
 */
@Entity
public class Pergunta implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String pergunta;
    private String resposta;
    private String respostaA;
    private String respostaB;
    private String respostaC;
    private String respostaD;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getRespostaA() {
        return respostaA;
    }

    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    public String getRespostaB() {
        return respostaB;
    }

    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    public String getRespostaC() {
        return respostaC;
    }

    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

    public String getRespostaD() {
        return respostaD;
    }

    public void setRespostaD(String respostaD) {
        this.respostaD = respostaD;
    }
}
