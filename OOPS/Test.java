package OOPS;
import OOPS.Basics.Car;

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2020;
        myCar.speed = 0;

        myCar.accelerate(50);
        System.out.println("Current speed: " + myCar.speed);

        myCar.brake(20);
        System.out.println("Current speed after braking: " + myCar.speed);
    }
}
