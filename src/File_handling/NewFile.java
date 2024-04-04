package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\canny\\Desktop\\text.txt");

            Scanner myFile = new Scanner(file);
            while (myFile.hasNextLine()) {
                String newFile = myFile.nextLine();
                System.out.println(myFile);
                
            }



    }
}
