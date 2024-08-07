import java.util.*;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the Floyd's Triangle : ");
        int count = 1;
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }   
}