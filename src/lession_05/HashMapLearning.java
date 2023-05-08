package lession_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {

        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113,"Canh sat");
        emergencyList.put(114,"Cuu hoa");
        emergencyList.put(115,"Cap cuu");
        emergencyList.put(116,"...");

        System.out.println(emergencyList.get(113));
        System.out.println(emergencyList.get(116));
        // put new value
        emergencyList.put(116 , "Goi so khac");
        System.out.println(emergencyList.get(116));
       //
        System.out.printf("Printf all value: \n");
        for ( int key : emergencyList.keySet()){
            System.out.println(emergencyList.get(key));
        }
        // check contains (true , false)
        System.out.printf("113 key exist : ");
        System.out.println(emergencyList.containsKey(113));
        System.out.printf("cap cuu value exist : ");
        System.out.println(emergencyList.containsValue("cap cuu"));
        // Update
        emergencyList.replace(113, "Goi canh sat");
        System.out.println(emergencyList.get(113));
      // Update khi dung gia tri cu
        emergencyList.replace(113,"Goi canh sat" ,"so canh sat");
        System.out.println(emergencyList.get(113));


    }
}
