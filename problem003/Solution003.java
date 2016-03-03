/**
 * https://projecteuler.net/problem=3
 * 
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Solution003 {
    public static void main(String[] args) {
        long input = 600851475143L;
        int div = 2;
        long n = input;

        while (div < n) {
            //System.out.println(div);
            //System.out.println(n);
            //System.out.println("===========");
            if (n % div == 0) {
                n = n / div;
            } else {
                div++;
            }
        }

        System.out.println(div);
    }
}