import java.util.*;

public class bubbleSort {
    //large elements come to the end ofthe array by swapping with adjacent elements 
    public static void bubble(int sortArray[]) {
        int n = sortArray.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1; j++) {
                if(sortArray[j] > sortArray[j+1]) {
                    int temp = sortArray[j];
                    sortArray[j] = sortArray[j+1];
                    sortArray[j+1] = temp;
                }
            }
        }
        printArr(sortArray);
    }

    public static void printArr(int sortArray[]) {
        for(int i=0; i<sortArray.length; i++) {
            System.out.print(sortArray[i]+" ");
        }
    }

    public static void main(String[] args) {
        int sortArray[] = {5,4,1,3,2};
        bubble(sortArray);
        
    }
}