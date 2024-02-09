package Syntax;
public class EqualityRelation {
    public static void main(String[] args) {
        int A = 28;
        int B = 31;
        // Equality Operation
        System.out.print("Is "+A+" equal to "+B+"?: ");
        System.out.println(A==B);
        System.out.print("Is "+A+" not equal to "+B+"?: ");
        System.out.println(A==B);

        // Relational operation
        System.out.print("Is "+A+" greater than "+B+"?: ");
        System.out.println(A>B);
        System.out.print("Is "+A+" less than "+B+"?: ");
        System.out.println(A<B);
        System.out.print("Is "+A+" greater than or equal to "+B+"?: ");
        System.out.println(A>=B);
        System.out.print("Is "+A+" less than or equal to "+B+"?: ");
        System.out.println(A>=B);

        // TERNARY OPERATOR ?
        int x = (A>B) ? 40:80;
        System.out.println(x);
    }
}
