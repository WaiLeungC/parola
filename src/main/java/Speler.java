public class Speler {
    private String naam;
    private int saldo;

    public Speler(String naam) {
        this.naam = naam;
        this.saldo = 1000;
    }

    public void toevoegSaldo(int aantal) {
        saldo += aantal;
    }

    public void verwijderSaldo(int aantal) {
        saldo -= aantal;
    }

    public int getSaldo() {
        return saldo;
    }
}
