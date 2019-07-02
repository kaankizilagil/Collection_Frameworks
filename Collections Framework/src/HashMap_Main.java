
import java.util.HashMap;
import java.util.Map;


public class HashMap_Main {
    
    public static void main(String[] args) {
        
        /*
            HashMap <Integer(Key), String(Value)>
        
            1) Değerleri Key(anahtar) ve Value(değer) olarak depolar.
               Her Key'e karşılık gelen bir tane değer bulunur.
        
            2) Bir key sadece bir kez varolabilir.
               Ancak bir value birden fazla varolabilir. 
        
            3) Elementleri HashSet gibi ekleme sırasına göre depolamaz.
        
        */
        
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        
        hashMap.put(50, "Java");
        hashMap.put(20, "Python");
        hashMap.put(40, "Php");
        hashMap.put(30, "Php");
        hashMap.put(20, "JavaScript");
        
        /*
        System.out.println(hashMap);
        System.out.println(hashMap.get(30));
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(75));
        */
        
        for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            
            System.out.println("Key : " + entry.getKey() + " ----> Value : " + entry.getValue());
        }
    }
}
