package org.launchcode;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class MultipleChoiceQuestion extends Question{
    private List<String> choices;
    private String correctAnswer;

 public MultipleChoiceQuestion(String questionText, List<String> choices, String correctAnswer) {
     super(questionText);
     this.choices = choices;
     this.correctAnswer = correctAnswer;
 }
 @Override
public void displayQuestion (){
 System.out.println(this.getQuestionText());
 }
 @Override
    public void displayAnswers() {
        for (int i = 0; i < this.choices.size(); i++) {
            System.out.println((i+1) + ": " + this.choices.get(i));
        }}
    @Override
public boolean checkAnswer(String answer) {
 return this.correctAnswer.equals(answer);
 }
}

