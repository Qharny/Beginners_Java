package File_handling;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;

import java.io.*;

public class Fileconverter {
    public static void main(String[] args) {
        String inputFile = "Test.txt";
        String outputFile = "Out.txt";

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(inputFile);

            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // FileWriter writes text files in the default encoding.
            FileWriter fileWriter = new FileWriter(outputFile);

            // Wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Convert the line to uppercase.
                String uppercaseLine = line.toUpperCase();

                // Write the uppercase line to the output file.
                bufferedWriter.write(uppercaseLine);
                // Add a newline character after each line.
                bufferedWriter.newLine();
            }

            // Close readers and writers.
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("File conversion successful. Check Out.txt for the result.");
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
