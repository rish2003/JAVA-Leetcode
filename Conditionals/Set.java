package Conditionals;
import java.util.Iterator;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        // 1. Enhanced for loop
        for (int n : nums) {
            System.out.println(n);
        }

        // 2. Iterator
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 3. forEach + Lambda
        nums.forEach(n -> System.out.println(n));
    }
}
