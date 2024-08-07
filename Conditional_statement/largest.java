import java.util.*;
public class largest {
    public static void main(String[] args){
        int a, b;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();

        if(a >= b){
            System.out.println("The number a is larger than b");
        }else{
            System.out.println("The number b is larger than a");
        }
    }
}
