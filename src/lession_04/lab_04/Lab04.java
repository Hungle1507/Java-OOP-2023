package lession_04.lab_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab04 {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(2);
        //
        Set<Integer> setMyArrayList = new HashSet<>(myArrayList);
        System.out.println(setMyArrayList);


        List<Integer> getMinNumber =  new ArrayList<>(setMyArrayList);
        System.out.println("getMinNumber = " + getMinNumber.get(0));

        List<Integer> getMaxNumber = new ArrayList<>(setMyArrayList);
        System.out.println("getMaxNumber = " + getMaxNumber.get(3));


    }
}
