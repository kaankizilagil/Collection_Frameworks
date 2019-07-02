
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkList_Main {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        zamanHesapla("LinkedList", linkedlist);
        zamanHesapla("ArrayList", arraylist);
    }
    
    public static void zamanHesapla(String veri_tipi, List<Integer> list) {
        
        // Listin sonuna deger ekleme.
        
        long baslangic;
        long bitis;
        
        baslangic = System.currentTimeMillis();
        
        for(int i = 0 ; i < 100000 ; i++) {
            
            list.add(0, i);
        }
        
        bitis = System.currentTimeMillis();
        
        System.out.println(veri_tipi + " ekleme suresi " + (bitis - baslangic) + " ms.");
    }
}
