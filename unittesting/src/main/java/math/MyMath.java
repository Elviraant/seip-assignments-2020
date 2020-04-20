package math;

/**
* The MyMath class contains more complex
* mathematic operations to practice on unit testing
* @author  Elviraant
* @since   2020-04-17 
*/
public class MyMath {

	/**
	 * Calculates and returns the factorial 
	 * of an integer between 0 and 12
	 * @param an integer
	 * @return an integer
	 * @exception IllegalArgumentException when the given integer is less than 0 or greater than 12
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
	
	/**
	 * Calculates whether an integer
	 * greater than 2 is prime, 
	 * returns true, if it is 
	 * and false, otherwise
	 * @param an integer
	 * @return true if the input is prime, false otherwise
	 * @exception IllegalArgumentException when the given integer is less than 2
	 */
	public boolean isPrime(int n) {
		if (n < 2) {
			throw new IllegalArgumentException("n should be >= 2");
		} else {
			for (int i = 2; i <= 9; i++) {
				if (i < n & n%i == 0) {
					return false;
				}
			}
		}
		return true;
		
	}
}
