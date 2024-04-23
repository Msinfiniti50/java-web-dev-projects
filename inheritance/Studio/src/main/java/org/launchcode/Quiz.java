package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.launchcode.TrueFalse;


public class Quiz {
 private List<Question> questions = new ArrayList<>();
 public void addQuestion(Question question) {
        questions.add(question);
    }
    public void runQuiz(){
  for (Question question : questions) {
   question.displayQuestion();
  }
    }

Quiz quiz = new Quiz();
List<String> choices1 = Arrays.asList("getter", "setter(true)" , "constructor", "property");
quiz.addQuestion(new MultipleChoiceQuestion("What is a method that is used to give a private field a value?", choices1,"setters"));
List<String> choices2 = Arrays.asList("Constructors", "Encapsulation", "Single Responsibility Principle(true)", "Methods.");
quiz.addQuestion(new MultipleChoiceQuestion("Which of these things do JavaScript and Java NOT have in common?", choices2, "Methods."));
List<String>choices3 = Arrays.asList("Confuse IntelliJ with VS Code", "refer to methods as Functions(true)", "mistake ReactJS for AngularJS");
 quiz.addQuestion(new MultipleChoiceQuestion("Be prepared to receive a vocabulary lesson from veteran Java coders specifically if you accidentally: ",choices3,"refer to methods as Functions"));

 List<String> answers1 = Arrays.asList("No need to update IntelliJ settings if you change your GitHub password.(true)", "It authenticates your GitHub account (true)", "It's a quick and easy extra step (true)", "GitHub will send you rewards");
 quiz.addQuestion(new CheckBox("Why should you authenticate your GitHub account using a token?", answers1));
 List<String> answers2 = Arrays.asList(".next()(true)", ".nextLine()(true)", "hasNext()", "nextFloat()");
 quiz.addQuestion(new CheckBox("Which of the following Scanner methods should you to return an expected String input?", answers2));
List<String> answers3 = Arrays.asList("declaring and initializing your variables in the same line", "The practice of shielding your code from outside influences(true)", "naming every class with the same letter", "a pillar of object-oriented programming (true)");
 quiz.addQuestion(new CheckBox("Encapsulation refers to:", answers3));

 quiz.addQuestion(new TrueFalse("Fields and methods are members of a class.",true));
 quiz.addQuestion(new TrueFalse("Any function that is named the same as the class and has no return type is a constructor.",true));
 quiz.addQuestion(new TrueFalse("Every Class must have a Constructor.",false));
 quiz.runQuiz();

    }
}