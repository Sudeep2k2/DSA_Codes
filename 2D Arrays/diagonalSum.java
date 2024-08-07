import java.util.*;

public class diagonalSum {

    public static int diagonal(int matrix[][]) {
        int sum = 0;


        //Bruteforce approach with time compelxity O(n2)
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         //primary daigonal
        //         if(i==j) {
        //             sum += matrix[i][j];
        //         }

        //         //secondary daigonal
        //         else if(i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }


        //this is the optimized solution having O(n) time complexity
        for(int i=0; i<matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if(i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i]; // since i+j = n-1 is the condition for sd, but we don't want to run another loop to reduce the time complexity but not including j. since i+j = n-1 => j = n-1-i
            }
        }

        return sum;
    }

    public static void main(String[] args) {
            int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8}, 
                {9,10,11,12},
                {13,14,15,16}
            };

            System.out.println("The diagonal sum is : "+diagonal(matrix));
    }
}