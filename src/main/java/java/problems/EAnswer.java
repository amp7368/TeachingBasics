package java.problems;

import sam.java.utils.NumberUtils;

// what is the sum of all the prime numbers below 1,000,000
public class EAnswer {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i < 1000000; i++) {
            if (NumberUtils.isPrime(i)) {
                answer = answer + i;
            }
        }
    }
}
