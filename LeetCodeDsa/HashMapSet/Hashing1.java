package LeetCodeDsa.HashMapSet;
import java.util.*;

public class Hashing1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple",3);
        map.put("Banana",5);
        map.put("Orange",2);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
