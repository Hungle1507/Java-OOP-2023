package lession_05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        String myName1 = "Cat"; //Literal declaration type
        String myName2 = "Cat"; //Literal declaration type
        String myName3 = new String("Cat"); //Via String object type

        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3: " + (myName1 == myName3));
        // do đang so sánh vô 2 vùng nhớ khác nhau => Nên sẽ trả kết quả = false
        // myName1 nằm trong vùng nhớ String Pool
        // myName3 khai báo theo kiểu Via String object , myName3 sẽ nằm trong vùng nhớ Java Heap
        // so sánh String nên dùng .equal
        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

        // Check lowerCase, upperCase, digit...
        String myPassword = "123myPassword";
        int totalDigits = 0;
        int totalisLowerCase = 0;
        int totalisUpperCase = 0;
        char[] myCharacters = myPassword.toCharArray(); // chuyển về thành 1 mảng các ký tự
        for (char character : myCharacters) {
            if (Character.isDigit(character)) totalDigits ++; // character có chứa con số hay không
            else if (Character.isUpperCase(character)) totalisUpperCase ++;
            else if (Character.isLowerCase(character)) totalisLowerCase ++;
        }
        if (totalDigits > 0 && totalisLowerCase > 0 && totalisUpperCase >0 ){
            System.out.println("Password valid condition = " + myPassword);
        } else {
            System.out.println("Password format is wrong = " + myPassword);
        }

        // Replacement ~ Immutable
        /*
        * Replace string from not allow input to * character
        **/
        String badWordContainer = "         bad , very bad , sth else, bad";
        String filteredStr = badWordContainer.replace("bad", "b**");

        System.out.println(badWordContainer);
        System.out.println(filteredStr);

        // Trim
        System.out.printf("---Trim---: \n");
        System.out.println(badWordContainer);
        System.out.println(badWordContainer.trim());

        // Subtring, indexOf, split
        System.out.printf("---Subtring, indexOf, split----: \n");

        String url = "https://google.com";
        System.out.println(url.length());
        System.out.println(url.indexOf("h"));
        System.out.println(url.indexOf("https:"));
        //check exits string value , if have exits, return index of the start index
        // get value from index 0 to index 3
        System.out.println(url.substring(0, 3));
        // get value from index 2 to end index
        System.out.println(url.substring(2, url.length()));
        // or use
        System.out.println(url.substring(2));

        //Split
        System.out.printf("---Split is----: \n");

        String[] splistStr = url.split("://"); // cut at ://
        System.out.println(Arrays.toString(splistStr));

        //Regex | Regular Expression
        String myCookingTime = "    105 mins";
        // TODO: Patten and Matcher

        String myCookingTimeNumStr = myCookingTime.replaceAll("[^0-9]",""); // tất cả những cái gì đó không phải(^) từ 0-9 , thì thay thế nó bằng rỗng
        System.out.println(myCookingTimeNumStr);

        int cookingTime = Integer.valueOf(myCookingTimeNumStr);
        System.out.println(cookingTime);// convert to number

        System.out.println("cookingTime is: " + cookingTime + 1);
        System.out.println("cookingTime is: " + (cookingTime + 1)); // bao nó vào ngoặc tròn để nó tính toán kết quả

        // Concat (Concatenation)
        System.out.printf("---Concat---:\n");

        String s1 = "Hello, ";
        String s2 = "Teo ";
        System.out.println(s1.concat(s2));
        //or use
        System.out.println(s1 + s2);

    }
}
