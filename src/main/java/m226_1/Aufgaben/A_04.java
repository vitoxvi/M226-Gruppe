package m226_1.Aufgaben;
import java.util.Random;

public class A_04 {
    public int[] Numbers = new int[30];
    public int[] sNumbers = new int[30];
    public int Zähler = 0;
    public static void main(String[] args) {
        A_04 game = new A_04();
        game.generateArrayU();
        game.sortArray();
        game.printArrayU();
        game.printArrayS();
        game.checkPositions();
        game.printZähler();

    }


    void generateArrayU() {
        Random rnd = new Random();
        for(int x = 0 ; x < Numbers.length; x++) {
            Numbers[x] = rnd.nextInt(50);
        }}

    void printArrayU() {
        System.out.print("Unsortierte Zahlen: ");
        for (int x : Numbers) {
            System.out.print(x + " ");

        }
        System.out.println(); }

    void sortArray() {
        for(int s = 0; s < Numbers.length; s++){
            sNumbers[s] = Numbers[s]; }
        boolean sorted = false ;
        int wechsler;
        while (!sorted) {
            sorted = true;
            for(int i=0 ; i < Numbers.length -1; i++ ) {
                if (sNumbers[i] > sNumbers[i + 1]) {
                    wechsler = sNumbers[i];
                    sNumbers[i] = sNumbers[i + 1];
                    sNumbers[i + 1] = wechsler;
                    sorted = false;
                } } } }

    void printArrayS() {
        System.out.print("Sortierte Zahlen: ");
        for (int x : sNumbers) {
            System.out.print(x +" ");
        }
        System.out.println();}


    void checkPositions() {
        for(int i =0; i < 30; i++) {
            if(Numbers[i] > sNumbers[i]) {
                Zähler = Zähler + 1;
            }

       } }
    void printZähler() {
        System.out.println("An " + Zähler + " Positionen waren im unsortierten Array grössere Zahlen");
    }
}

