package org.launchcode;

import java.util.Arrays;
import java.util.List;

public class CheckBox extends Question{
    private List<String> correctAnswers;

    public CheckBox(String questionText, List<String> correctAnswers) {
        super(questionText);
        this.correctAnswers = correctAnswers;
    }
    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
    }
    @Override
    public void displayAnswers (){
        System.out.println("Provide a comma separated list of correct answers");
    }
    @Override
    public boolean
    checkAnswer(String answer) {
        List<String> userAnswers = Arrays.asList(answer.split(",\\s*"));
        return this.correctAnswers.equals(userAnswers);
     }
    }

