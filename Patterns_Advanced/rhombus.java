import java.util.*;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the rhombus pattern : ");
        int rows = sc.nextInt();
        for (int i=rows; i>0; i--) {
            for (int j=0; j< i; j++) {
                System.out.print(" ");
            }

            for (int j=0; j<rows; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}