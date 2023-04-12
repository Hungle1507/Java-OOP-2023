package lession_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++ ;

        int [] myIntArray = {1, 2, 3, 4, 5};
        for (int index = 0; index < myIntArray.length; index++) {
            myIntArray[index] = ++ index;
            //myIntArray[index] = index ++;
        }
        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}
