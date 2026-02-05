package Collections.HashSet;

import java.util.*;

public class ItineraryTickets {

    public static String findStart(HashMap<String, String> map){
        HashMap<String,String> rMap = new HashMap<>();

        for(String key : map.keySet()) {
            rMap.put(map.get(key), key);
        }
        for (String keys : map.keySet()){
            if(!rMap.containsKey(keys)){
                return keys;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        System.out.println();
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("MUC", "LHR");
        tickets.put("JFK", "MUC");
        tickets.put("SFO", "SJC");
        tickets.put("LHR", "SFO");

        String start = findStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.print(start+" -> ");
            start=tickets.get(start);
        }
        System.out.print(start);

    }

}
