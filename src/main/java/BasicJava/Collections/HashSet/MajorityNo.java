package Collections.HashSet;

import java.util.*;

public class MajorityNo {

    public static void main(String[] args) {
       System.out.println();
        int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        majorityElement(nums);

        int[] num2 = { 1, 2 };
        majorityElement(num2);
    }

    public static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // add all elements in map

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 1 + map.get(nums[i]));
            } else {
                map.put(nums[i], 1);
            }
        }

        // find all elements with freq > n/3

        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 3) {
                System.err.println(i);
            }
        }

    }

}
