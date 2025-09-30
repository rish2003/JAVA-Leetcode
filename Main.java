import Conditionals.Switch;
import Conditionals.Loops;
import Conditionals.DataStructures;
import java.util.*;


class Car  {
    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

}

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2019);

        System.out.println(car1.model + " " + car1.year);
        System.out.println(car2.model + " " + car2.year);
        int day = 3;
        Switch sw = new Switch();
        sw.checkDay(day);
        Loops lp = new Loops();
        lp.whileLoop(5);
        Loops fe = new Loops();
        int[] arr = {1,2,3,4,5};
        fe.forEachloop(arr);

        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Rishabh", 21);
        mp.put("Himanshu", 22);
        mp.put("Aryan", 20);

        DataStructures ds = new DataStructures();
        ds.arrayIt(arr);
        ds.HashMapExample(mp);
    }
}
