package LeetCodeDsa.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(77);
        list.add(55);
        list.add(33);
        list.add(2);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
