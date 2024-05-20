public class CombinedScoreCalculator implements Puntentelling {
    private Quiz quiz;
    private int bestedeTijd;
    private WoordChecker woordChecker;

    public CombinedScoreCalculator(Quiz quiz, int bestedeTijd, WoordChecker woordChecker) {
        this.quiz = quiz;
        this.bestedeTijd = bestedeTijd;
        this.woordChecker = woordChecker;
    }

    @Override
    public int calculateScore(String word) {
        int score = 0;
        score += calculateScoreForCorrectAnswers();
        score += calculateScoreForWordLength(word);
        score += calculateScoreForSpendTime();
        return score;
    }

    private int calculateScoreForCorrectAnswers() {
        int score = 0;
        for (boolean vraagGoedBeantwoord : quiz.getGoedBeantwoordeVragen()) {
            if (vraagGoedBeantwoord) {
                score++;
            }
        }
        System.out.println("Aantal punten voor het aantal goed beantwoorde vragen: " + score);
        return score;
    }

    private int calculateScoreForWordLength(String word) {
        int score = 0;
        if (woordChecker.woordBestaat(word)) {
            if (woordChecker.kanWoordVormenUitLetters(word, quiz.getLettersForRightAnswers())) {
                score = word.length();
            }
        } else {
            System.out.println("Het gevormde woord " + word + " bestaat niet.");
        }
        System.out.println("Aantal punten voor de lengte van het gevormde woord: " + score);
        return score;
    }

    private int calculateScoreForSpendTime() {
        int score;
        if (bestedeTijd < 60) {
            score = 3;
        } else if (bestedeTijd < 120) {
            score = 2;
        } else {
            score = 1;
        }
        System.out.println("Aantal punten voor de bestede tijd: " + score);
        return score;
    }
}