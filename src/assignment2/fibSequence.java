package assignment2;

public class fibSequence {
	public static void main(String[] args) {
		final int nth = 10;
		
		int result = recursiveFibonacci(nth - 1);
		
		System.out.println("The " + nth + "th term of the Fibonnacci sequencec is: " + result);
	}
	
	private static int recursiveFibonacci(int n) {
		
		if (n <= 1) { 
			return n;
		}
		
		return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
		
	}
}
