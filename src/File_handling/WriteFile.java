package File_handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("outputFile.txt");

        // create a file and fill it with text
        outputFile.println("This is an updated file");
        outputFile.print("I love to code ");
        outputFile.print("in dart.");

        // close the printWriter
        outputFile.close();
    }
}
