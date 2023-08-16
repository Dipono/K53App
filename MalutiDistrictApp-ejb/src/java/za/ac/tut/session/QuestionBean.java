/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
