public class LengteWoord implements Puntentelling {
    private WoordChecker woordChecker;

    public LengteWoord() {
        woordChecker = new EngelseWoordChecker();
    }

    @Override
    public int calculateScore(String woord) {
        int score = 0;
        if (woordChecker.woordBestaat(woord)) {
            score = woord.length();
        } else {
            System.out.println("Het gevormde woord \"" + woord + "\" bestaat niet.");
        }
        System.out.println("Punten voor de lengte van het woord: " + score);
        return score;
    }
}