//Group 30
//216755634
//218426263

package za.ac.tut.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.question.Answer;
import za.ac.tut.question.PossibleAnswer;
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
    public void insert(Question question1) {
        Question question = new Question();
        question.setQuestion("What is programming language for oop");
        question.setSignGroup("control sign");
        question.setMark(1);
        question.setIsAnswered(false);

        // possibleAnswer.setPossibleAnswer("Javascript");
        //possibleAnswer.setPossibleAnswer("PHP");
        Answer answer = new Answer();
        answer.setCorrectAnswer("C++");
        answer.setQuestion(question);

        PossibleAnswer possibleAnswer = new PossibleAnswer();
        possibleAnswer.setPossibleAnswer("C++");
        possibleAnswer.setQuestion(question);
        entityManager.persist(possibleAnswer);

        PossibleAnswer possibleAnswer1 = new PossibleAnswer();
        possibleAnswer1.setPossibleAnswer("HTML");
        possibleAnswer1.setQuestion(question);
        entityManager.persist(possibleAnswer1);
//        question.getPossibleAnswers().add(possibleAnswer);
        //       question.getPossibleAnswers().add(possibleAnswer1);
        //entityManager.getTransaction().begin();

        entityManager.persist(answer);
        question.setAnswer(answer);
        //question.setPossibleAnswer((List<PossibleAnswer>) possibleAnswer);
        entityManager.persist(question);
        //entityManager.getTransaction().commit();

        /*entityManager.persist(question.getAnswer());
        
        
        entityManager.persist(question.getPossibleAnswers());
        entityManager.flush();
        question.setAnswer(question.getAnswer());*/
        //question.setPossibleAnswers(question.getPossibleAnswers());
        //entityManager.persist(question);
        //Object[] possibleAnswer = question.getPossibleAnswers().toArray();
        //
    }
}
