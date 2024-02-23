package Quiz;

public class quiz2 {
    public static void main(String[] args) {
        //  a java code that displays all number from 30 to 60
        for(int i = 30 ; i <= 60 ; i++) {
            if((i / 3)==0 && (i / 4)==0) {
                System.out.println(i);
            }
        }
    }
}

//public class Exercise50 {
//    public static void main(String args[]) {
//        // Print numbers divided by 3
//        System.out.println("\nDivided by 3: ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0)
//                System.out.print(i + ", ");
//        }
//
//        // Print numbers divided by 5
//        System.out.println("\n\nDivided by 5: ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 5 == 0)
//                System.out.print(i + ", ");
//        }
//
//        // Print numbers divided by both 3 and 5
//        System.out.println("\n\nDivided by 3 & 5: ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.print(i + ", ");
//        }
//        System.out.println("\n");
//    }
//}