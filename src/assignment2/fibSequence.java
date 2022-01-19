package assignment2;

/**
 * Class that defines a method to calculate the nth term in the Fibonacci Sequence.
 * 
 * @author Sam Kopkin
 *
 */
public class fibSequence {
	/** 
	 * Main method of the program. The Nth term to be calculated is hard-coded for now.
	 * This method will call the recursiveFibonacci method using the nth value given
	 * and print out the result to the console.
	 * 
	 * @param args Default String[] argument for main method
	 */
	public static void main(String[] args) {
		final int nth = 10;
		
		int result = recursiveFibonacci(nth - 1);
		
		System.out.println("The " + nth + "th term of the Fibonacci sequencec is: " + result);
	}
	
	/**
	 * A recursive method that returns the nth term of the Fibonacci sequence.
	 * 
	 * @param n The nth value of the Fibonacci sequence to calculate up to
	 * @return Returns the nth term of the Fibonacci sequence
	 */
	private static int recursiveFibonacci(int n) {
		
		if (n <= 1) { 
			return n;
		}
		
		return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
		
	}
}
