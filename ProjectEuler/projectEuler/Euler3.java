package projectEuler;

public class Euler3 {
//What is the largest prime factor of the number 600851475143 ?
	/*
	 *Program was first tested with int 13195 to simplify logic,
	 *before converting into long.
	 */
	public static void main(String[] args) {
		long num = 600851475143L;
		long max = 0L;
		long newNum = (int)Math.sqrt(num);
		//checks all potential prime factors
		for(long i = 2; i<= newNum; i++) {
			if(num%i == 0 && isPrime(i) && i > max) {
				max = i;
				if(isPrime(num/i))
					max = num/i;
			}
			
		}
		//Displays largest prime factor.
		System.out.println(max);
	}
	//Algorithm to check if number is prime
	public static boolean isPrime(long num) {
		long newNum = (int)Math.sqrt(num);
		
		for(long i = 2; i<= newNum; i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}
}
