/**
 * https://projecteuler.net/problem=9
 *
 * Special Pythagorean triplet
 * Problem 9
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Solution009 {
    public static void main(String[] args) {
        int a, b, c;
        int max = 1000;

        for (a = 1; a < max; a++) {
            for (b = a + 1; b < max; b++) {
                for (c = b + 1; c < max; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
                        if(a + b + c == 1000) {
                            System.out.println(a * b * c);
                            return; 
                        }
                    }
                }
            }
        }
    }
}