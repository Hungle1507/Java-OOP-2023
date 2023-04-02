package lession_03;

public class ArrayLearning {
    public static void main(String[] args) {

        int [] myIntArray = {1, 2 ,3, 4, 5};
        int arrayLength = myIntArray.length;

//        for (int index = 0; index < arrayLength; index++) {
//            myIntArray[index] = index +1;
//        }
//        myIntArray[arrayLength - 1] =10; //arrayLength đầu tiên luôn luôn = 0, cuối cùng thì lấy arrayLength -1
//        for (int index = 0; index < arrayLength; index++) {
//            System.out.printf("Element at the index %d has value %d\n", index, myIntArray[index]);
//            //System.out.println(myIntArray[index]);
//        }
        // Enhanced for loop
        for (int i : myIntArray) {
            System.out.println(i);
        }
    }
}
