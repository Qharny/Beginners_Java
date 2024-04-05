package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\canny\\Desktop\\text.txt");

        Scanner myFile = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();
        while (myFile.hasNextLine()) {
            String newFile = myFile.nextLine();
            lines.add(newFile); // Add the line to the ArrayList
        }

        System.out.println(lines); // Print the ArrayList Close the Scanner object
    }
}




//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class NewFile {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("C:\\Users\\canny\\Desktop\\text.txt");
//
//        Scanner myFile = new Scanner(file);
//        while (myFile.hasNextLine()) {
//            String newFile = myFile.nextLine();
//            System.out.println(newFile); // Print the line read from the file, not the Scanner object
//        }
//    }
//}