package m226_1.t3_random;

import java.util.Random;

public class RandomXOArray {
    public static void main(String[] args) {
        char[] xoArray = new char[10];
        Random generator = new Random();

        for (int i = 0; i < xoArray.length; i++) {
            char xOderO;

            if(generator.nextDouble() > 0.5){
                xOderO = 'X';
            }
            else{
                xOderO = 'O';
            }
            xoArray[i] = xOderO;
        }

        for (char c : xoArray) {
            System.out.print(c);
        }
    }
}
