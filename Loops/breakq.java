import java.util.*;

public class breakq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if(n%10 == 0)
            {
                System.out.println("You entered a number which is a mutiple of 10. Exiting the loop.");
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}