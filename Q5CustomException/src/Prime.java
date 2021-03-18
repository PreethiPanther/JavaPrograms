
class LessThanZeroExpection extends Exception{
	public LessThanZeroExpection(String s){
		super(s);	
	}
}
class GreaterThanhundredExpection extends Exception{
	public GreaterThanhundredExpection(String s){
		super(s);	
	}
}
class CheckPrime{
	void checkPrime(int num)throws LessThanZeroExpection, GreaterThanhundredExpection{
		boolean flag = false;
		if(num <0){
			throw new LessThanZeroExpection("number is less than 0");
		} else if(num >100){
			throw new GreaterThanhundredExpection("number greater than 100");
		}else {
			for (int i = 2; i <= num / 2; ++i) {
			      // condition for nonprime number
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  }
		}
	}

public class Prime {
	public static void main(String[] args) {
		CheckPrime c = new CheckPrime();
		try {
		c.checkPrime(17);
		} catch(LessThanZeroExpection | GreaterThanhundredExpection l) {
			System.out.println(l.getMessage());
		}
	}
}
