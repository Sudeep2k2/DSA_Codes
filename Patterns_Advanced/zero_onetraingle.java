import java.util.*;

public class zero_onetraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the Floyd's Triangle : ");
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<=i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }   
}