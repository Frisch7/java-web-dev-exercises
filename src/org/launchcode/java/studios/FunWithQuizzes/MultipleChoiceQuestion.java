package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{
    public MultipleChoiceQuestion(String questionText, ArrayList<String> possibleAnswers, ArrayList<String> correctAnswers) {

        super(questionText, possibleAnswers, correctAnswers);


    }



    public boolean checkAnswer(String answer){
        if(getCorrectAnswers().contains(answer)) {
            return true;
        }
        return false;

    }
}
