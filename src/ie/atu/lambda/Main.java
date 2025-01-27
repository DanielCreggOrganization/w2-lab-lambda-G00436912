package ie.atu.lambda;

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
    }
}
