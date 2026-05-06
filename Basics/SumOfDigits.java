package Basics;

public class SumOfDigits {
    public static void main(String args[]) {
        int n = 7654321;
        int dup = n;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int rem = n % 10;
            n = n / 10;
            sum += rem;
        }
        System.out.println("Sum of Digits of " + dup + " is " + sum);
    }
}
