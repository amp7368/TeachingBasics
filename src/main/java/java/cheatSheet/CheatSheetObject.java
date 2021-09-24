package java.cheatSheet;

public class CheatSheetObject {

    // how to declare a variable
    // Type variableName = new Type();
    // int variableName = 1;

    // how to call a static method
    // Type.staticMethod(argument1,argument2);

    // how to call a non-static method
    // variableName.method(argument1,argument2);


    public boolean method() {
        boolean trueFalse = true;       // a boolean is always true or false
        int number = 1;                 // an int is a number without a decimal
        double preciseNumber = 1.5;     // a double is a number with a decimal
        String word = "hello";          // a string is a word or a lot of words together
        Object thing = new Object();    // an object is just something that holds information and methods
        int[] array = new int[10];      // an array is a bunch of things next to each other in order

        return true;                    // return is whatever the method gives back almost as it's result
    }

    public static boolean staticMethod() {
        int answer = 0;



        // an if statement does the thing inside only if the condition equals true
        if(true){
            // this would be executed because the condition equals true
            // execute me
        }else{
            // this would not be executed because the condition equals true
            // execute me
        }


        // a while loop does the thing inside as long as the condition is true
        int i = 0;
        while (i < 10) {
            answer = answer + i;
            i++;
        }

        // a for loop can be thought of as having 3 parts
        // for (
        // something that executes once at the beginning of running ;
        // a condition that is checked to see if the body of the execution should happen again or not;
        // something that executes at the end of every execution of the body
        // ){
        //     do stuff
        // }
        for (int j = 0; j < 10; j++) {
            // do something
            answer = answer + j;
        }
        return false;
    }
}
