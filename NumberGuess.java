package IS;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        System.out.println("Enter How many rounds you play");
        Scanner num = new Scanner(System.in);
        int s = num.nextInt();
        for (int i = 0; i <= s; i++) {
            n1();
            System.out.println("\n\n Next Round \n");

        }

    }

    public static void n1() {
        // System.out.println("next Round");
        Random Numbers = new Random();
        int right_suggest = Numbers.nextInt(100);
        int round = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100, You will have only 10 turns for right number guess!");

        int guess;
        int i = 0;
        boolean win = false;

        while (win == false) {
            guess = sc.nextInt();
            round++;

            if (guess == right_suggest) {
                win = true;
            } else if (i > 8) {
                System.out.println("You loose this game ! the right answer was: " + right_suggest);
                return;
            } else if (guess < right_suggest) {
                i++;
                System.out.println("Yor Guess is lower than the right guess! you have Turns left: " + (10 - i));

            } else if (guess > right_suggest) {
                i++;
                System.out.println("Your Guess Is Higher Than THe Right Guess! you have Turns left: " + (10 - i));

            }

        }

        System.out.println("You win!!!!!!!");

        System.out.println("Then number was " + right_suggest);

        System.out.println("You used " + round + " turns to guess the right number");

        System.out.println("Your score is " + ((11 - round) * 10) + " out of 100");

    }
}