package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class TrueFalseQuestion extends Question{
    public TrueFalseQuestion(String questionText, boolean answer) {
        super(questionText, new ArrayList<>(Arrays.asList("True", "False")), new ArrayList<>(Arrays.asList()));
        ArrayList<String> possibleAnswers = new ArrayList<>(Arrays.asList("True", "False"));
        ArrayList<String> correctAnswers;
        if(answer){
            setCorrectAnswers(new ArrayList<>(Arrays.asList("true")));
        }else {
            setCorrectAnswers(new ArrayList<>(Arrays.asList("false")));
        }


    }

    @Override
    public boolean checkAnswer(String answer) {
        if(getCorrectAnswers().contains(answer.toLowerCase())) {
            return true;
        }
        return false;

    }


}
