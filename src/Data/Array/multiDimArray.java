package Data.Array;

import java.util.Arrays;

public class multiDimArray {
    public static void main(String[] args) {
        double [][] marks = new double[5][2];

        int[][] ages = {{23, 56, 78}, {36, 88, 16}, {24, 12, 34}};

        // ADD content without looping
        marks[0][0] = 2.9;
        marks[0][1] = 3.5;

        System.out.println(Arrays.deepToString(marks));

        System.out.println(Arrays.deepToString(ages));

        // Adding content with loop
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println(Arrays.deepToString(marks));


    }
}
