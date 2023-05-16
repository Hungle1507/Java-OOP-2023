package lession_07;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat("batteryRobotCat","15/05/2023");
        RobotCat solarRobotCat = new BatteryRobotCat("batteryRobotCat","15/05/2023");

        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());
    }
}
