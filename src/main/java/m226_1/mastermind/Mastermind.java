package m226_1.mastermind;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    Random random = new Random();
    public char[] Colors = {'r', 'b', 'g', 'y', 'w', 's'};
    public char[] Computercode = new char[4];
    public char[] Usercode = new char[4];
    public int tries = 1;
    int rightPosition;
    int rightColor;

    public static void main(String[] args) {
        Mastermind game = new Mastermind();
        game.createFixCode();
        game.readCode();
        game.checkGame();
    }
    void createFixCode() {
        System.out.println("Welcome to a new game of Mastermind.");
        System.out.println("Computer generates Code...");
        for (int i = 0; i < 4; i++) {
            int x = random.nextInt(5);
            Computercode[i] = Colors[x];
        };
        System.out.println("Computercode generated: ****" );
        System.out.println(Computercode);
    }

    void readCode() {
        Scanner s = new Scanner(System.in);
        System.out.println("Guess a 4 digit Code containing 'r','b','g','y','w','s' ");
        String input = s.next();

        if (input.length() == 4) {
            int isTrue = 0;
            char[] InputArray = input.toCharArray();
            for (int i = 0; i < InputArray.length; i++) {
                char searchedChar = InputArray[i];

                for (char x : Colors) {
                    if (x == searchedChar) {
                        isTrue = isTrue + 1;
                        break;
            } } }
                if(isTrue == 4) {Usercode = InputArray;
                    //System.out.println(Usercode);
                    // System.out.println( "is a valid input");}
            }else {
                    System.out.println("Input is not correct");
                    readCode();
            } }
         else {
            System.out.println("Input is not correct");
            readCode();
            } }

    void checkGame () {
           CheckCombinations(Computercode, Usercode);
           System.out.println("right Color: " + rightColor );
           System.out.println("right Position: " + rightPosition);

        if (rightPosition == 4) {
            System.out.println("You guessed the secret code in " +tries + " tries. It was " + Arrays.toString(Computercode));
        } else {
            rightPosition = 0;
            rightColor = 0;
            tries = tries + 1;
            readCode();
            checkGame();
        } }

    void CheckCombinations(char[] fixcode, char[] usercode) {
        // Position
        if(usercode[0]==fixcode[0]){
            rightPosition=rightPosition+1;
        }
        if(usercode[1]==fixcode[1]){
            rightPosition=rightPosition+1;
        }
        if(usercode[2]==fixcode[2]){
            rightPosition=rightPosition+1;
        }
        if(usercode[3]==fixcode[3]){
            rightPosition=rightPosition+1;
        }
       // Color
        if(usercode[0]!=fixcode[0]){
            if(usercode[0]== fixcode[1] || usercode[0]==fixcode[2] || usercode[0]==fixcode[3]) {
                rightColor = rightColor + 1;
            }}
        if(usercode[1]!=fixcode[1]){
            if(usercode[1]==fixcode[0] || usercode[1]==fixcode[2] || usercode[1]==fixcode[3]){
            rightColor=rightColor+1;
            }}
        if(usercode[2]!=fixcode[2]){
            if(usercode[2]==fixcode[0] || usercode[2]==fixcode[1] || usercode[2]==fixcode[3]){
            rightColor=rightColor+1;
            }}
        if(usercode[3]!=fixcode[3]){
            if(usercode[3]==fixcode[0] || usercode[3]==fixcode[1] || usercode[3]==fixcode[2]){
            rightColor=rightColor+1;
        }}}};

