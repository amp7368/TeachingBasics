package work.tutorial;

public class ExecutionExample3 {
    public static void main(String[] args) {
        int i = 1;
        // currently the point of execution is here.


        // when I say doMethod1();
        // I'm asking someone else to complete a set of steps, and tell me when they finsih.
        doMethod1(); // this is changing the point of execution to somewhere else, and then coming back to this location after

        // it has carried out the execution of everything in doMethod1
        // now I'll print "i" which is 1
        System.out.println(i);

    }

    public static void doMethod1() {
        // this executes directly after "int i = 1;"
        int a = 3;
        String b = "hello";
        double c = 3.1;
        boolean d = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // now I return back to whatever I was doing before I "called" doMethod1
    }
}
