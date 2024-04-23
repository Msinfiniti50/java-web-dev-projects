package org.launchcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizRunner {
    private List<Question> questions;

    private int score;
    private boolean isQuizTaken;
    private Scanner scanner;

    public QuizRunner() {
        questions = new ArrayList<>();
        isQuizTaken = false;
        score = 0;
        scanner = new Scanner(System.in);



}
   public void runQuiz() {
       score = 0;
       isQuizTaken = true;

       for (Question question : questions) {
           question.displayQuestion();
           String userAnswer = getUserAnswer();
           if (question.checkAnswer(userAnswer)) {
               score++;
       }
       }
    }


      }
      private String getUserAnswer(){

         System.out.println("Choose wisely, enter your choice: ");
         return scanner.nextLine();
         }
public static void main(String[] args) {
    QuizRunner quiz = new QuizRunner();
    quiz.addQuestion(new)
}


