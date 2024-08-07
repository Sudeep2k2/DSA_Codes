import java.util.*;

public class prime {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       boolean isPrime = true;
        
       if(n == 2)
       {
              System.out.println(n + " is a prime number");
              return;
       } 
    //    for(int i = 2; i <= n/2; i++)    //This can be further optimised by running the loop only till the square root of n
       for(int i = 2; i <= Math.sqrt(n); i++){
           if(n%i == 0) {
               isPrime = false;
               break;
           }
       }

       if(isPrime) {
           System.out.println(n + " is a prime number");
       } else {
           System.out.println(n + " is not a prime number");
       }
       }
}