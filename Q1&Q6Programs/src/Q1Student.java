import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q1Student {
	String name;
	int id;
	int age;
	public Q1Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubsoutsoutn
		ArrayList <Q1Student> list = new ArrayList<Q1Student>();
		list.add(new Q1Student("preethi",1,18));
		list.add(new Q1Student("swetha",2,23));
		list.add(new Q1Student("lakshaya",5,20));
		list.add(new Q1Student("balaji",3,28));
		
		Collections.sort(list,new Sortbyname());
		for(int i=0;i<list.size();i++){
			System.out.println("sort by name"+list.get(i));
		}
		Collections.sort(list,new Sortbyage());
		for(int i=0;i<list.size();i++){
			System.out.println("sort by age"+list.get(i));
		}
		Collections.sort(list,new Sortbyid());
		for(int i=0;i<list.size();i++){
			System.out.println("sort by id"+list.get(i));
		}
	}



	
}
class Sortbyid implements Comparator<Q1Student>
{
	public int compare(Q1Student a,Q1Student b){
		return a.id - b.id;
	}
}

class Sortbyage implements Comparator<Q1Student>{
	public int compare(Q1Student a ,Q1Student b){
		return a.age - b.age;
	}
}

	class Sortbyname implements Comparator<Q1Student>
	{
		
		public int compare(Q1Student a,Q1Student b){
			return a.name.compareTo(b.name);
		}
	}
	