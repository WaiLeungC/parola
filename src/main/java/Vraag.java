import java.util.ArrayList;

public abstract class Vraag {
    public String vraagTekst;
    public ArrayList<Antwoord> antwoorden;
    public String letter;
    public Categorie categorie;
    public boolean goedBeantwoord;

    public Vraag(String vraagTekst, ArrayList<Antwoord> antwoorden, String letter, Categorie categorie) {
        this.vraagTekst = vraagTekst;
        this.antwoorden = antwoorden;
        this.letter = letter;
        this.categorie = categorie;
    }

    public abstract void processAnswer(String antwoord);
}