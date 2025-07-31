import java.util.Queue;
import java.util.LinkedList;

// queue is a FIFO data structure
// A collection designed for holding elements prior to processing
// queue is a linear data structure

// add = enqueue, offer()
// remove = dequeue, poll()
// peek() : check head

public class queuedemo {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>(); //queue is an interface so we directly cant create its object thats why we use linkedlist to implement queues

        queue.offer("goku");
        queue.offer("vegeta");
        queue.offer("krillin");
        queue.offer("gohan");

        System.out.println(queue);
        // since queue is from collection class we can also use functions like .isEmpty() etc
        // eg: System.out.println(queue.size());
        //     System.out.println(queue.contains("krillin"));


        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println("=====================");
        System.out.println(queue);

        //where queues can be used?
        // 1. keyboard buffer (lettes should appear on screen in the order they are pressed)
        // 2. Printer Queue (printer jobs should be completed in order)
        // 3. used in linkedlist, priorityQueues, Bredth-First-Search
    }
}
