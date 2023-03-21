package lession_02;

import javax.swing.*;
import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {

        // <18 || 18-55 || 56 ->
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter your age:");
        int clientAge = scanner.nextInt();

        if(clientAge < 18){
            System.out.println("Do not sell to you");
            if (clientAge < 14) {
                System.out.println("Call 113!");
            }
        } else if (clientAge <= 55) {
            System.out.println("Your want sale how many item ?");
        } else {
            System.out.println("Sale to you only 1 item !");
        }


    }
}
