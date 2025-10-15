package LeetCodeDsa.HashMapSet;
import java.util.*;

public class Hashing3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {2,3,2,3,2,5};
        for(int elem : arr){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }

        System.out.println(map);

    }
}
