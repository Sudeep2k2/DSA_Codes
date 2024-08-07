import java.util.*;

public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result;

        result = (marks > 40) ? "Pass" : "Fail";
        System.out.println("The result is: " + result);
    }
}