import java.util.*;

class strinOperations {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter any string with vowels:");
        String A = sc.nextLine();
        System.out.println();
        System.out.println("Output - " + solve(A));
        System.out.println();
        sc.close();
    }
    
    public static String solve(String A) {
        String B = A + A;
        System.out.println("Sring concatenation: " + B);
        B = B.replaceAll("[A-Z]", "");
        System.out.println("Sring without uppercase letters: " + B);
        B = B.replaceAll("[aeiou]", "#");
        System.out.println("Sring with vowels replaced by #: " + B);
        System.out.println();
        return B;
    }
}