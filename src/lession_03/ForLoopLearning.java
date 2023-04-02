package lession_03;

public class ForLoopLearning {
    public static void main(String[] args) {
        /*
        * 10 vong
        * total : 10
        * start : 0
        * run -----1 < 10 ------ 2 < 10 ------10 ==10
        * */
        //valid loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        int maxNumber = 10;
        // valid loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        // valid loop
        for (int i = 0; i < maxNumber;) {
            System.out.println(i);
            i++;
        }
        // Infinitive loop
//        for (; ;) {
//            System.out.println(maxNumber);
//        }
        System.out.println("Hello!");
    }
}
