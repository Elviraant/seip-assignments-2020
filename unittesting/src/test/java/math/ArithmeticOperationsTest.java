package math;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class ArithmeticOperationsTest {
	
	ArithmeticOperations ao = new ArithmeticOperations();
	
	
	/* 
	 * A test that examines a case with normal input
	 * for the divide function
	 */
	@Test
	public void testDivideNormal() {
		Assert.assertEquals(4.0, ao.divide(8.0, 2.0), 0.0000001);

	}
	
	/* 
	 * A test that examines a case 
	 * where the numerator is 0
	 * in division
	 */
	@Test
	public void testDivideZeroAdNumerator() {
		Assert.assertEquals(0, ao.divide(0, 2.0), 0.0000001);

	}
	/*
	 * A test case for the exception caused when 
	 * the denominator is zero in division
	 */
	@Test (expected = ArithmeticException.class)
	public void testDivideZeroAsDenominator() {
		ao.divide(8.0 , 0);

	}
	
	/*
	 * A test that examines a case with normal input 
	 * for the multiply function
	 */	
	@Test
	public void testMultiplyPositivesLessThanMaxValue() {
		Assert.assertEquals(10, ao.multiply(2, 5));
		
	}
	
	@Rule 
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * A test case for the exception caused
	 * when x is negative in multiplication
	 * Uses @Rule to test the exception
	 */
	@Test
	public void testMultiplyNegativeWithPositiveShouldThrowNegativesException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		ao.multiply(-5, 9);
		
	}
	
	/*
	 * A test case for the exception caused
	 * when y is negative in multiplication
	 * Uses @Rule to test the exception
	 */	
	@Test
	public void testMultiplyPositiveWithNegativeShouldThrowNegativesException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		ao.multiply(5, -9);
		
	}
	
	/*
	 * A test case for the exception caused
	 * when both x and y 
	 * are negative in multiplication
	 * Uses @Rule to test the exception
	 */		
	@Test
	public void testMultiplyNegativesShouldThrowNegativesException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		ao.multiply(-1, -90);
		
	}
	
	/*
	 * A test case for the exception 
	 * caused when the multiplication 
	 * result doesn't fit in 
	 * an Integer variable 
	 */	
	@Test
	public void testMultiplyShouldThrowOverflowException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The product does not fit in an Integer variable");
		ao.multiply(2, Integer.MAX_VALUE);
		
	}

}
