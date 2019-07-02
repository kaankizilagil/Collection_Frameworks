
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMap_LinkedHashMap_TreeMap_Main {
    
    public static void mapYazdir(Map<Integer, String> map) {
        
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");
        
        /*
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            
            System.out.println("Key : " + entry.getKey() + " ----> Value : " + entry.getValue());
        }
        */
        
        /*
        for(Integer key : map.keySet()) {
            
            System.out.println("Key : " + key + " ---> Value : " + map.get(key));
        }
        */
        
        Collection<String> values = map.values();
        for(String s : values) {
            
            System.out.println("Value : " + s);
        }
    }
    
    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        
        System.out.println("*********************************");
        mapYazdir(hashMap);
        
        System.out.println("*********************************");
        mapYazdir(linkedHashMap);
        
        System.out.println("*********************************");
        mapYazdir(treeMap);
    }
}
