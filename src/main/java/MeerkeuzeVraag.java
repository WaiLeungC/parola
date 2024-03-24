import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag {
    private Antwoord goedAntwoord;

    public MeerkeuzeVraag(String vraagTekst, ArrayList<Antwoord> antwoorden, Antwoord goedAntwoord, String letter, Categorie categorie) {
        super(vraagTekst, antwoorden, letter, categorie);
        this.goedAntwoord = goedAntwoord;
    }

    @Override
    public void processAnswer(String antwoord) {
        if (antwoord.equals(goedAntwoord.getAntwoordTekst())) {
            setGoedBeantwoord(true);
        }
    }
}