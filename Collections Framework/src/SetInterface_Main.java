import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface_Main {
    
    public static void main(String[] args) {
        
        /*
            Set Interface -> HashSet, LinkedHashSet, TreeSet
        
            List Interface'i implemente eden classlar bir elementten birden fazla depolayabilir,
            Set Interface'i implemente eden classlar bir elementten sadece bir tane depolayabilir.

        
            HashSet
        
            HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
        
            1) HashSet elementleri "hashing" yani hash table mekanizmasına uygun bir bicimde depolar.
               Her eleman belli bir hash key'e göre depolanır. 
            
            2) HashSet bir element'i sadece bir defa depolar.(Set Interface)
        
            3) Elementler ekleme sırasına göre depolamaz.
        
            ** HashSet, Hash Table mekanizmasını kullandığı için elementler sıralı değildir.
            ** Ekleme, Çıkarma ve Arama methodları sabit zamanda (Time Complexity :  O(1) ) çalışır.
        
        
            LinkedHashSet
        
            LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
        
            1) LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranır.
        
            2) LinkedHashSet, HashSette olduğu gibi bir element'i sadece bir defa depolar.(Set Interface)
        
            3) Elementleri ekleme sırasına göre depolar.
        
            ** LinkedHashSet sınıfı HashTable ile LinledList yapısını kullanarak elementleri depolar.
            ** Bu yüzden, elementler ekleme sırasına göre depolanır.
            ** Ekleme, Çıkarma ve Arama methodları sabit zamanda (Time Complexity :  O(1) ) çalışır.
        
        
            TreeSet
        
            TreeSet sınıfı NavigableSet Interface ini implement eder ve AbstractSet sınıfından miras alır.
            NavigableSet Interface'i de SortedSet Interface inden miras alır.
        
            1) Elementleri depolamak için Tree yapısı kullanılır.
        
            2) Elementleri alfabetik olarak sıralar.

            ** TreeSet, elementleri Tree yapısına uygun depolar.
            ** Ekleme, Çıkarma ve Arama methodları O(long(n)) complexitysi ile çalışır.
        
        */
        
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("HTML");
        set1.add("CSS");
        set1.add("JavaScript");
        
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("HTML");
        set2.add("CSS");
        set2.add("JavaScript");
        
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("HTML");
        set3.add("CSS");
        set3.add("JavaScript");
        
        System.out.println("******** HashSet ********");
        
        for(String s: set1) {
            
            System.out.println(s);
        }
        
        System.out.println("******** LinkedHashSet ********");
        
        for(String s: set2) {
            
            System.out.println(s);
        }
        
        System.out.println("******** TreeSet ********");
        
        for(String s: set3) {
            
            System.out.println(s);
        }
        
        System.out.println("***********************");
        
        System.out.println(set1.contains("Swift"));
        System.out.println(set1.contains("Java"));
        System.out.println(set1.isEmpty());
        
        set1.remove("Java");
        
        for(String s: set1) {
            
            System.out.println(s);
        }
        
        System.out.println("***********************");
    }
}
