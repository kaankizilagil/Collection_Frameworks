import java.util.PriorityQueue;
import java.util.Queue;

class Guitar implements Comparable<Guitar> {
        
    private String brand;
    private int model_number;

    public Guitar(String brand, int model_number) {
            
        this.brand = brand;
        this.model_number = model_number;
    }

    @Override
    public int compareTo(Guitar guitar) {

        if(this.model_number < guitar.model_number) {
                
            return -1;
        }
            
        else if(this.model_number < guitar.model_number) {
                
            return 1;
        }
            
        else {
            
            return 0;
        }
    }

    @Override
    public String toString() {
            
        return "Guitar{" + "brand=" + brand + ", model_number=" + model_number + '}';
    }
}

public class Priority_Queue_Main {
    
    public static void main(String[] args) {
        
        /*
            Add()      :   Adds to element. If it doesn't addition the element, gives an ERROR.
            Offer()    :   Adds to element. If it does addition the element, returns TRUE. If it doesn't, returns FALSE.
            Remove()   :   Removes the element at the beginning of the queue from the queue. If the queue is empty, gives an ERROR.
            Poll()     :   Removes the element at the beginning of the queue from the queue. If the queue is empty, returns NULL.
            Element()  :   Returns to the element at the beginning of the queue. If the queue is empty, gives an ERROR.
            Peek()     :   Returns to the element at the beginning of the queue. If the queue is empty, returns NULL.
        
            Contains() :   If the object is in the queue, returns TRUE. If it doesn't, returns FALSE.
            Size()     :   Returns the number of elements in the queue.
            Clear()    :   Clears the queue.
        */
        
        Queue<Guitar> queue = new PriorityQueue<Guitar>();
        
        queue.offer(new Guitar("Ibanez", 17));
        queue.offer(new Guitar("Cort", 54));
        queue.offer(new Guitar("Shancez", 22));
        
        while(!queue.isEmpty()) {
            
            System.out.println("Removing Element : " + queue.poll());
        }
        
        /*
            // We cannot use for-each loop for view to integers.
            queue.offer(5);
            queue.offer(1);
            queue.offer(3);
            queue.offer(100);
        
            System.out.println(queue.peek());
            System.out.println(queue.contains(100));
        */
    }
}
