public class ReverseNumber {
    public static void main(String args[]) {
        int n = 23456;
        int dup = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Rev of the Number is " + dup + " is " + rev);
    }
}
