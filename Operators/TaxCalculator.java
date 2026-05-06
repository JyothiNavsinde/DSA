public class TaxCalculator {
    public static void main(String args[]) {
        // tax = rate/100 * amount;
        int amount = 50000;
        int tax;
        tax = (amount >= 50000) ? (int) (amount * 0.1) : (int) (amount * 0.05);
        System.out.println(tax);
    }
}
