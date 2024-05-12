import java.util.List;

public class KortAntwoordVraag extends Vraag {
    private List<Antwoord> goedeAntwoorden;

    public KortAntwoordVraag(String vraagTekst, String letter, Categorie categorie, List<Antwoord> goedeAntwoorden) {
        super(vraagTekst, letter, categorie);
        this.goedeAntwoorden = goedeAntwoorden;
    }

    @Override
    public boolean controleerAntwoord(String antwoord) {
        for (Antwoord goedAntwoord : goedeAntwoorden) {
            if (goedAntwoord.getAntwoordTekst().equalsIgnoreCase(antwoord)) {
                return true;
            }
        }
        return false;
    }
}