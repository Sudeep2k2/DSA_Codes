import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args){
        int a, b, c;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();
        System.out.println("Enter the third number: ");
        c = input.nextInt();

        if(a >= b && a >= c){
            System.out.println("The number a is the largest");
        }else if(b >= a && b >= c){
            System.out.println("The number b is the largest");
        }else{
            System.out.println("The number c is the largest");
        }
    }
}
