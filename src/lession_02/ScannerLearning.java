package lession_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please in input a number");
        int inputNumber = scanner.nextInt();
        System.out.printf("You input number is: %d", inputNumber);
    }
}
