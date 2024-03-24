import java.util.ArrayList;

public abstract class Vraag {
    private String vraagTekst;
    private ArrayList<Antwoord> antwoorden;
    private String letter;
    private Categorie categorie;
    private boolean goedBeantwoord;

    public Vraag(String vraagTekst, ArrayList<Antwoord> antwoorden, String letter, Categorie categorie) {
        this.vraagTekst = vraagTekst;
        this.antwoorden = antwoorden;
        this.letter = letter;
        this.categorie = categorie;
    }

    public abstract void processAnswer(String antwoord);

    public String getVraagTekst() {
        return vraagTekst;
    }

    public ArrayList<Antwoord> getAntwoorden() {
        return antwoorden;
    }

    public String getLetter() {
        return letter;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public boolean isGoedBeantwoord() {
        return goedBeantwoord;
    }

    public void setGoedBeantwoord(boolean goedBeantwoord) {
        this.goedBeantwoord = goedBeantwoord;
    }
}