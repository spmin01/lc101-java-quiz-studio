public class MultipleChoice extends Question {

    private int correctAnswer;

    public MultipleChoice(String question, int correctAnswer, String[] possibleAnswers) {
        super(question, possibleAnswers);
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
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
