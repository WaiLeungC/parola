public class CombinedScoreCalculator implements Puntentelling {
    private Quiz quiz;
    private int bestedeTijd;

    public CombinedScoreCalculator(Quiz quiz, int bestedeTijd) {
        this.quiz = quiz;
        this.bestedeTijd = bestedeTijd;
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
        return score;
    }

    private int calculateScoreForWordLength(String word) {
        int score = 0;
        NederlandseWoordChecker woordChecker = new NederlandseWoordChecker();
        if (woordChecker.woordBestaat(word)) {
            if (woordChecker.canFormWordFromLetters(word, quiz.getLettersForRightAnswers())) {
                score = word.length();
            }
        } else {
            System.out.println("Het gevormde woord " + word + " bestaat niet.");
        }
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
        return score;
    }
}