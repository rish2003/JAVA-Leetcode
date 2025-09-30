package Conditionals;
import java.util.HashMap;
import java.util.Iterator;

public class DataStructures {
    public void arrayIt(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    // public void arrayIterator(int[] nums){
    //     Iterator<Integer> it = nums.iterator(); // nums is an array and iterator works only on java collections
    //     while(it.hasNext()){
    //         System.out.println(it.next());
    //     }
    // }

    public void HashMapExample(HashMap<String, Integer> map){
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        for(Integer value : map.values()){
            System.out.println(value);
        }
        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
