package lession_02.lab_02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        /* Lab 2.2:
            Allow user to input a number, print out it’s an odd or even number
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number!");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0 ) {
            System.out.println("Bạn nhập số chẳn!");
        }
        else {
            System.out.println("Bạn nhập số lẻ!");
        }

    }
}

