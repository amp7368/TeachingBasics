package work.utils;

import java.util.ArrayList;

public class NumberUtils {
    public static boolean isPrime(int number) {
        int upper = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < upper; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] getProperDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int upper = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < upper; i++) {
            if (number % i == 0) {
                divisors.add(number);
            }
        }
        int size = divisors.size();
        int[] divisorsAnswer = new int[size];
        for (int i = 0; i < size; i++) {
            divisorsAnswer[i] = divisors.get(i);
        }
        return divisorsAnswer;
    }
}
