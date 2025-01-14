import java.util.*;

public class binarySearch {
    public static int bs(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] < key) { //right
                start = mid+1;
            }

            else { //left
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,9,10,12,14,15,18};
        int key = 10;

        System.out.println("Index for key is : " + bs(numbers,key));
    }
}