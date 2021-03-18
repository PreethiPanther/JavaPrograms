import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
class  sortByGame implements  Comparator <Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		String g1= ((Player) o1).getGame();
		String g2= ((Player) o2).getGame();
		int res= o1.game.compareTo(o2.game);
		if(res !=0){
			return res;
		}
		int a1 = ((Player)o1).getAge();
		int a2 = ((Player)o2).getAge();
		return a1 - a2;
	}
	// TODO Auto-generated method stub
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Player> p= new HashSet<>();
		p.add(new Player("preethi",3,"cricket"));
		p.add(new Player("preethi",23,"tennis"));
		p.add(new Player("Swetha",13,"tennis"));
		ArrayList <Player> list=new ArrayList<>(p);
		Collections.sort(list,new sortByGame());
		System.out.println("set"+list);

	}

}
