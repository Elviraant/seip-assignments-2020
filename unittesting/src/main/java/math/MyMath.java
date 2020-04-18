package math;

public class MyMath {

	/*
	 * This is a method that calculates the 
	 * factorial for every n between 0 and 12
	 */
	public int factorial(int n) {
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("n should be >= 0 and <= 12");
		} else if (n == 0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
}
