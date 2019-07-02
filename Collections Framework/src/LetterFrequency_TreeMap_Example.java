import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterFrequency_TreeMap_Example {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a Sentence : ");
        
        String sent = scanner.nextLine();
        
        Map<Character, Integer> frequency = new TreeMap<Character, Integer>();
        
        for(int i = 0 ; i < sent.length() ; i++) {
            
            char c = sent.charAt(i);
            
            if(frequency.containsKey(c)) {
                
                frequency.replace(c, frequency.get(c) + 1);
            }
            
            else {
                
                frequency.put(c, 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            
            System.out.println("Character : " + entry.getKey() + " " + entry.getValue());
        }
    }
}
