import java.util.Scanner;

public class getUser {
    public static void main(String[] args) {

        System.out.print("Please type your name and press Enter: "); // or println
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // using next reads only the first character
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
