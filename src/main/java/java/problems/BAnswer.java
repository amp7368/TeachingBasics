package java.problems;

// what is the sum of all even numbers below 1,000,000
public class BAnswer {
    public static void main(String[] args){
        int answer = 0;
        for (int i = 0; i < 1000000; i = i + 2) {
            answer = answer + i;
        }
        System.out.println(answer);
    }
}
