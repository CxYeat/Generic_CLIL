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
        // Test push and pop
        GenericStack<Integer> stack = new GenericStack<>(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // Expected: 20
        System.out.println(stack.pop()); // Expected: 10
        System.out.println(stack.pop()); // Expected: null (empty stack)
        // Test peek
        GenericStack<String> stringStack = new GenericStack<>(3);
        System.out.println(stringStack.peek()); // Expected: null (empty stack)
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println(stringStack.peek()); // Expected: "World"
        System.out.println(stringStack.pop()); // Expected: "World"
        System.out.println(stringStack.peek()); // Expected: "Hello"
        // Test isEmpty
        GenericStack<Double> doubleStack = new GenericStack<>(2);
        System.out.println(doubleStack.isEmpty()); // Expected: true
        doubleStack.push(5.5);
        System.out.println(doubleStack.isEmpty()); // Expected: false
        doubleStack.pop();
        System.out.println(doubleStack.isEmpty()); // Expected: true
        // Test isFull
        GenericStack<Character> charStack = new GenericStack<>(2);
        System.out.println(charStack.isFull()); // Expected: false
        charStack.push('A');
        charStack.push('B');
        System.out.println(charStack.isFull()); // Expected: true
        // Test pushing onto a full stack
        GenericStack<Integer> smallStack = new GenericStack<>(1);
        smallStack.push(1);
        try {
            smallStack.push(2);
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage()); // Expected exception
        }
    }
}

