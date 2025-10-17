package LeetCodeDsa.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(21);
        list.add(18);
        list.add(5);
        list.add(10);

        System.out.println(list.get(3));

        list.set(3,50); // arr[3] = 50
        System.out.println(list.get(3));
        System.out.println(list);

        int n = list.size(); // list.length
        list.remove(n-1);
        System.out.println(list);

        Collections.sort(list);
    }
}
