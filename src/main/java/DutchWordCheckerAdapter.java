public class DutchWordCheckerAdapter implements WoordChecker {
    private DutchWordChecker dutchWordChecker;

    public DutchWordCheckerAdapter() {
        this.dutchWordChecker = new DutchWordChecker();
    }

    @Override
    public boolean woordBestaat(String woord) {
        return dutchWordChecker.wordExists(woord);
    }

    @Override
    public boolean kanWoordVormenUitLetters(String woord, String letters) {
        return dutchWordChecker.canFormWordFromLetters(woord, letters);
    }
}