public class NederlandseWoordChecker {
    private String[] bestaandeWoorden = {
            "TILDE",
            "DETAIL",
            "DIALECT",
            "CITADEL"
    };

    public boolean woordBestaat(String woord) {
        for (String bestaandWoord : bestaandeWoorden) {
            if (bestaandWoord.equalsIgnoreCase(woord)) {
                return true;
            }
        }
        return false;
    }

    public boolean canFormWordFromLetters(String word, String letters) {
        word = word.toLowerCase();
        letters = letters.toLowerCase();
        StringBuilder remainingLetters = new StringBuilder(letters);
        for (char c : word.toCharArray()) {
            int index = remainingLetters.indexOf(String.valueOf(c));
            if (index == -1) {
                return false;
            } else {
                remainingLetters.deleteCharAt(index);
            }
        }
        return true;
    }
}