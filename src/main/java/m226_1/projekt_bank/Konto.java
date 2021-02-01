package m226_1.projekt_bank;

public class Konto {
    private double saldo, zinssatz;

    public Konto(double saldo, double zinssatz) {
        this.saldo = saldo;
        this.zinssatz = zinssatz;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void einzahlen(double amount){
        this.saldo += amount;
    }

    public void abheben(double amount){
        this.saldo -= amount;
        // Geld abheben kostet 2
        this.saldo -= 2;
    }

    public void verzinsen(int tage){
        double zins = this.saldo * this.zinssatz / 365 * tage;
        this.saldo += zins;
    }


}
