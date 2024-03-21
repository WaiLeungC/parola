public class ParolaController {
    public static ParolaController getInstance() {
        return null;
    }

    public void startQuiz(String playerName) {
    }

    public boolean nextQuestion(String playerName) {
        return false;
    }

    public void processAnswer(String playerName, String answer) {
    }

    public String getLettersForRightAnswers(String playerName) {
        return playerName;
    }

    public boolean quizFinished(String playerName) {
        return false;
    }

    public int calculateScore(String playerName, String word) {
        return 0;
    }
}