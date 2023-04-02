package lession_03.lab_03;

import java.util.Arrays;

public class Lab3_3 {
    public static void main(String[] args) {
      /*
      * === Sort an integer array from min to max ===
      * Input: {12, 34, 1, 16, 28};
      * Expected output: {1, 12, 16, 28, 34}
      */
       int [] arrayListNumber = {12, 34, 1, 16, 28};
        System.out.printf("Display list number actual:\n");
        for (int index = 0; index < arrayListNumber.length; index++) {
            System.out.printf("List number not sort: %d\n", arrayListNumber[index]);
        }
        System.out.printf("Display list number expected:\n");
        for (int index = 0; index < arrayListNumber.length; index++) {
            Arrays.sort(arrayListNumber);
            System.out.printf("List number sorted: %d\n", arrayListNumber[index]);
        }

    }
}
