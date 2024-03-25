import java.util.ArrayList;

public class AantalGoedBeantwoordeVragen implements Puntentelling {
    private Quiz quiz;

    public AantalGoedBeantwoordeVragen(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public int calculateScore(String word) {
        int score = 0;
        ArrayList<Vraag> vragen = quiz.getVragen();
        for (Vraag vraag : vragen) {
            if (vraag.isGoedBeantwoord()) {
                score++;
            }
        }
        System.out.println("Aantal punten voor het aantal goed beantwoorde vragen: " + score);
        return score;
    }
}