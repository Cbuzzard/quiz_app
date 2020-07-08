import java.util.Arrays;
import java.util.List;

public class BooleanQuestion extends Question {

    public BooleanQuestion(String question, String answer) {
        super(question, Arrays.asList("true", "false"), answer);
        this.setQuestionType("True/False");
    }

}
