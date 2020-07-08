import java.util.List;
import java.util.Scanner;

public abstract class Question {
    private String questionType = "Question";
    private String question;
    private List<String> choices;
    private String answer;

    public Question(String question, List<String> choices, String answer) {
        this.question = question;
        this.choices = choices;
        this.answer = answer;
    }

    public Question(String question, List<String> choices) {
        this.question = question;
        this.choices = choices;
    }

    public String getQuestionText() {
        String questionText = "[" + this.questionType + "] " + this.question + "\n";
        for (int i = 0; i < choices.size(); i++) {
            questionText += i+1 + ". " + choices.get(i) + "\n";
        }
        return questionText;
    }

    public boolean askQuestion() {
        System.out.println(this.getQuestionText());
        Scanner scan = new Scanner(System.in);
        int userAnswer = scan.nextInt();
        return this.checkAnswer(userAnswer);

    }

    public boolean checkAnswer(int userAnswer) {
        return answer.equals(choices.get(userAnswer - 1));
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }
}
