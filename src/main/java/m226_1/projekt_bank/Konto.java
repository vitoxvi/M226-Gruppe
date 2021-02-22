package m226_1.projekt_bank;

public class Konto {
    // Klassenvariable
    public static final String ISO_KONTO_NORM_NUMMER = "127390";
    // Instanzvariablen
    private double saldo, zinssatz;

    // Konstruktor(en)
    public Konto(double saldo, double zinssatz) {
        this.saldo = saldo;
        this.zinssatz = zinssatz;
    }

    public Konto(double zinssatz){
        this.saldo = 0;
        this.zinssatz = zinssatz;
    }

    // Methoden
    public double getSaldo(){
        return this.saldo;
    }

    public void einzahlen(double amount){
        if (amount > 0){
            this.saldo += amount;
        }
    }

    public void abheben(double amount){
        if (amount > 0){
            this.saldo -= amount;
            // Geld abheben kostet 2
            this.saldo -= 2;
        }
    }

    public void verzinsen(int tage){
        double zins = this.saldo * this.zinssatz / 365 * tage;
        this.saldo += zins;
    }


}
