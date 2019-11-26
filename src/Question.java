public abstract class Question {
    private String question;
    private String[] possibleAnswers;

    /**
     * For true or false questions
     * @param question String of question to be asked
     */
    public Question(String question) {
        this.question = question;
    }

    /**
     * For all other questions
     * @param question String of question to be asked
     * @param possibleAnswers Array of strings of possible answers for checkbox or multiple choice
     */
    public Question(String question, String[] possibleAnswers) {
        this(question);
        this.possibleAnswers = possibleAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public abstract String toString();
}
