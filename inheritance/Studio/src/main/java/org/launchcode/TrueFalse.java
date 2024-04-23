package org.launchcode;

public class TrueFalse extends Question {
    private boolean correctAnswer;
    public TrueFalse (String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }
    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
    }
    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }
    @Override
    public boolean checkAnswer(String answer) {
        return Boolean.parseBoolean(answer) == this.correctAnswer;
    }
}
