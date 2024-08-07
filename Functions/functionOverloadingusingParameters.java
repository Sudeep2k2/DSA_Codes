public class functionOverloadingusingParameters {
    public static int sum(int a, int b) { //parameteres or formal parameters
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 2 and 3 is " + sum(2, 3));
        System.out.println("The sum of 2, 3 and 4 is " + sum(2, 3, 4));
    }
}