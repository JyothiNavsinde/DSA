public class MaximumOf3Numbers {
    public static void main(String args[]) {
        int a = 10, b = 2, c = 21;
        if (a > b && a > c) {
            System.out.println(a + " is maximum");
        } else if (b > a && b > c) {
            System.out.println(b + " is maximum");
        } else {
            System.out.println(c + " is maximum");
        }
    }
}
