package File_handling;

import java.io.File;

public class ReadingFile {
    public static void main(String[] args) {
        // get file from project folder
        File inputFile = new File("text.txt");

        // get file from desktop
        File inputDesktopFile = new File("\"C:\\Users\\canny\\OneDrive\\Desktop\\text.txt\"");

        // check if file exits
        System.out.println(inputFile.exists()); // does it print true

    }
}
