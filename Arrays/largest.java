import java.util.*;

public class largest {
    public static int large(int numbers[]) {
        int largest = 0;
        for (int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }    

    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 15, 16, 18, 20};
        System.out.println("Largest number is :" + large(numbers));
    }
}