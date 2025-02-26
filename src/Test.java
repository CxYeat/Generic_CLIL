/**
 * This is a test class to demonstrate and verify the functionality of the GenericStack class.
 * It includes test cases for the core operations: push, pop, and peek.
 */
public class Test {

    /**
     * Main method to run the test cases for GenericStack.
     *
     * This method initializes a GenericStack instance, performs several operations on it,
     * and prints the results to verify the correct behavior of the stack.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating a stack of Integer type with a maximum size of 3
        GenericStack<Integer> stack = new GenericStack<>(3);

        // Test 1: Push elements onto the stack
        System.out.println("Pushing 10, 20, and 30 onto the stack.");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Test 2: Peek at the top element (should return 30)
        System.out.println("Top element (peek): " + stack.peek()); // Expected output: 30

        // Test 3: Pop an element from the stack (should return 30)
        System.out.println("Popped element: " + stack.pop()); // Expected output: 30

        // Test 4: Peek again after popping (should return 20)
        System.out.println("Top element (peek after pop): " + stack.peek()); // Expected output: 20

        // Test 5: Push more elements to test stack overflow
        System.out.println("Pushing 40 onto the stack.");
        stack.push(40); // Expected to work

        // Test 6: Trying to push another element should throw an exception because the stack is full
        try {
            System.out.println("Pushing 50 onto the stack.");
            stack.push(50); // This should throw an IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test 7: Check if the stack is full
        System.out.println("Is the stack full? " + stack.isFull()); // Expected output: true

        // Test 8: Pop all elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Expected output: 20
        System.out.println("Popped element: " + stack.pop()); // Expected output: 10

        // Test 9: Check if the stack is empty after popping all elements
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Expected output: true
    }
}
