import java.util.Enumeration;
import java.util.Stack;

public class Vectors_Stacks_Main {
 
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();
        
        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
        
        /*
        for(String s : stack) {
            
            System.out.println(s);
        }
        */
        
        /*
        Enumeration<String> enumeration = stack.elements();
        
        while(enumeration.hasMoreElements()) {
            
            System.out.println(enumeration.nextElement());
        }
        */
        
        for(String s : stack) {
            
            System.out.println(s);
        }
        
        System.out.println("******************************************");
        
        System.out.println("Removing The Last Element : " + stack.pop());
        
        System.out.println("******************************************");
        
        for(String s : stack) {
            
            System.out.println(s);
        }
    }
}
