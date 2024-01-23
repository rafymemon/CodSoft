
//Task #01: Number Game

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalAttempts;
        int win = 0;

        while (true) {
            totalAttempts = 0;
            int generatedNumber = random.nextInt(100);
            int guessedNumber;
            System.out.println("Guess the number between 1-100");
            while (true) {
                System.out.print("guess number : ");
                guessedNumber = sc.nextInt();
                totalAttempts++;

                if (guessedNumber>generatedNumber)
                    System.out.println("Guessed number is greater");
                else if (guessedNumber<generatedNumber)
                    System.out.println("Guessed number is smaller");
                else{
                    System.out.println("Guessed number is correct");
                    win++;
                    break;
                }
            }
            System.out.println("Total attempts : "+totalAttempts);
            System.out.print("Do you want to play again(y/n) : ");
            String choice = sc.next();
            if(!choice.equalsIgnoreCase("y"))
                System.exit(0);
        }
    }
}