package JavaClass;

class MultipleExceptions{
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Division: " + (10 / 0)); // ArithmeticException
            System.out.println("Accessing element: " + numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
        }
        System.out.println("Program continues after handling exceptions...");
    }
}