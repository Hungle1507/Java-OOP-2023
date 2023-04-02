package lession_03.lab_03;

public class Lab3_1 {
    public static void main(String[] args) {
        /*
        * === Count how many odd, even number(s) in an integer array ===
        * int[] intArr = {1, 2, 3, 4, 5};
        * Even numbers: 2
        * Odd numbers: 3
        * */

        int [] arrayNumbers = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arrayNumbers.length; i++)
        {
            if (i % 2 == 0)
            {
                System.out.printf("Số chẳn %d\n", + i);
            }
            else
            {
                System.out.printf("Số lẻ %d\n", + i);
            }
        }
        }
    }

