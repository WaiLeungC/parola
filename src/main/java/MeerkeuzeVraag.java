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

    @Override
    public String getVraagTekst() {
        final String[] ANTWOORD_KEUZES = {"A", "B", "C", "D"};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");

        for (int i = 0; i < alternatieven.size(); i++) {
            stringBuilder.append(ANTWOORD_KEUZES[i]);
            stringBuilder.append(". ");
            stringBuilder.append(alternatieven.get(i).getAntwoordTekst());

            if (i < alternatieven.size() - 1) {
                stringBuilder.append("\n");
            }
        }

        return super.getVraagTekst() + stringBuilder;
    }

    public List<Antwoord> getAlternatieven() {
        return alternatieven;
    }
}