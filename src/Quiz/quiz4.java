package Quiz;

import java.util.Scanner;

public class quiz4 {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        // print the word in reverse
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        input.close();
    }
}
