public class SumOfEvenPlaces {
    public static void main(String[] args) {
        int num = 24680;
        String numStr = String.valueOf(Math.abs(num));
        int sum = 0;

        for (int i = 1; i < numStr.length(); i += 2) {
            sum += numStr.charAt(i) - '0';
        }
        System.out.println("Sum of digits at even places: " + sum);
    }
}
