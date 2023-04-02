package lession_03.lab_03;

public class Lab3_2 {
    public static void main(String[] args) {
        /*
        * === Finding maximum value/minimum value from an integer array ===
        * int[] intArr = {1, 2, 3, 4, 5};
        * Minimum: 1
        * Maximum: 5
        */
        int [] arrayListNumber = {1, 2, 3, 4, 5};
        for (int i : arrayListNumber) {
            if (i == 1)
            {
                System.out.printf("Số nhỏ nhất: %d\n", + i);
            } else if (i == 5)
            {
                System.out.printf("Số lớn nhất: %d\n", + i);
            }
        }
    }
}
