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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LEBUTE
 */
@Entity
@Table(name = "tblPossibleAnswer")
public class PossibleAnswer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int possibleAnswerID;
    private int FKquestionID;
    private Question question;
    private String possibleAnswer;
//    private String possibleAnswer1;
//    private String possibleAnswer2;
//    private String possibleAnswer3;
//    private String possibleAnswer4;

    public PossibleAnswer() {
    }

    public PossibleAnswer(Question question, String possibleAnswer) {
        this.question = question;
        this.possibleAnswer = possibleAnswer;
    }
    
    public int getPossibleAnswerID() {
        return possibleAnswerID;
    }

    @ManyToOne
    @JoinColumn(name="FKquestionID")
    public Question getQuestion() {
        return question;
    }
    
    public String getPossibleAnswer() {
        return possibleAnswer;
    }

    public void setPossibleAnswerID(int possibleAnswerID) {
        this.possibleAnswerID = possibleAnswerID;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    
    public void setPossibleAnswer(String possibleAnswer) {
        this.possibleAnswer = possibleAnswer;
    }

    
}
