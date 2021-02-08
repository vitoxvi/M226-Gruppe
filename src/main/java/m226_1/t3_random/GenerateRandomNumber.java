package m226_1.t3_random;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random generator = new Random();

        for (int i = 0; i < 10; i++) {
            // Generate and print random number between 0 and 3
            double d = generator.nextDouble();
            System.out.println(d);
        }
    }
}
