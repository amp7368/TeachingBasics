package work.tutorial;

public class ConditionalExample1 {
    public static void main(String[] args) {
        boolean condition = true; // assign the value of true to the variable condition
        if (condition) {

            System.out.println("This is the body of the if statement");

        } else { // else means otherwise

            System.out.println("This is the body of the else part of the if statement");

        }

    }

    public static void whileMethod() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i = i + 1;
        }
    }

    public static void forMethod() {
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void whileAndIfMethod() {
        int i = 0;
        while (i < 5) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
