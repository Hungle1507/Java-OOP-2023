package lession_03.lab_03;

import java.util.*;
import java.util.stream.Stream;

public class Lab3_4 {
    public static void main(String[] args) {
        /*
        * Merge 2 SORTED integer array into one SORTED array
        * Array 01: {1, 12, 16, 28, 34}
        * Array 02: {1, 13, 16, 27, 99}
        */

        //int []listArrSecond = {1, 13, 16, 27, 99};
        ArrayList<Integer> listArrFirst = new ArrayList<Integer>();
        listArrFirst.add(1);
        listArrFirst.add(12);
        listArrFirst.add(16);
        listArrFirst.add(28);
        listArrFirst.add(34);
        ArrayList<Integer> listArrSecond = new ArrayList<Integer>();
        listArrSecond.add(1);
        listArrSecond.add(13);
        listArrSecond.add(16);
        listArrSecond.add(27);
        listArrSecond.add(99);
        ArrayList<Integer> listArrMerged = new ArrayList<Integer>();
        listArrMerged.addAll(listArrFirst);
        listArrMerged.addAll(listArrSecond);

        System.out.println("listArrFirst:" + listArrFirst);
        System.out.println("listArrSecond:" + listArrSecond);

        Collections.sort(listArrMerged); // sort list listArrThird
        System.out.println("listArrMerged:" + listArrMerged);

    }
}
