package HashSet;

import java.util.HashSet;
import java.util.Set;

public class myHashSet {
    public static void main(String[] args) {
        // Creating of hashSet
        Set<Integer> stdAges = new HashSet<Integer>();
        HashSet<String> stdNames = new HashSet<String>();
        HashSet<Double> stdMarks = new HashSet<Double>();

        // ADDING CONTENT TO HASHSET
        stdAges.add(26);
        stdAges.add(27);
        stdMarks.add(89.7);
        stdNames.add("Jim");
        stdNames.add("Sam");

        System.out.println(stdAges.size());
        System.out.println(stdNames.size());
        System.out.println(stdMarks.size());
        System.out.println(stdAges);
        System.out.println(stdNames);
        System.out.println(stdMarks);
        System.out.println(stdAges.contains(26));
    }
}
