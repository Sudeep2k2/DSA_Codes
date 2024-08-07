import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the butterfly pattern : ");
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }

            for (int j=0; j<2*(rows-i-1); j++) {
                System.out.print("  ");
            }

            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=rows-1; i>=0; i--) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }

            for (int j=0; j<2*(rows-i-1); j++) {
                System.out.print("  ");
            }

            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}