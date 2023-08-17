//Group 30
//216755634
//218426263

package za.ac.tut.session;

import javax.ejb.Local;
import za.ac.tut.question.PossibleAnswer;
import za.ac.tut.question.Question;

/**
 *
 * @author LEBUTE
 */
@Local
public interface QuestionBean {
    public void insert(Question question);
}
