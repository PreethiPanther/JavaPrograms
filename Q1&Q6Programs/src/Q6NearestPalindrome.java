
public class Q6NearestPalindrome {

	public static void closestPalindrome(int num) {
		int LNum = num - 1;
		while (isPalindrome(Integer.toString(LNum)) == false) {
			LNum--;
		}
		int SNum = num + 1;
		while (isPalindrome(Integer.toString(SNum)) == false) {
			SNum++;
		}

		if (Math.abs(num - SNum) < Math.abs(num - LNum)) {
			System.out.println(SNum);
		} else
			System.out.println(LNum);
	}

	private static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		closestPalindrome(num);
	}
}
