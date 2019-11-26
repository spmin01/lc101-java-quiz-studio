import java.util.Arrays;

public class Checkbox extends Question {

    private boolean[] correctAnswers;

    public Checkbox(String question, String[] possibleAnswers, boolean[] correctAnswers) {
        super(question, possibleAnswers);
        this.correctAnswers = correctAnswers;
    }

    public boolean[] getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(boolean[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public String toString() {
        String returnString = this.getQuestion() + '\n';
        for(String possibleAnswer : this.getPossibleAnswers()) {
            returnString += possibleAnswer + '\n';
        }
        return returnString;
    }

}
