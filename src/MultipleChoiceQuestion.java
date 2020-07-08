import java.util.List;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, List<String> choices, String answer) {
        super(question, choices, answer);
        this.setQuestionType("Multiple Choice");
    }
}
