public class LengteWoord implements Puntentelling {
    private WoordChecker woordChecker;

    public LengteWoord() {
        woordChecker = new NederlandseWoordChecker();
    }

    @Override
    public int calculateScore(String word) {
        String bericht = "";
        int score = 0;
        if (woordChecker.woordBestaat(word)) {
            score = word.length();
        } else {
            bericht += "Het gevormde woord \"" + word + "\" bestaat niet. ";
        }
        bericht += "Aantal punten voor de lengte van het woord: " + score;
        System.out.println(bericht);
        return score;
    }
}