public class MidElement {
    public static void main(String args[]) {
        int a = 2, b = 10, c = 4;
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a + " is mid element");
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b + " is mid element");
        } else {
            System.out.println(c + " is mid element");
        }
    }
}
