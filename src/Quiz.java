import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private String name;
    private List<Question> questions;
    private double correctAnswers = 0;

    public Quiz(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    public void preliminaryQuestions() {
        Scanner scan = new Scanner(System.in);

        System.out.println("To ensure you understand the rules there will be 3 questions that do not count towards your grade. Press ENTER to continue...");
        scan.nextLine();

        MultipleChoiceQuestion testQuestion1 = new MultipleChoiceQuestion("The type of question is indicated by the text in brackets to the left of the question. Type the number corresponding to the correct answer and hit enter.",
                Arrays.asList("incorrect", "incorrect", "correct", "incorrect"),
                "correct");
        BooleanQuestion testQuestion2 = new BooleanQuestion("For True/False questions type 1 for true and 2 for false. The correct answer is true",
                "true");
        CheckBoxQuestion testQuestion3 = new CheckBoxQuestion("Check Box questions can have one or multiple answers. Type all the numbers corresponding to the correct answers then hit enter.",
                Arrays.asList("correct", "incorrect", "also correct", "incorrect", "Correct"),
                Arrays.asList("correct", "also correct", "Correct"));

        List<Question> preliminaryQuestions = Arrays.asList(testQuestion1, testQuestion2, testQuestion3);
        for (Question question : preliminaryQuestions) {
            while(!question.askQuestion()){
                System.out.println("That is incorrect. Press ENTER to try again...");
                scan.nextLine();
            }
        }


    }

    public void startQuiz() {
        Scanner scan = new Scanner(System.in);

        this.preliminaryQuestions();
        System.out.println("Now that you understand how it works press ENTER to begin the quiz...");
        scan.nextLine();

        for (Question question : this.questions) {
            if (question.askQuestion()) {
                this.correctAnswers++;
            }
        }

        System.out.println("Final grade: " + this.gradeQuiz() + "%");

    }

    public long gradeQuiz() {
        System.out.println(this.correctAnswers);
        return Math.round((this.correctAnswers / this.questions.size()) * 100);
    }
}
