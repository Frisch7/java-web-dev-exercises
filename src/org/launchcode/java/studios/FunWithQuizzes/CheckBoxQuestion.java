package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;

public class CheckBoxQuestion extends Question{

    public CheckBoxQuestion(String questionText, ArrayList<String> possibleAnswers, ArrayList<String> correctAnswers) {
        super(questionText, possibleAnswers, correctAnswers);
    }



    @Override
    public boolean checkAnswer(String answer) {
        String[] answerArray = answer.split(",");
        ArrayList<String> trimmedAnswerArrayList = new ArrayList<String>();
        for(int i = 0; i < answerArray.length; i++){
            trimmedAnswerArrayList.add(answerArray[i].trim());
        }
        for (String ans: trimmedAnswerArrayList
             ) {
            if(!getCorrectAnswers().contains(ans)){
                return false;
            }
        }
        return true;
    }
}
