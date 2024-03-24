public class LengteWoord implements Puntentelling {
    private WoordChecker woordChecker;

    public LengteWoord() {
        woordChecker = new NederlandseWoordChecker();
    }

    @Override
    public int calculateScore(String woord) {
        String bericht = "";
        int score = 0;
        if (woordChecker.woordBestaat(woord)) {
            score = woord.length();
        } else {
            bericht += "Het gevormde woord \"" + woord + "\" bestaat niet. ";
        }
        bericht += "Aantal punten voor de lengte van het woord: " + score;
        System.out.println(bericht);
        return score;
    }
}