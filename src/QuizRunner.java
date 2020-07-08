import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizRunner {

    public static void main(String[] args) {

        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is the longest that an elephant has ever lived? (That we know of)",
                Arrays.asList("17 years", "49 years", "86 years", "142 years"),
                "86 years");
        BooleanQuestion question2 = new BooleanQuestion("There are 5 rings on the olympic flag.", "true");
        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("How did spiderman get his powers?",
                Arrays.asList("Military experiment gone awry", "Born with them", "Woke up with them after a strange dream", "Bitten by a radioactive spider"),
                "Bitten by a radioactive spider");
        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Which of these animals does NOT appear in the Chinese zodiac?",
                Arrays.asList("Bear", "Rabbit", "Dragon", "Dog"),
                "Bear");
        BooleanQuestion question5 = new BooleanQuestion("In darts, the most you can score in a single throw is 100", "false");
        CheckBoxQuestion question6 = new CheckBoxQuestion("What colors are on the French flag?",
                Arrays.asList("red", "yellow", "black", "blue", "white"),
                Arrays.asList("red", "blue", "white"));
        MultipleChoiceQuestion question7 = new MultipleChoiceQuestion("Who killed Greedo?",
                Arrays.asList("Hannibal Lecter", "Han Solo", "Hermione Granger", "Hercules"),
                "Han Solo");

        List<Question> questions = Arrays.asList(question1, question2, question3, question4, question5, question6, question7);
        Quiz quiz1 = new Quiz("Quiz 1", questions);

        quiz1.startQuiz();

    }

}
