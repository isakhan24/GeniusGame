package khanisagenius;

import java.util.Scanner;
import java.util.Random;
// @author isakhan

public class KhanIsaGenius {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.printf("WELCOME TO GENIUS GAME\nHow many letters would you like? ");
        Random random = new Random();
        int num = kbd.nextInt();
        int randomLoc;
        boolean win = false;
        int correct = 0;
        int incorrect = 0;
        int roundCounter = 1;
        char letters[] = new char[num];
        char guessArray[] = new char[num];

        for (int c = 0; c < num; c++) {
            randomLoc = random.nextInt(3);

            switch (randomLoc) {
                case 0:
                    letters[c] = 'r';
                    break;
                case 1:
                    letters[c] = 'g';
                    break;
                case 2:
                    letters[c] = 'b';
                    break;
                default:;
            }
        }

        for (int loop = 0; loop < num; loop++) {
            System.out.println(letters[loop]);
        }
        String gunk = kbd.nextLine();
        while (win == false) {
            System.out.print("ROUND " + roundCounter + ": ");
            String guess = kbd.nextLine();
            guess = guess.toLowerCase();
            for (int gArray = 0; gArray < num; gArray++) {
                guessArray[gArray] = guess.charAt(gArray);
            }

            for (int c = 0; c < num; c++) {
                if (guessArray[c] == letters[c]) {
                    correct++;
                } else {
                    incorrect++;
                }
            }
            System.out.printf("CORRECT: " + correct + "   INCORRECT: " + incorrect + "\n");
            if (correct == num) {
                win = true;
            }
            correct = 0;
            incorrect = 0;
            roundCounter++;

        }
        if (win == true) {
            System.out.printf("\n\n\nYOU WIN\nIt took you " + (roundCounter - 1) + " rounds\n");
        }

    }

}
