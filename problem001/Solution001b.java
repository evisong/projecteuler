/**
 * https://projecteuler.net/problem=1
 *
 * Multiples of 3 and 5
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Solution001b {
    public static void main(String[] args) {
        int input = 1000;
        int sum = divSum(input, 3) + divSum(input, 5) - divSum(input, 15);

        System.out.println(sum);
    }

    private static int divSum(int input, int div) {
        int max = (input - 1) / div;
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return sum * div;
    }
}