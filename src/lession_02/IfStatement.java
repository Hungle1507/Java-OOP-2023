package lession_02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7; // final => not want change time
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input time");
        int arrivalTime = scanner.nextInt();

        boolean isHeOnTime = arrivalTime == EXPECTED_TIME; // when input time from keyCap (arrivalTime) , if value = 7 then isHeOnTime = true , else value > 7 then isHeOnTime = false

        System.out.println("Go to the coffee house !");

//        if (isHeOnTime) {
//            System.out.println("Drink & Talk 1 hour !");
//        }
//        else {
//            System.out.println("Write a letter !");
//        }
        System.out.println("Go to home");
//  Ternary operator => /* instead for if else have value True & False ) */
        String outputMessage = isHeOnTime ? "Talk" : "go to home!";
        System.out.println(outputMessage);
    }
}

