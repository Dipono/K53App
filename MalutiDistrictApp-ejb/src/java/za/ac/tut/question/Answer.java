//Group 30
//216755634
//218426263

package za.ac.tut.question;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author LEBUTE
 */
@Entity
@Table(name="tblAnswer")
public class Answer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answerID;
    private  Question question;
    private String correctAnswer;

    public Answer() {
    }

    public Answer(Question question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

   

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getAnswerID() {
        return answerID;
    }

    @OneToOne
    @JoinColumn(name="fkQuestionId")
    public Question getQuestion() {
        return question;
    }
    
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
