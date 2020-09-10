package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {

        MultipleChoiceQuestion multipleChoiceQuestion;
        TrueFalseQuestion TFQuestion;
        CheckBoxQuestion CBQuestion;

        multipleChoiceQuestion = new MultipleChoiceQuestion("What color is the sky?", new ArrayList<>(Arrays.asList("red", "blue", "green", "purple")), new ArrayList<>(Arrays.asList("blue")));
        TFQuestion = new TrueFalseQuestion("True or False? The sky is blue.", true);
        CBQuestion = new CheckBoxQuestion("Select all the Car makers", new ArrayList<>(Arrays.asList("ford", "tesla", "apple", "netflix")), new ArrayList<>(Arrays.asList("ford","tesla")));

        Quiz quiz = new Quiz();
        quiz.addQuestion(multipleChoiceQuestion);
        quiz.addQuestion(TFQuestion);
        quiz.addQuestion(CBQuestion);

        quiz.runQuiz();
    }
}
