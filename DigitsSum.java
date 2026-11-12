import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int temp = Math.abs(num); // Handles negative numbers safely
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10; // Extract the last digit and add to sum
            temp /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
        scanner.close();
    }
}
