package lession_05;

import java.util.*;

public class RemovingDuplicatedValues {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(7);
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(3);
        /*
        * Lay 3 gia trị nhỏ nhất của arrayList
        *
        *
        * */
        List<Integer> withoutDuplicatedValuesList = new ArrayList<>();
        for (Integer number : myArrayList) {
            if (!withoutDuplicatedValuesList.contains(number)){
                withoutDuplicatedValuesList.add(number);
            }
        }
        System.out.println(myArrayList);
        System.out.println(withoutDuplicatedValuesList);

        // Set (loai bo trung lap và sắp xếp tăng dần (asc))
        Set<Integer> set = new HashSet<>(myArrayList);
        System.out.println(set);
        // sort withoutDuplicatedValuesList list
        Collections.sort(withoutDuplicatedValuesList);
        System.out.println(withoutDuplicatedValuesList);
        // Sublist
        List<Integer> first3MinValue = withoutDuplicatedValuesList.subList(0,3);
        System.out.println(first3MinValue);

    }
}
