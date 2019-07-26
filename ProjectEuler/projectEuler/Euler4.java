package projectEuler;

public class Euler4 {
	/*
	 * Find the largest palindrome
	 * made from the product of two 3-digit numbers.
	*/
	public static void main(String[] args) {
		int prod;
		int max = 0;
		//Go thru all combinations of multiplying 3 digit numbers
		for(int i = 100; i < 1000; i++) {
			//j starts at i to avoid repeats (i.e. 100*101 = 101*100).
			for(int j = i; j<1000; j++) {
				prod = i*j;
				String num = "" + prod;
				if(isPalindrome(num) && prod > max)
					max = prod;
			}
		}
		System.out.println(max);
	}
	//Method to find whether given string s is a palindrome.
	public static boolean isPalindrome(String s) {
		
		/*
		 * For loop runs halfway thru string.
		 * If char at i places away from beginning 
		 * does not match char i places away from the end
		 * return false, otherwise return true.
		*/
		for(int i = 0; i< s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		}
		return true;
		
	}
}
