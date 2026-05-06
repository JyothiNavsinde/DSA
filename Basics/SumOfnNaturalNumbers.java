package Basics;

public class SumOfnNaturalNumbers {
    public static void main(String args[]) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum Of " + n + " Natural Numbers : " + sum);
    }
}
