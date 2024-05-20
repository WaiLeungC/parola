public class DutchWordChecker {
    private String[] existingWords = {
            "TILDE",
            "DETAIL",
            "DIALECT",
            "CITADEL"
    };

    public boolean wordExists(String word) {
        for (String bestaandWoord : existingWords) {
            if (bestaandWoord.equalsIgnoreCase(word)) {
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