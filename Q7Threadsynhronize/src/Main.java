import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable{
int i;
public static ArrayList <Integer> list= new ArrayList<Integer>();
	Main(int i){
		this.i=i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){
			list.add(i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
	Scanner sc=new Scanner(System.in);

ExecutorService service =Executors.newFixedThreadPool(3);
for(int i=0;i<3;i++){
	
	service.submit(new Main(sc.nextInt()));
}
for(int i=0;i<list.size();i++){
	System.out.println("List:::"+list.get(i));
}
	}


}
