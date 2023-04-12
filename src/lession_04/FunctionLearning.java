package lession_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class FunctionLearning {
    public static void main(String[] args) {
        //Parameter(s) vs argument(s) => Parameter là 1 cái alias nằm trong cái function(), Name là parameter loại String
        sayHello("Teo"); // Teo là "argument" , Name la "Parameter"
        sayHello("Tun");
        sayHello("Tin");
        //
        System.out.println(getARamdomNumber(19));
        System.out.println(getARamdomNumber(20));
        //
        printSimpleMenu();
    }
    // varargs, => var argument
    public static void sayHello(String name){
        System.out.println("hello," + name);
    }
    // boudery giá trị biên ,=> in ra số bất kỳ trong ranh giới của 2
    public static int getARamdomNumber(int boudery){
        int randomNumber = new SecureRandom().nextInt(boudery);
        return randomNumber;
    }

    public static void printSimpleMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input number: ");
        int inputNumber = scanner.nextInt();

        for (int index = 0; index < 10; index++) {
            if (index == 8) {
                System.out.printf("You have reached the magic number....");
                return;
            }
            else
                System.out.println(index);

        }
        System.out.printf("End the program");
    }

}
