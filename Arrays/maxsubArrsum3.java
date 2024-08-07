public class maxsubArrsum3 {
    //kadane's algorithm [O(n) time complexity]

    public static void kadanes (int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i=0; i<numbers.length; i++) {
            cs += numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }

        System.err.println("Our max subarray is : "+ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 5, -3};
        kadanes(numbers);

}
}