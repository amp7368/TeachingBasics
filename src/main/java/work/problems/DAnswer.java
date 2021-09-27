package work.problems;


import work.utils.NumberUtils;

// what is the 123456th prime?
public class DAnswer {
    public static void main(String[] args) {
        int primeAt = 0;
        int numberAt = 0;
        while (primeAt != 123456) {
            numberAt = numberAt + 1;
            if (NumberUtils.isPrime(numberAt)) {
                primeAt = primeAt + 1;
            }
        }
        System.out.println(numberAt);
    }
}
