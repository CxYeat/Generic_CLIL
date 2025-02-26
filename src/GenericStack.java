/**
 * A generic stack implementation that allows you to push, pop, and peek elements of any type.
 *
 * @param <T> the type of elements in this stack
 *
 * @author Aron Handan
 * @version 2025-02-26
 */
public class GenericStack<T> {

    // Array to hold the stack elements
    private T[] stack;
    private int top;
    private int maxSize;
    /**
     * Constructs a stack with the specified size.
     *
     * @param size the maximum size of the stack
     */
    private GenericStack(int size) {
        if(size <= 0) throw new IllegalArgumentException("Stack size must be greater than 0");
        stack = (T[]) new Object[size];
        top = - 1;
        maxSize = size;
    }

    /**
     * Default constructor that initializes an empty stack.
     */
    private GenericStack() {
        this(10);
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * This method adds an element to the stack. If the stack is full, it throws an exception.
     *
     * @param t the element to be pushed onto the stack
     * @throws IllegalStateException if the stack is full
     */
    public void push(T t) {
        // Check if the stack is full before adding a new element
        if (top == maxSize - 1) {
            throw new IllegalStateException("Stack is full");  // Throw exception if stack is full
        }
        stack[++top] = t;  // Increment top and add the element to the stack
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * This method removes the element at the top of the stack and returns it. If the stack is empty,
     * it returns null.
     *
     * @return the top element of the stack, or null if the stack is empty
     */
    public T pop() {
        // Check if the stack is empty before popping an element
        if (top == -1) {
            return null;  // Return null if the stack is empty
        }
        T element = stack[top];  // Get the top element
        stack[top--] = null;  // Set the element to null and decrement the top index
        return element;  // Return the removed element
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * This method allows you to view the element at the top of the stack without modifying the stack.
     * If the stack is empty, it returns null.
     *
     * @return the top element of the stack, or null if the stack is empty
     */
    public T peek() {
        // Check if the stack is empty before returning the top element
        if (top == -1) {
            return null;  // Return null if the stack is empty
        }
        return stack[top];  // Return the top element without removing it
    }
}
