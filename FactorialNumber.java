public class FactorialNumber {
    public static void main(String[] args) {
        int num = 7;
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
