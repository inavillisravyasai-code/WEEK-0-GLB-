public class GeneratePalindromes {
    public static void main(String[] args) {
        int n = 246; 

        System.out.print("Palindrome numbers less than " + n + ": ");
        for (int i = 0; i < n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}
