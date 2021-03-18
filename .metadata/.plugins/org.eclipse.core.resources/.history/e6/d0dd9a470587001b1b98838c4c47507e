import java.util.*;
import java.util.concurrent.*;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ExecutorService executorService  = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
List<Future<Integer>> list= new ArrayList<>();
for(int i=0;i<10;i++){
	Factorial f = new Factorial(i);
	Future<Integer> result = executorService.submit(f);
	list.add(result);	
}
executorService.awaitTermination(5,TimeUnit.SECONDS);
for(int i=0;i<list.size();i++){
	Future<Integer> ans=list.get(i);
	Integer number = null;
	try {
		number = ans.get();
	} catch (InterruptedException e){
		
	}catch (ExecutionException e){
		
	}
	System.out.printf("Factorial of %d is :: %d\n", i, number);
	executorService.shutdown();
	
	
}
	}

}
