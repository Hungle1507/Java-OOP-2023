package lession_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person teo = new Person();
        Person teo2 = new Person();

        teo.setName("Teo");
        teo.setAge(23);
        // add teo vao list
        personList.add(teo);
        personList.add(teo2);
        // in 2 thằng tèo ra
        System.out.println(personList);
        /* ngay đây sẽ in ra teo2 = null , vì tại thời điểm runtime teo2 chưa được setName
        **/

        // Muốn thay đổi thằng tèo thứ 2 thành thằng Ty
        personList.get(1).setName("Ty");
        personList.get(1).setAge(20);

        // in lại thằng tèo và thằng tý
        System.out.println(personList);
    }
}
