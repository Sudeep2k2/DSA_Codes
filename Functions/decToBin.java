import java.util.*;

public class decToBin {
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;

        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int)Math.pow(10, pow);
            decNum /= 2;
            pow++;
        }

        System.out.print("The binary equivalent of " + myNum + " is " + binNum);

    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decNum = sc.nextInt();
        decToBin(decNum);
    }
}