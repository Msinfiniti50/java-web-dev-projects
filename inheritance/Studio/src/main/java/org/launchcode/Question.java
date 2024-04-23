package org.launchcode;

import java.util.List;
import java.util.Objects;


public abstract class Question {
        protected String  questionText;

        public Question(String questionText) {

            this.questionText = questionText;

        }

        public String getQuestionText() {
            return this.questionText;
        }
        public abstract void displayQuestion();


        public abstract void displayAnswers();
        public abstract boolean checkAnswer(String answer);
    }


