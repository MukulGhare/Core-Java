package Collections.HashSet;

import java.util.HashMap;
import java.util.Map;
// import java.util.HashSet;
// import java.util.Iterator;
//import java.util.Map.Entry;

public class Hashing {

    public static void main(String[] args) {
        System.out.println();
        // HashSet<Integer> set = new HashSet<>();
        // adding ele in set
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(1);

        // searching ele in set
        // System.out.println(set.contains(1));
        // System.out.println(set.contains(6));

        // remove ele in set
        // set.remove(3);

        // Iterator it = set.iterator();

        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("Chine", 140);
        map.put("USA", 130);
        map.put("Ireland", 20);

        System.out.println(map);

        // search in map
        if (map.containsKey("India")) {
            System.out.println("Key Present in map ");
        } else {
            System.out.println("Key not present");
        }

        if (map.containsKey("Spain")) {
            System.out.println("Key Present in map ");
        } else {
            System.out.println("Key not present");
        }

        // get value
        System.out.println(map.get("USA"));
        System.out.println(map.get("England"));

        // Iterate in map

        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() +" "+ e.getValue());
        }

        // int[] arr = {12,15,16};

        // for ( int i=0; i<arr.length ; i++){
        //     System.out.print(arr[i] +" ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val+" ");
        // }

    }

}
