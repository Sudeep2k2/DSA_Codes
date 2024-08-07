import java.util.*;

public class calculateSum {
    
    public static int sum(int a, int b) { //parameteres or formal parameters
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = sum(a, b); //arguments or actual parameters
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}