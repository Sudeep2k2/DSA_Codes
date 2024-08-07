public class arithmetic {
    public static void main(String[] args) {

        //The first type is binary operator, which operates on two operands
        int a = 10;
        int b = 20;
        // The first binary operator is +, which adds two integers
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);
        // The second binary operator is -, which subtracts two integers
        int d = a - b;
        System.out.println("The difference of a and b is: " + d);
        // The third binary operator is *, which adds multiplies two integers
        int e = a * b;
        System.out.println("The product of a and b is: " + e);
        // The fourth binary operator is /, which adds divides two integers
        int f = a / b;
        System.out.println("The division of a and b is: " + f);
        // The fifth binary operator is %, which gives remainder of two integers
        int g = a % b;
        System.out.println("The modulo of a and b is: " + g);

        //The second type is unary operator, which operates on one operand value
        // The first type of unary operator is ++, which is used to increment the value by 1
        // The first type of increment operator is pre increment 
        int h = ++a;
        System.out.println("The pre increment of a is: " + h);
        // The second type of increment operator is post increment
        int i = a++;
        System.out.println("The post increment of b is: " + i);
        // The second type of unary operator is --, which is used to decrement the value by 1
        // The first type of decrement operator is pre decrement
        int j = --b;
        System.out.println("The pre decrement of b is: " + j);
        // The second type of decrement operator is post decrement
        int k = b--;
        System.out.println("The post decrement of b is: " + k);
    }
}