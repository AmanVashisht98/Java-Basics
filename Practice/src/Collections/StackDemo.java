package Collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //As stack extends vector so it has all the methods of vectors such as add element to specific index and remove element from specific index

        //push() - it adds the element to top of stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //pop() - it removes the element from top of stack
        System.out.println(stack.pop());
        Integer removedElement = stack.pop();
        System.out.println(removedElement);

        //peek() - it returns the elements from top of stack but does not remove it
        System.out.println(stack.peek());

        //isEmpty() - to check whether stack is empty
        System.out.println(stack.isEmpty());

        //size() - to check size of stack
        System.out.println(stack.size());

        //search() - gives the index of element from top
        System.out.println(stack.search(3));


    }
}
