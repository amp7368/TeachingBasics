package work.problems;

// What is the sum of all the numbers below 1,000,000
public class AAnswer {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i < 1000000; i++) {
            answer = answer + i;
        }
        System.out.println(answer);
    }
}
