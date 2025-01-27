package ie.atu.lambda;

// Implement the interface using a class
class ToUpperCase implements StringOperation {
    @Override
    public String apply(String input) {
        return input.toUpperCase();
    }
}