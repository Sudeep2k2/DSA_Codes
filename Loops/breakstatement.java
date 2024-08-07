public class breakstatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("I am out of the loop");
    }    
}