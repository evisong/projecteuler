/**
 * https://projecteuler.net/problem=7
 * 
 * 10001st prime
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 */
public class Solution007 {
    public static void main(String[] args) {
        int[] primes = new int[10001];
        int current = 1;
        primes[0] = 2;
        int cursor = 1; 
        while (cursor < 10001) {
            current += 2;
            if (isPrime(current)) {
                primes[cursor] = current;
                cursor++;
            }
        }

        System.out.println(primes[10000]);
    }

    private static boolean isPrime(int input) {
        if (input % 2 == 0) {
            return false;
        }

        for (int i = 3; i < input; i += 2) {
            if (input % i == 0) {
                return false;
            }
        }

        return true;
    }
}