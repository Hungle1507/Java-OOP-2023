package lession_05;

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
        String badWordContainer = "bad , very bad , sth else, bad";
        String filteredStr = badWordContainer.replace("bad", "b**");

        System.out.println(badWordContainer);
        System.out.println(filteredStr);

    }
}
