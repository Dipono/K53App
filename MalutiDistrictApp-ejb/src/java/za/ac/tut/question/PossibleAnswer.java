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
    private String possibleAnswer1;
    private String possibleAnswer2;
    private String possibleAnswer3;
    private String possibleAnswer4;

    public PossibleAnswer() {
    }

    public PossibleAnswer(int possibleAnswerID, int FKquestionID, String possibleAnswer1, String possibleAnswer2, String possibleAnswer3, String possibleAnswer4) {
        this.possibleAnswerID = possibleAnswerID;
        this.FKquestionID = FKquestionID;
        this.possibleAnswer1 = possibleAnswer1;
        this.possibleAnswer2 = possibleAnswer2;
        this.possibleAnswer3 = possibleAnswer3;
        this.possibleAnswer4 = possibleAnswer4;

    }

    public int getPossibleAnswerID() {
        return possibleAnswerID;
    }

    public int getFKquestionID() {
        return FKquestionID;
    }

    public String getPossibleAnswer1() {
        return possibleAnswer1;
    }

    public String getPossibleAnswer2() {
        return possibleAnswer2;
    }

    public String getPossibleAnswer3() {
        return possibleAnswer3;
    }

    public String getPossibleAnswer4() {
        return possibleAnswer4;
    }

    public void setPossibleAnswerID(int possibleAnswerID) {
        this.possibleAnswerID = possibleAnswerID;
    }

    public void setFKquestionID(int FKquestionID) {
        this.FKquestionID = FKquestionID;
    }

    public void setPossibleAnswer1(String possibleAnswer1) {
        this.possibleAnswer1 = possibleAnswer1;
    }

    public void setPossibleAnswer2(String possibleAnswer2) {
        this.possibleAnswer2 = possibleAnswer2;
    }

    public void setPossibleAnswer3(String possibleAnswer3) {
        this.possibleAnswer3 = possibleAnswer3;
    }

    public void setPossibleAnswer4(String possibleAnswer4) {
        this.possibleAnswer4 = possibleAnswer4;
    }
}
