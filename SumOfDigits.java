import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int temp = Math.abs(num);
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10;  
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
        scanner.close();
    }
}
