/**
 * https://projecteuler.net/problem=4
 * 
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
import java.lang.StringBuffer;

public class Solution004 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int a = i * j;
                if (isPalindromic(a)) {
                    result = a > result ? a : result;
                }
            }
        }

        System.out.println(result);
    }

    private static boolean isPalindromic(int value) {
        String str = String.valueOf(value);
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse.equals(str);
    }
}