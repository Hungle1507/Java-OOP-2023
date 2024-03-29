package lession_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {

        //basic
//        boolean somethingIsStrillTrue = true;
//        while(somethingIsStrillTrue){
//            System.out.println(somethingIsStrillTrue);
//            somethingIsStrillTrue = false;
//        }
        // Example
        /* =======Game Menu ======
        * 1.Generate random number (less than 1000)
        * 0. Exit!
        * */
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("======Game Menu======");
            System.out.println("1.Generate random number (less than 1000)");
            System.out.println("0.Exits");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select option");
            int option =  scanner.nextInt();

            if (option == 0){
                isContinuing = false;
                System.out.println("Exits !");
            } else if (option == 1) {
                System.out.println("Your random number:" + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("Please input again!");
            }
        }
        System.out.println("See you again!");
    }
}
