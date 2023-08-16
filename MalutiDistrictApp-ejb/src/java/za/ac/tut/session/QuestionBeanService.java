/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.session;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.question.Question;

/**
 *
 * @author LEBUTE
 */
@Stateless
public class QuestionBeanService implements QuestionBean {

    @PersistenceContext(unitName = "MalutiDistrictConnect")
    EntityManager entityManager;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void insert(Question question) {
        entityManager.persist(question.getAnswer());
        
        
        entityManager.persist(question.getPossibleAnswers());
        entityManager.flush();
        question.setAnswer(question.getAnswer());
        question.setPossibleAnswers(question.getPossibleAnswers());
        //entityManager.persist(question);

        //Object[] possibleAnswer = question.getPossibleAnswers().toArray();
        //
    }
}
