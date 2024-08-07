public class callByValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside the method: a = " + a + " and b = " + b);        
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before calling the method: a = " + a + " and b = " + b);
        swap(a, b);
        System.out.println("After calling the method: a = " + a + " and b = " + b);   
    }
}
