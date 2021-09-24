package java.problems;

// what is the first number that is divisible by 1,2,3,4,5,6,7,8, and 9?
public class CAnswer {
    public static void main(String[] args) {
        boolean isDivisible = false;
        int numberAt = 1;
        while (!isDivisible) {
            isDivisible = true;
            for (int i = 2; i < 10; i++) {
                if (numberAt % i != 0) {
                    isDivisible = false;
                    break;
                }
            }
            numberAt++;
        }
        numberAt--;
        System.out.println(numberAt);
    }
}
