package za.ac.tut.question;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-15T23:44:01")
@StaticMetamodel(Answer.class)
public class Answer_ { 

    public static volatile SingularAttribute<Answer, Integer> answerID;
    public static volatile SingularAttribute<Answer, Integer> fkQuestionI;
    public static volatile SingularAttribute<Answer, String> correctAnswer;

}