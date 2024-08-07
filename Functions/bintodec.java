import java.util.*;

public class bintodec {
    public static void binToDec (int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);

            pow++;
            binNum /= 10;
        }

        System.out.println("The decimal equivalent of " + myNum + " is " + decNum);
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binNum = sc.nextInt();
        binToDec(binNum);
    }
}