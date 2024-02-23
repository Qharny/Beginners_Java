package Data.Array;

import java.util.ArrayList;

public class TheMultiDimArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String>stdNames = new ArrayList<String>();
        ArrayList<String>homeTown = new ArrayList<>();
        ArrayList<Double>StdMarks = new ArrayList<>();
        System.out.println(stdNames.size());

        // adding content to arrayList
        stdNames.add("Sam");
        stdNames.add("John");
        stdNames.add("Mary");
        System.out.println(stdNames.size());
        System.out.println(stdNames.get(0));
        System.out.println(stdNames);

        // Loop to add
        for (int i = 1; i < 100; i++){
        // Multiple of both 3 and 4
            if (i % 3 == 0 && i % 4 == 0) {
                stdNames.add(String.valueOf((double)i));
            }
        }


    }
}