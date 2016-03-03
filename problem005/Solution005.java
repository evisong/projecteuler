/**
 * https://projecteuler.net/problem=5
 *
 * Smallest multiple
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Solution005 {
    public static void main(String[] args) {
        int a = 2520;
        while (true) {
            a++;
            if (canDiv(a, 20)) {
                break;
            }
        }
        System.out.println(a);
    }

    private static boolean canDiv(int input, int maxDiv) {
        for (int i = 1; i <= maxDiv; i++) {
            if (input % i != 0) {
                return false;
            }
        }

        return true;
    }
}