package org.launchcode.java.studios.FunWithQuizzes.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studios.FunWithQuizzes.CheckBoxQuestion;
import org.launchcode.java.studios.FunWithQuizzes.MultipleChoiceQuestion;
import org.launchcode.java.studios.FunWithQuizzes.TrueFalseQuestion;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestQuestions {
    MultipleChoiceQuestion multipleChoiceQuestion;
    TrueFalseQuestion TFQuestion;
    CheckBoxQuestion CBQuestion;
    @Before
    public void generateMultipleChoiceQuestion() {
        multipleChoiceQuestion = new MultipleChoiceQuestion("This is the test question?", new ArrayList<>(Arrays.asList("answer1", "answer2", "answer3", "answer4")), new ArrayList<>(Arrays.asList("answer4")));
        TFQuestion = new TrueFalseQuestion("Answer is true", true);
        CBQuestion = new CheckBoxQuestion("This is the test question?", new ArrayList<>(Arrays.asList("answer1", "answer2", "answer3", "answer4")), new ArrayList<>(Arrays.asList("answer4","answer1")));
    }

    @Test
    public void testMultipleChoiceQuestionCorrectAnswer(){
        assertEquals(true,multipleChoiceQuestion.checkAnswer("answer4"));
    }

    @Test
    public void testMultipleChoiceQuestionIncorrectAnswer(){
        assertEquals(false,multipleChoiceQuestion.checkAnswer("answer43"));
    }

    @Test
    public void testTrueFalseQuestionCorrectAnswer(){
        assertEquals(true,TFQuestion.checkAnswer("true"));
    }
    @Test
    public void testTrueFalseQuestionIncorrectAnswer(){
        assertEquals(false,TFQuestion.checkAnswer("false"));
    }
    @Test
    public void testCheckBoxQuestionCorrectAnswer(){
        assertEquals(true,CBQuestion.checkAnswer(("answer1, answer4")));
    }
    @Test
    public void testCheckBoxQuestioninCorrectAnswer(){
        assertEquals(false,CBQuestion.checkAnswer(("answer3, answer4")));
    }
}
