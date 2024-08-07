import java.util.*;

public class linearSearch {
    public static int linearsearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
    
        return -1;
    }

    public static void main(String[] args) {
        int numbers [] = {2,4,5,6,7,10,12,114,16,14};
        int key = 10;

        int index = linearsearch(numbers,key);

        if(index == -1) {
            System.out.println("Not Found!");
        }
        else {
            System.out.println("Key is at index :" + index);
        }
    }
}