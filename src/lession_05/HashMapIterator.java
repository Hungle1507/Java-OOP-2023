package lession_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");
        //neu gặp key có value là Others thì Replace nó thành something else
        for (Integer key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.replace(key, "Something else");
            }
        }
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
    
}
