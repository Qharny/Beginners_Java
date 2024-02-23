//package File_handling;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class ReadingFile {
//    public static void main(String[] args) throws FileNotFoundException {
//        // get file from project folder
//        File inputFile = new File("text.txt");
//        // file to delete
//       // File deletedFile = new File("delete.txt");
//
//        // get file from desktop
//        File inputDesktopFile = new File("\"C:\\Users\\canny\\OneDrive\\Desktop\\text.txt\"");
//
//        // check if file exits
//        System.out.println(inputFile.exists()); // does it print true
//        System.out.println(inputDesktopFile.exists()); // does it print true
//
//        // check for other properties
//        System.out.println(inputFile.length());
//        System.out.println(inputFile.getAbsoluteFile());
//        System.out.println(inputFile.getTotalSpace());
//
//        // deletedFile.delete();
//
//        // read content in text file
//        Scanner input = new Scanner(inputFile);
//        // Open file
//        // loop to iterate the file
//
//        while (input.hasNextLine()){
//            System.out.println(input.nextLine());
//        }
//
//        input.close();
//
//    }
//
