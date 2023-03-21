package lession_02.lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {

        /* LAB_2.1
        Get input from user about height(m) and weight(kg) then calculate BMI

        Underweight = <18.5
        Normal weight = 18.5 – 24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater

         LAB_2.3(Optional):
            Lab 2.1 + Suggest user to increase/decrease weight
        */

        // < 18.5 || > 18.5 < 24.9 ||     25 < 29.9     || > 30
        // < 18.5 ||    <=24.9     ||   <= 29.9   || > 30

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Weight:");
        float inputWeight = scanner.nextFloat();
        System.out.println("Please input Height:");
        float inputHeight = scanner.nextFloat();

        float BMI = inputWeight / (inputHeight * inputHeight);
        System.out.println(BMI);

        if(BMI < 18.5) {
            System.out.println("ăn nhiều vô, suy dinh dưỡng rồi!");
        }
        else if(BMI <= 24.9){ //MI > 18.5 & BMI == 24.9
            System.out.println("Không ốm không mập!");
        }
        else if(BMI <= 29.9) {
            System.out.println("Nên giảm cân đi!");
        }
        else{
            System.out.println("Béo phì!");
        }

    }
}
