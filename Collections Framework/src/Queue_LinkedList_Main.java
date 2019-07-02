import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList_Main {
    
    public static void main(String[] args) {
        
        /*
            Add()     :   Adds to element. If it doesn't addition the element, gives an ERROR.
            Offer()   :   Adds to element. If it does addition the element, returns TRUE. If it doesn't, returns FALSE.
            Remove()  :   Removes the element at the beginning of the queue from the queue. If the queue is empty, gives an ERROR.
            Poll()    :   Removes the element at the beginning of the queue from the queue. If the queue is empty, returns NULL.
            Element() :   Returns to the element at the beginning of the queue. If the queue is empty, gives an ERROR.
            Peek()    :   Returns to the element at the beginning of the queue. If the queue is empty, returns NULL.
        */
        
        Queue<String> queue = new LinkedList<String>();
        
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        
        System.out.println("**********************************");
        
        for(String s : queue) {
            
            System.out.println(s);
        }
        
        System.out.println("**********************************");
        System.out.println("Removing Element : " + queue.poll());
        System.out.println("**********************************");
        
        for(String s : queue) {
            
            System.out.println(s);
        }
        
        System.out.println("**********************************");
        
        System.out.println(queue.isEmpty());
    }
}
