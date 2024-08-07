import java.util.*;

public class selectionSort {
    //large elements come to the end ofthe array by swapping with adjacent elements 
    public static void selection(int sortArray[]) {
        int n = sortArray.length;
        for(int i=0; i<n-1; i++) {
            int minPos = i;
            for(int j=i+1; j<n-1; j++) {
                if(sortArray[minPos] > sortArray[j]) {
                    minPos = j;
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
        selection(sortArray);
        
    }
}