public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 45};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
