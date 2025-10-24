package LeetCodeDsa.HashMapSet;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //1. Insert(Key,value) pairs
        map.put("Rishabh",21);
        map.put("Raj",19);
        map.put("Aman",22);

        //2. Access Values
        System.out.println(map.get("Rishabh"));
        //3.Check If the key exists
        System.out.println(map.containsKey("Raj"));
        for(String key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }
        //4.Remove an entry
        map.remove("Aman");
        //5.Iterate through map

        for(String key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }
    }
}
