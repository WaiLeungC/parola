import java.util.ArrayList;

public class KortAntwoordVraag extends Vraag {
    public KortAntwoordVraag(String vraagTekst, ArrayList<Antwoord> antwoorden, String letter) {
        super(vraagTekst, antwoorden, letter);
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