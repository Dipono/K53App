/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.question;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private int fkQuestionI;
    private String correctAnswer;

    public Answer() {
    }

    public Answer(int answerID, int fkQuestionI, String correctAnswer) {
        this.answerID = answerID;
        this.fkQuestionI = fkQuestionI;
        this.correctAnswer = correctAnswer;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public void setFkQuestionI(int fkQuestionI) {
        this.fkQuestionI = fkQuestionI;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getAnswerID() {
        return answerID;
    }

    public int getFkQuestionI() {
        return fkQuestionI;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
