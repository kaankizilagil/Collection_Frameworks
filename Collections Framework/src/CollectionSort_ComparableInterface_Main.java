import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Gamer implements Comparable<Gamer> {
    
    private String isim;
    private int id;

    public Gamer (String isim, int id) {
        
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       
        return " ID: " + id + " Isim :" + isim + " ";
    }

    @Override
    public int compareTo(Gamer gamer) {

        if (this.id < gamer.id) {
            
            return -1;
        }
        
        else if (this.id > gamer.id) {
            
            return 1;
        }
        
        return 0;
    }    
}

public class CollectionSort_ComparableInterface_Main {
    
    public static void main(String[] args) {
        
       /* List<String> list_string = new ArrayList<String>();
        
        
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string);
        
        for (String s : list_string) {
        
            System.out.println(s);
        }*/
       
        List<Gamer> list_gamer = new ArrayList<Gamer>();
        
        list_gamer.add(new Gamer("KAAM", 5));
        list_gamer.add(new Gamer("ERDEM", 1));
        list_gamer.add(new Gamer("EMIR", 10));
        list_gamer.add(new Gamer("MELIH", 4));
        
        Gamer g1 = new Gamer("KAAN", 5);
        Gamer g2 = new Gamer("MELIH", 4);
        
       // System.out.println(p1.compareTo(p1));
        
        /*Collections.sort(list_gamer);
        
        for (Gamer g : list_gamer) {
            
            System.out.println(g);
            
        }*/
        
        Set<Gamer> treeset = new  TreeSet<Gamer>();
        
        treeset.add(new Gamer("KAAN", 5));
        treeset.add(new Gamer("ERDEM", 1));
        treeset.add(new Gamer("EMIR", 10));
        treeset.add(new Gamer("MELIH", 4));
        
        for (Gamer g : treeset) {
            
            System.out.println(g);
        }
    }
}
