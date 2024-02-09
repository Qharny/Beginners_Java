package character;

public class casting {
    public static void main(String[] args) {
        System.out.println("27321 reps char: " +(char)27321);
        System.out.println("20002 reps char: " +(char)20002);
        System.out.println("1067 reps char: " +(char)1067);
        System.out.println("263 reps char: " +(char)263);
        System.out.println("638 reps char: " +(char)638);

        // NUMBERS CHARACTER ARE STORED

        System.out.println("\' \' stores as num: " +(int)' ');
        System.out.println("\' \' stores as num: " +(int)'?');
        System.out.println("\' \' stores as num: " +(int)'A');
        System.out.println("\' \' stores as num: " +(int)'B');
        System.out.println("\' \' stores as num: " +(int)'a');
        System.out.println("\' \' stores as num: " +(int)'b');

        char letter = 'A';
        char num = '2';
        System.out.println("Is "+ letter  + " a number? "+ Character.isDigit(letter));
        System.out.println("Is "+ num  + " a letter? "+ Character.isLetter(num));
    }
}
