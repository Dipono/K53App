//Group 30
//216755634
//218426263

package za.ac.tut.question;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author LEBUTE
 */
@Entity
@Table(name = "tblQuestion")
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionID;
    private String question;
    private String signGroup;
    private int mark;
    private boolean isAnswered;
    //@OneToMany(mappedBy = "possibleAnswer", cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "ps_id", referencedColumnName = "questionID")
    private List<PossibleAnswer> possibleAnswer;
    private Answer answer;

    public Question() {
    }

    public Question(String question, String signGroup, int mark, boolean isAnswered, PossibleAnswer possibleAnswers, Answer answer) {
        this.question = question;
        this.signGroup = signGroup;
        this.mark = mark;
        this.isAnswered = isAnswered;
        // this.possibleAnswers = (List<PossibleAnswer>) possibleAnswers;
        this.answer = answer;
    }

    public void setQuestion(String question, String signGroup, int mark, boolean isAnswered, PossibleAnswer possibleAnswers, Answer answer) {
        this.question = question;
        this.signGroup = signGroup;
        this.mark = mark;
        this.isAnswered = isAnswered;
        //this.possibleAnswers = (List<PossibleAnswer>) possibleAnswers;
        this.answer = answer;
    }

    public int getQuestionID() {
        return questionID;
    }

    public String getQuestion() {
        return question;
    }

    public String getSignGroup() {
        return signGroup;
    }

    public int getMark() {
        return mark;
    }

    public boolean isIsAnswered() {
        return isAnswered;
    }

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true )
    public List<PossibleAnswer> getPossibleAnswers() {
        return possibleAnswer;
    }
    @OneToOne(mappedBy = "answer", cascade = CascadeType.ALL)
    public Answer getAnswer() {
        return answer;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setSignGroup(String signGroup) {
        this.signGroup = signGroup;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public void setPossibleAnswer(List<PossibleAnswer> possibleAnswer) {
        this.possibleAnswer = possibleAnswer;
    }
    
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
