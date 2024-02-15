package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        // get file from project folder
        File inputFile = new File("text.txt");

        // read content in text file
        Scanner input = null;
        try{
            input = new Scanner(inputFile);

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        while (true){
            assert input != null;
            if (!input.hasNext()) break;
            if (input.hasNextInt()){
                int x = input.nextInt();
                System.out.println(x+": is an integer");
            } else if (input.hasNextDouble()) {
                double x = input.nextDouble();
                System.out.println(x+": is a double");
            } else if (input.hasNextBoolean()) {
                boolean x = input.nextBoolean();
                System.out.println(x+": is a boolean");
            }
            else {
                String x = input.nextLine();
                System.out.println(x+": is a String");
            }
        }
        input.close();

    }
}
