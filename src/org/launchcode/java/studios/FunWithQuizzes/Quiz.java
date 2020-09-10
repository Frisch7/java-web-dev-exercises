package org.launchcode.java.studios.FunWithQuizzes;


import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<Question>();
    private int questionsCorrect = 0;
    private int questionsWrong = 0;
    Scanner input = new Scanner(System.in);
    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }
    public Quiz(){

    }
    public void addQuestion(Question question){
        questions.add(question);
    }
    public void runQuiz(){
        String userAnswer;
        for (Question question:questions
             ) {
            System.out.println(question.toString());
            System.out.println();
            System.out.println("Answer: ");
            userAnswer = input.nextLine();

            if(question.checkAnswer(userAnswer)){
                questionsCorrect++;
            }else{
                questionsWrong++;
            }
        }

        System.out.println("Correct " + questionsCorrect);
        System.out.println("Wrong " + questionsWrong);
    }
}
