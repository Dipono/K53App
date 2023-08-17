package za.ac.tut.question;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.question.Question;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-16T23:29:47")
@StaticMetamodel(PossibleAnswer.class)
public class PossibleAnswer_ { 

    public static volatile SingularAttribute<PossibleAnswer, Integer> possibleAnswerID;
    public static volatile SingularAttribute<PossibleAnswer, Integer> FKquestionID;
    public static volatile SingularAttribute<PossibleAnswer, Question> question;
    public static volatile SingularAttribute<PossibleAnswer, String> possibleAnswer;

}