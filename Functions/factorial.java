import java.util.*;

public class factorial {

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
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int factorial = fact(n);
            System.out.println("The factorial of " + n + " is " + factorial);
        }   
}