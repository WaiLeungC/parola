public class Speler {
    private String naam;
    private int saldo;

    public Speler(String naam) {
        this.naam = naam;
        this.saldo = 1000;
    }

    public void addSaldo(int amount) {
        saldo += amount;
    }

    public void removeSaldo(int amount) {
        saldo -= amount;
    }

    public int getSaldo() {
        return saldo;
    }
}
