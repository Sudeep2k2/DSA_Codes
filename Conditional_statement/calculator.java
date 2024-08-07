import java.util.*;

public class calculator {
    public static void main(String[] args) {
        //Design a calcuator using switch and take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation: ");
        char operation = sc.next().charAt(0);
        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;  
            default:
                System.out.println("Invalid operation");
        }
        System.out.println("The result is: " + result);
    }
}