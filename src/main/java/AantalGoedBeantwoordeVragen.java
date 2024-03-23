public class AantalGoedBeantwoordeVragen implements Puntentelling {
    private Quiz quiz;

    public AantalGoedBeantwoordeVragen(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public int calculateScore(String woord) {
        return 0;
    }
}