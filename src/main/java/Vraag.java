import java.util.ArrayList;

public abstract class Vraag {
    public String vraagTekst;
    public ArrayList<Antwoord> antwoorden;
    public String letter;
    public boolean goedBeantwoord;

    public Vraag(String vraagTekst, ArrayList<Antwoord> antwoorden, String letter) {
        this.vraagTekst = vraagTekst;
        this.antwoorden = antwoorden;
        this.letter = letter;
    }

    public abstract void processAnswer(String antwoord);
}