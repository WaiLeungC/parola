import java.util.ArrayList;

public class KortAntwoordVraag extends Vraag {
    public KortAntwoordVraag(String vraagTekst, ArrayList<Antwoord> antwoorden, String letter, Categorie categorie) {
        super(vraagTekst, antwoorden, letter, categorie);
    }

    @Override
    public void processAnswer(String answer) {
        for (Antwoord antwoordMogelijkheid : getAntwoorden()) {
            if (answer.equals(antwoordMogelijkheid.getAntwoordTekst())) {
                setGoedBeantwoord(true);
                break;
            }
        }
    }
}