package Hash;


import java.util.HashMap;
import java.util.*;

public class MyHashMap {
    public static void main(String[] args) {

        // Creating hash Map
        Map<String, Integer> stdAges = new HashMap<String, Integer>();
        HashMap<Integer, Integer> stdDetails = new HashMap<>();

        // METHODS
        stdAges.put("Sam", 20);
        stdAges.put("Jimmy", 21);
        stdAges.put("Ben", 22);

        System.out.println("================================");
        System.out.println(stdAges);


    }
}
