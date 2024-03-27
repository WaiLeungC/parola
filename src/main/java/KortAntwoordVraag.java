import java.util.ArrayList;

public class KortAntwoordVraag extends Vraag {
    public KortAntwoordVraag(String vraagTekst, ArrayList<Antwoord> antwoorden, String letter, Categorie categorie) {
        super(vraagTekst, antwoorden, letter, categorie);
    }

    @Override
    public void processAnswer(String answer) {
        for (Antwoord goedAntwoord : getAntwoorden()) {
            if (answer.equals(goedAntwoord.getAntwoordTekst())) {
                setGoedBeantwoord(true);
                break;
            }
        }
    }
}