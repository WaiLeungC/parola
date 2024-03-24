public class NederlandseWoordChecker implements WoordChecker {
    private String[] bestaandeWoorden = {
            "TILDE",
            "DETAIL",
            "DIALECT",
            "CITADEL"
    };

    @Override
    public boolean woordBestaat(String woord) {
        for (String bestaandWoord : bestaandeWoorden) {
            if (bestaandWoord.equalsIgnoreCase(woord)) {
                return true;
            }
        }
        return false;
    }
}
