import java.util.*;

public class sumofnnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of given n numbers is : " + sum);
    }
}
