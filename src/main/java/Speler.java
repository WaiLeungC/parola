public class Speler {
    private String naam;
    private int credits;

    public Speler(String naam) {
        this.naam = naam;
        this.credits = 1000;
    }

    public void toevoegCredits(int aantal) {
        credits += aantal;
    }

    public void verwijderCredits(int aantal) {
        credits -= aantal;
    }

    public int getCredits() {
        return credits;
    }
}
