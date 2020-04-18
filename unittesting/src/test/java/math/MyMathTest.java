package math;

import org.junit.Test;

public class MyMathTest {

	MyMath mm = new MyMath();
	
	/*
	 * A test case for the exception caused
	 * when the input is negative
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testFactorialNegative() {
		mm.factorial(-5);
	}
	
	/*
	 * A test case for the exception caused 
	 * when the input in greater than 12 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testFactorialGreaterThanTwelve() {
		mm.factorial(20);
	}
	

}
