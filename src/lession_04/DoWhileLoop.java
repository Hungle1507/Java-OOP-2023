package lession_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your guessing number:");
            int userInput = scanner.nextInt();
            if (userInput==randomNumber){
                System.out.println("Hooray! It's correct!");
                break;
            }
            guessingTime++;

        } while (guessingTime < 3);
        System.out.println("See your again !");
    }
}
