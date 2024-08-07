public class assignment {
    public static void main(String[] args) {
        // The third type of operator is assignment operator, which assigns value to a variable
        int a = 10;
        int b = 20;
        // The first assignment operator is =, which assigns the value of right operand to the left operand
        int c = a;
        System.out.println("The value of c is: " + c);
        // The second assignment operator is +=, which adds the right operand to the left operand and assigns the result to the left operand
        c += a;
        System.out.println("The value of c after adding a is: " + c);
        // The third assignment operator is -=, which subtracts the right operand from the left operand and assigns the result to the left operand
        c -= a;
        System.out.println("The value of c after subtracting a is: " + c);
        // The fourth assignment operator is *=, which multiplies the right operand with the left operand and assigns the result to the left operand
        c *= a;
        System.out.println("The value of c after multiplying a is: " + c);
        // The fifth assignment operator is /=, which divides the left operand by the right operand and assigns the result to the left operand
        c /= a;
        System.out.println("The value of c after dividing by a is: " + c);
        // The sixth assignment operator is %=, which gives the remainder of the left operand divided by the right operand and assigns the result to the left operand
        c %= a;
        System.out.println("The value of c after modulo by a is: " + c);
    }
}
