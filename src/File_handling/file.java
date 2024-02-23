package File_handling;

import java.io.*;

public class file {
    public static void main(String[] args) {
        try {
            // Create FileReader and BufferedReader for input file
            FileReader inputFileReader = new FileReader("Test.txt");
            BufferedReader inputBufferedReader = new BufferedReader(inputFileReader);

            // Create FileWriter and BufferedWriter for output file
            FileWriter outputFileWriter = new FileWriter("Out.txt");
            BufferedWriter outputBufferedWriter = new BufferedWriter(outputFileWriter);

            String line;
            while ((line = inputBufferedReader.readLine()) != null) {
                // Convert the line to uppercase and write to output file
                outputBufferedWriter.write(line.toUpperCase());
                outputBufferedWriter.newLine();
            }

            // Close the BufferedReader and BufferedWriter
            inputBufferedReader.close();
            outputBufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
