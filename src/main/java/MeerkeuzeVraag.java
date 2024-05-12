import java.util.List;

public class MeerkeuzeVraag extends Vraag {
    private List<Antwoord> alternatieven;
    private Antwoord goedAntwoord;

    public MeerkeuzeVraag(String vraagTekst, String letter, Categorie categorie, List<Antwoord> alternatieven, Antwoord goedAntwoord) {
        super(vraagTekst, letter, categorie);
        this.alternatieven = alternatieven;
        this.goedAntwoord = goedAntwoord;
    }

    @Override
    public boolean controleerAntwoord(String antwoord) {
        final String[] ANTWOORD_KEUZES = {"A", "B", "C", "D"};
        boolean goedBeantwoord = false;
        for (int i = 0; i < ANTWOORD_KEUZES.length; i++) {
            if (ANTWOORD_KEUZES[i].equalsIgnoreCase(antwoord) && (alternatieven.get(i).getAntwoordTekst().equals(goedAntwoord.getAntwoordTekst()))) {
                goedBeantwoord = true;
                break;
            }
        }
        return goedBeantwoord;
    }

    public List<Antwoord> getAlternatieven() {
        return alternatieven;
    }
}