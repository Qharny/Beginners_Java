public class DivisibleByAll {
    public static void main(String[] args) {
        int number = 1;
        boolean found = false;
        while (!found) {
            if (number % 3 == 0 && number % 7 == 0) {
                System.out.println(number);
                found = true;
            } 
            else {
                number++;
            }
        }
    }
}
