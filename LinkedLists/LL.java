import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");   // Add at beginning
        list.addLast("Orange");   // Add at end

        System.out.println("Full List: " + list);

        // Access elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove("Banana");

        System.out.println("After removals: " + list);

        // Check presence
        System.out.println("Contains 'Apple'? " + list.contains("Apple"));

        // Size
        System.out.println("Size: " + list.size());

        // Clear the list
        list.clear();
        System.out.println("Is list empty? " + list.isEmpty());
    }
}