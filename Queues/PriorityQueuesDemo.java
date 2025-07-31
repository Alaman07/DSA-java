import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueuesDemo {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();
        
        //we can pass a comparator in constructor for reverse order eg: Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(5.0);
        queue.offer(4.0);
        queue.offer(3.5);
        queue.offer(6.0);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


//      output will be:     2.0
//                          3.5
//                          4.0
//                          5.0
//                          6.0
    }
}
