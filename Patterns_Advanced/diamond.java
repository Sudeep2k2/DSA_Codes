import java.util.*;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the diamond pattern : ");
        int rows = sc.nextInt();

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }

            // for (int j=1; j<=rows-i; j++) {
            //     System.out.print(" ");
            // }

            System.out.println();
        }

        for (int i=rows; i>=0; i--) {
            for (int j=rows-i; j>0; j--) {
                System.out.print(" ");
            }

            for (int j=2*i-1; j>0; j--) {
                System.out.print("*");
            }

            // for (int j=rows-i; j>=0; j--) {
            //     System.out.print(" ");
            // }

            System.out.println();
        }

    }
}