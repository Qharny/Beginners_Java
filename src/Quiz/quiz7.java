package Quiz;

public class quiz7 {
    public static void main(String[] args) {
        // write a for loop which prints out numbers from 10 to 500 which are multiples of both 3 and 4 but not multiple of 5?
        for (int i = 10; i <= 500;i++) {
            if((i%3 == 0) && (i%4 == 0) && (i%5 != 0)) {
                System.out.println(i);
            }

        }
    }
}
