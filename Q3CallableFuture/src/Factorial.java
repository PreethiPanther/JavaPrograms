import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Factorial implements Callable<Integer>{
private final Integer number;
	public Factorial(Integer num) {
		// TODO Auto-generated constructor stub
		this.number = num;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int result = 1;
		 
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
 
     
        return result;
    }
	}


