package lession_06;

public class Calculator {
    // Method signature
    // Method overloading (giống giau ở name nhưng sẽ khác nhau ở parameter truyền vào, ex: sum tổng 2 sum tổng 3 )
    public int sum (int  num1, int num2){
        return num1 + num2;
    }
    public int sum (int  num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    //Varagrs | Rest Parameter (Những Parameter còn lại)
    public int sum (int  num1, int num2, int ... resNumber){
        int arrTotal = 0;
        for (int number : resNumber) {
            arrTotal = arrTotal + number;
        }
        return num1 + num2 + arrTotal;
        //or use_ return arrTotal;
    }

    //WHEN overloading happen | xuất hiện ở thời điểm Compile time
    //WHEN overriding happen | xuất hiện ở thời điểm Run time
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1,2);
        calculator.sum(1,2,3);
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
