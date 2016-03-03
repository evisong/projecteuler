/**
 * https://projecteuler.net/problem=5
 *
 * Smallest multiple
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Solution005b {
    public static void main(String[] args) {
        // Wrong
        System.out.println(2520 * 11 * 13 * 17 * 19);
        // Right
        System.out.println(2520 * 11 * 13 * 2 * 17 * 19);
    }
}