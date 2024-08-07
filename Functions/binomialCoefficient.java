import java.util.*;

public class binomialCoefficient {
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        
        for(int i = n - 1; i >= 1; i--) {
            n = n * i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        int nCr = fact(n) / (fact(r) * fact(n - r));
        System.out.println("The binomial coefficient of " + n + " and " + r + " is " + nCr);
    }
}