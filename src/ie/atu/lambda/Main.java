package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
       /*MathOperation addition = new Addition();
        System.out.println("Addition: " + addition.operate(5, 3));*/

        // Using a lambda expression instead of implementing the interface via a class
        /*MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));*/

        // Using a lambda expression instead of implementing the interface via a class
        StringOperation ToUpperCase = input -> input.toUpperCase();

        //Test the apply method with a string
        String input = "my name is andrea";
        String result = ToUpperCase.apply(input);

        //Print result
        System.out.println("Input:" + input);
        System.out.println("Result:" + result);

        //Part 2 Lambda

        // Using a lambda expression instead of implementing the interface via a class
        StringOperation ToUpperCase2= input2-> input2.toUpperCase();

        //Test the apply method with a string
        String input2= "my name is andrea";
        String result2= ToUpperCase2.apply(input2);

        //Print result
        System.out.println("Input:" + input2);
        System.out.println("Result:" + result2);

        //Part 3

        // Create a Runnable instance using a lambda expression
        Runnable task = () -> System.out.println("Hello from the thread");

        // Start a new thread with the Runnable
        Thread thread = new Thread(task);
        thread.start();  // This starts the thread and executes the Runnable

        // Optional: To ensure the main thread waits for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // If you'd like to print a message from the main thread as well:
        System.out.println("Main thread has finished executing.");


        //Part 4

        // Define a lambda to trim spaces from a string
        Function<String, String> trimSpaces = s -> s.trim();

        // Define a lambda to convert a string to lowercase
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        // Combine the lambdas: trim first, then convert to lowercase
        Function<String, String> combinedOperation = trimSpaces.andThen(toLowerCase);

        // Test the combined operation with a string of your choice
        String input3= "   Hello World!   ";
        String result3= combinedOperation.apply(input);

        // Print the result
        System.out.println("Input: '" + input3+ "'");
        System.out.println("Result: '" + result3+ "'");



    }
}
