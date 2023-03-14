package lession_02;

public class OperatorLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;
//      int total = myNum1 + myNum2;
//      System.out.println("Total:" + total);
//      int multiple = myNum1 * myNum2;
        System.out.println(5/2);
        System.out.println(5%2);  //( toán tử ép kiểu nếu phần dư >=0.5 sẽ làm tròn 1 )

        //prefix & postfix
        int x = ++myNum1 + myNum2++;
        /*
        * prefix First > right operand (+ giá trị myNumber2 (chưa tính toán) > assign value to left operand (x) > postfix (tính toán myNum2)
        * myNum1: 2
        * myNum2: 3
        * x: 4
        */
        // print format
        /*
        * %d : số nguyên
        * %f: số thực
        * %b: boolean
        */
        System.out.printf("%d + %d = %d", 1,2,10);

    }
}
