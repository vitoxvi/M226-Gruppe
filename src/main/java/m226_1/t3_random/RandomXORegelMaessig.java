package m226_1.t3_random;

import java.util.Random;

public class RandomXORegelMaessig {
    public static void main(String[] args) {
        char[] xoArray = new char[10];
        Random generator = new Random();

        int anzahlX = generator.nextInt(10) + 1;

        System.out.println(anzahlX);

        int schritte = 10 / anzahlX;

        int cX = 0;

        for (int i = 0; i < xoArray.length; i++) {
            if (cX < anzahlX){
                xoArray[i] = 'X';
                cX ++;

                for (int i1 = 0; i1 < schritte; i1++) {
                    i = i+ 1;
                    xoArray[i] = 'O';
                }
            }
        }

        for (char c : xoArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
