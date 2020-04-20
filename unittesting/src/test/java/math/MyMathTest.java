package math;

import org.junit.Test;
import org.junit.Assert;

public class MyMathTest {

	MyMath mm = new MyMath();
	
	/*
	 * A test case for the exception caused
	 * in factorial
	 * when the input is negative
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testFactorialNegative() {
		mm.factorial(-5);
	}
	
	/*
	 * A test case for the exception caused 
	 * in factorial
	 * when the input in greater than 12 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testFactorialGreaterThanTwelve() {
		mm.factorial(20);
	}
	
	
    @Test 
    public void testIsPrimeBoundedValue() {
    	Assert.assertEquals(true, mm.isPrime(2));
    }
    
    @Test 
    public void testIsPrimeBoundedValueThree() {
    	Assert.assertEquals(true, mm.isPrime(3));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIsPrimeLessThanTwo() {
    	mm.isPrime(1);
    }
    
    @Test 
    public void testIsPrimeTrue() {
    	Assert.assertEquals(true, mm.isPrime(89));
    }
    
    @Test 
    public void testIsPrimeFalse() {
    	Assert.assertEquals(false, mm.isPrime(27));
    }
	

}
