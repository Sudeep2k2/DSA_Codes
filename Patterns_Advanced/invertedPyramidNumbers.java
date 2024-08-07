import java.util.*;

public class invertedPyramidNumbers {
    public static void invpy(int n) {
        for(int i=0; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(j + " ");
            }
            
            for(int j=0; j<=i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the inverted pyramid : ");
        int rows = sc.nextInt();
        invpy(rows);
    }
}