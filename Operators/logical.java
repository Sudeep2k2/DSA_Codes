public class logical {
    public static void main(String[] args) {
        // The second type of operator is logical operator, which operates on boolean operands
        boolean a = true;
        boolean b = false;
        // The first logical operator is &&, which returns true if both operands are true
        boolean c = a && b;
        System.out.println("Is a and b true: " + c);
        // The second logical operator is ||, which returns true if any one of the operands is true
        boolean d = a || b;
        System.out.println("Is a or b true: " + d);
        // The third logical operator is !, which returns true if the operand is false
        boolean e = !a;
        System.out.println("Is a false: " + e);
        boolean f = !b;
        System.out.println("Is b false: " + f);
    }
}
