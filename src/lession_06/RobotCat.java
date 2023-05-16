package lession_06;

public class RobotCat {
//    public RobotCat( String name) {
//        this.name = name;
//    //  System.out.println(name);
//    }
//    //Setter
//    public void setName(String name){
//        this.name = name;
//    }
//    //Getter
//    public String getName(){
//        return name;
//    }
//    //
//    public void printName(){
//        System.out.println(name);
//    }


    public RobotCat(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
        System.out.println(year);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println(color);
    }

    private String name;
    private String year;
    private String color;

}
