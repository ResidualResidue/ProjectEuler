package projectEuler;

public class Euler1 {
	//Finds the sum of all multiples of 3 or 5 below 1000.
	public static void main(String[] args) {
		int sum = 0;
		//All multiples of 3
		for(int i = 0; i<1000; i+=3) {
			sum+=i;
		}
		//All multiples of 5 except those that are also multiples of 3.
		for(int i = 0; i<1000; i+=5) {
			if(i%3 == 0)
				continue;
			else
				sum+=i;
		}
		//Display sum
		System.out.println(sum);
	}
}
