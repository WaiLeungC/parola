public abstract class Vraag {
    private String vraagTekst;
    private String letter;
    private Categorie categorie;

    protected Vraag(String vraagTekst, String letter, Categorie categorie) {
        this.vraagTekst = vraagTekst;
        this.letter = letter;
        this.categorie = categorie;
    }

    public abstract boolean controleerAntwoord(String antwoord);

    public String getVraagTekst() {
        return vraagTekst;
    }

    public String getLetter() {
        return letter;
    }
}