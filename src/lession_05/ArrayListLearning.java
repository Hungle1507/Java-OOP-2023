package lession_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        //lay so le trong 4 phan tu , => cap nhat no thanh so chan
        List <Integer> myArrayList = Arrays.asList(1,2,3,4);
        List <Integer> myArrayListTrue = new ArrayList<>();
        myArrayListTrue.add(1);
        myArrayListTrue.add(2);
        myArrayListTrue.add(3);
        myArrayListTrue.add(4);

        for (int index = 0; index < myArrayList.size(); index++) {
            boolean isElementEvanNumber = myArrayList.get(index) %2 !=0;
            if (isElementEvanNumber)
            {
                myArrayList.set(index,myArrayList.get(index)+1);
            }
        }
        System.out.println(myArrayList);

        // remove index is 1
        myArrayListTrue.remove(1);
        //remove value is 1
        myArrayListTrue.remove(new Integer(1));
        System.out.println(myArrayListTrue);

        // check emtpy (kiem tra rong trong chuỗi)
        if (!myArrayList.isEmpty()){
            System.out.printf("List's size:", + myArrayList.size());
        }
        // check element existing number is 1 ?
        System.out.println(myArrayList.contains(1)); // trong chuoi co so 1 không?// boxing
        System.out.println(myArrayList.contains(4)); // trong chuoi co so 4 không?// boxing
        // Vi tri
        System.out.println(myArrayListTrue.indexOf(3));
    }
}
