import java.util.*;
public class scan {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println("You entered: " + str);
        sc.nextLine();

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("You entered: " + sentence);

        System.out.println("Enter a float: ");
        float f = sc.nextFloat();
        System.out.println("You entered: " + f);


        sc.close();
    }    
}
