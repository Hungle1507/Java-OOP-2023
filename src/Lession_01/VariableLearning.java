package Lession_01;

public class VariableLearning {
    public static void main(String[] args) {
      byte myByteNumber = 1;
        System.out.println(myByteNumber);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
      short myShortNumber = 128;
        System.out.println(myShortNumber);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
      int myIntNumber = 500;
        System.out.println(myIntNumber);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
      float myFloatNumber = 2.1F;
            myFloatNumber = 3.15F;
        System.out.println("myFloatNumber after new change: " + myFloatNumber);
      double myDoubleNumber = 3.1F;
        System.out.println(myDoubleNumber);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        long myLongNumber = 2663767L;
        System.out.println("MyLongNumber:" + Long.MAX_VALUE);
        /* note tips for name variable */
        //snake_case
        int my_byte_number_one = 128;
        //camelCase
        int myByteBNumberOne = 128;
        //PascalCase
        int MyByteNumBerOne =128;

    }
}
