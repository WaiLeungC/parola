public class LengteWoord implements Puntentelling {
    @Override
    public int calculateScore(String woord) {
        int score = woord.length();
        System.out.println("Punten voor de lengte van het woord: " + score);
        return score;
    }
}