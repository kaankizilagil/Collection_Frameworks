
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {
    
    private String isim;
    private int id;

    public Player(String isim, int id) {
        
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        
        return "ID : " + id + " Isim : " + isim + " ";
    }

    @Override
    public int hashCode() {
        
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}

public class HashCode_Equals_Main {
    
    public static void main(String[] args) {
        
        Set<Player> hashset = new HashSet<Player>();
        
        Player player1 = new Player("KAAN", 17);
        Player player2 = new Player("MELIH", 11);
        Player player3 = new Player("KAAN", 17);
        Player player4 = new Player("EMIR", 13);
        
        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
        
        for(Player p : hashset) {
            
            System.out.println(p);
        }
    }
}
