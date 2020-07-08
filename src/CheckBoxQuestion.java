import java.util.List;
import java.util.Scanner;

public class CheckBoxQuestion extends Question {
    private List<String> answers;

    public CheckBoxQuestion(String question, List<String> choices, List<String> answers) {
        super(question, choices);
        this.answers = answers;
        this.setQuestionType("Check Box");
    }

    @Override
    public boolean askQuestion() {
        System.out.println(this.getQuestionText());
        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.nextLine();
        return this.checkAnswer(userAnswer);
    }

    public boolean checkAnswer(String userAnswer) {
        String[] userAnswers = (userAnswer.replaceAll("[^0-9]","")).split("");
        int numCorrect = 0;
        for (String userAnswerInt : userAnswers) {
            try {
                if(!answers.contains(this.getChoices().get(Integer.parseInt(userAnswerInt)-1))){
                    return false;
                } else {numCorrect++;}
            } catch (Exception err) {
                System.out.println("It seems you have submitted an invalid answer");
                return false;
            }
        }
        return numCorrect == this.answers.size();
    }



}
