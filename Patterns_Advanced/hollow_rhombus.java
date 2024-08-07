import java.util.*;

public class hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the rhombus pattern : ");
        int rows = sc.nextInt();
        for (int i=rows; i>0; i--) {
            for (int j=0; j < i; j++) {
                System.out.print(" ");
            }

            if(i == 1 || i == rows) {
                for (int j=0; j<rows; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j=0; j<rows; j++) {
                    if(j == 0 || j == rows-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
                        
            System.out.println();
        }
    }
}