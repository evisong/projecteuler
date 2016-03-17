/**
 * https://projecteuler.net/problem=10
 * Summation of primes
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */
public class Solution010 {
    public static void main(String[] args) {
        int max = 2000000;
        long sum = 2; 

        for (int i = 1; i < max; i += 2) {
            if (isPrime(i)) {
                //System.out.println(i);
                sum += i; 
            }
        }

        System.out.println(sum);
    }

    private static boolean isPrime(int input) {
        switch (input) {
            case 1:
                return false;
            case 2: 
            case 3:
                return true;
        }

        if (input % 2 == 0 || input % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i <= Math.sqrt(input)) {
            if (input % i == 0 || input % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }
}