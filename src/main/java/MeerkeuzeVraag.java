import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag {
    private final Antwoord goedAntwoord;

    public MeerkeuzeVraag(String vraagTekst, ArrayList<Antwoord> antwoorden, Antwoord goedAntwoord, String letter) {
        super(vraagTekst, antwoorden, letter);
        System.out.println(goedAntwoord.getAntwoordTekst());
        this.goedAntwoord = goedAntwoord;
    }

    @Override
    public void processAnswer(String antwoord) {
        if (antwoord.equals(goedAntwoord.getAntwoordTekst())) {
            goedBeantwoord = true;
        }
    }
}