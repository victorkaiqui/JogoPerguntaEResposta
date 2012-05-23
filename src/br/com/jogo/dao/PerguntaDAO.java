/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.dao;

import br.com.jogo.negocio.Pergunta;
import br.com.jogo.util.PersistenceUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author VictorKaiqui
 */
public class PerguntaDAO {

    public void salvarPergunta(Pergunta pergunta) {
        
        EntityManager em = PersistenceUtil.getUtil().obter().createEntityManager();

        em.getTransaction().begin();
        em.merge(pergunta);
        em.getTransaction().commit();

    }
}
