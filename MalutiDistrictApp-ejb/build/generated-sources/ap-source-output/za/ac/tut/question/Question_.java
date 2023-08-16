package za.ac.tut.question;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.question.Answer;
import za.ac.tut.question.PossibleAnswer;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-15T23:44:01")
@StaticMetamodel(Question.class)
public class Question_ { 

    public static volatile SingularAttribute<Question, Integer> questionID;
    public static volatile SingularAttribute<Question, String> question;
    public static volatile SingularAttribute<Question, Answer> answer;
    public static volatile SingularAttribute<Question, Boolean> isAnswered;
    public static volatile SingularAttribute<Question, String> signGroup;
    public static volatile ListAttribute<Question, PossibleAnswer> possibleAnswers;
    public static volatile SingularAttribute<Question, Integer> mark;

}