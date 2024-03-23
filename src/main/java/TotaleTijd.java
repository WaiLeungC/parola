public class TotaleTijd implements Puntentelling {
    private int totaleTijd;

    public TotaleTijd(int totaleTijd) {
        this.totaleTijd = totaleTijd;
    }

    @Override
    public int calculateScore(String woord) {
        int score;
        if (totaleTijd < 60) {
            score = 3;
        } else if (totaleTijd < 120) {
            score = 2;
        } else {
            score = 1;
        }
        System.out.println("Punten voor de totale tijd die nodig was om de quiz te spelen: " + score);
        return score;
    }
}