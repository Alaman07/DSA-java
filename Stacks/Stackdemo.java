import java.util.Stack;

//stack: LIFO data structure (last in first out)
//          push() to add to the top
//          pop() to remove from the top
public class Stackdemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.isEmpty());

        stack.push("gow");
        stack.push("dbz");
        stack.push("uncharted");
        stack.push("tekken");
        System.out.println(stack);
        System.out.println("================");
        
        System.out.println(stack.peek());
        
        System.out.println("================");
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());

        System.out.println("================");
        String game = stack.pop();
        System.out.println(game);

        System.out.println("================");
        
        System.out.println(stack.search("gow"));

        System.out.println(stack.search(game));// if it not exist it returns -1
    }
}
//     use case of stacks

// 1. Function Call Management
// 2. Backtracking Algorithms
// 3. Memory Management
// 4. Undo/Redo Functionality
// 5. Browser History


