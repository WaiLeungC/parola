import java.util.ArrayList;

public class KortAntwoordVraag extends Vraag {
    public KortAntwoordVraag(String vraagTekst, ArrayList<Antwoord> antwoorden, String letter, Categorie categorie) {
        super(vraagTekst, antwoorden, letter, categorie);
    }

    @Override
    public void processAnswer(String antwoord) {
        for (Antwoord antwoordMogelijkheid : antwoorden) {
            if (antwoord.equals(antwoordMogelijkheid.getAntwoordTekst())) {
                goedBeantwoord = true;
                break;
            }
        }
    }
}