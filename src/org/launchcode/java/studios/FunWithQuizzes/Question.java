package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;

public abstract class Question {
    private int id;
    private static int nextId = 1;
    private String questionText;
    private ArrayList<String> possibleAnswers;
    private ArrayList<String> correctAnswers;
    private ArrayList<String> submittedAnswers;

    public Question(String questionText, ArrayList<String> possibleAnswers, ArrayList<String> correctAnswers){
        this.correctAnswers = correctAnswers;
        this.questionText = questionText;
        this.possibleAnswers = possibleAnswers;
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getSubmittedAnswers() {
        return submittedAnswers;
    }

    public void setSubmittedAnswers(ArrayList<String> submittedAnswers) {
        this.submittedAnswers = submittedAnswers;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    private String returnListofPossibleAnswers(){
        String listofPossibleAnswers = "";
        for(int i = 0; i<getPossibleAnswers().size(); i++){
            listofPossibleAnswers =  listofPossibleAnswers + (i+1) + ". " + getPossibleAnswers().get(i) + "\n";
        }
        return listofPossibleAnswers;
    }

    public abstract boolean checkAnswer(String answer);

    @Override
    public String toString() {
        return "Question " + this.getId()  + ".) " +
                this.getQuestionText() +"\n"+ returnListofPossibleAnswers();

    }
}
