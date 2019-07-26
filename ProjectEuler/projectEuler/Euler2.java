package projectEuler;

public class Euler2 {
	/*
	 * By considering the terms in the Fibonacci
	 * sequence whose values do not exceed four million,
	 * find the sum of the even-valued terms.
	 */
	public static void main(String[] args) {
		int sum = 0;
		//Displays sum of all even fibonacci numbers below 4000000
		System.out.println(fibonacci(1, 1, sum));
	}
	//Checks if i is even
	public static boolean isEven(int i) {
		if(i%2 == 0)
			return true;
		return false;
	}
	public static int fibonacci(int prev, int current, int sum) {
		//Stopping condition.
		if(current > 4000000)
			return sum;
		else {
			if(isEven(current))
				sum+=current;
			int temp = current;
			current = prev+current;
			prev = temp;
			return fibonacci(prev, current, sum);
		}
		
	}
}
