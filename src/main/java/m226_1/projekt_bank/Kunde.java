package m226_1.projekt_bank;

import java.util.Random;

public class Kunde {
    private String Name, Vorname;
    private int Kundennummer;
    Random random = new Random();


    public Kunde(String Vorname, String Name) {
        this.Vorname = Vorname;
        this.Name = Name;
        this.Kundennummer = random.nextInt(100);
    }

}
