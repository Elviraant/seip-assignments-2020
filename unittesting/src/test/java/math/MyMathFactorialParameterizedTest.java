package math;

import java.util.Collection;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

/*
 * This is a test class 
 * that implements a parameterized
 * test  for the factorial
 *  method of the MyMath class
 */
@RunWith(Parameterized.class)
public class MyMathFactorialParameterizedTest {
 
	@Parameter (value = 0)
	public int input;
	@Parameter (value = 1)
	public int result;
	
	MyMath mm = new MyMath();
	
	/*
	 * Generates the input values that will be tested
	 */
	@Parameters 
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {{0, 1}, {1, 1}, {2, 2}, {12, 479001600}};
		
		return Arrays.asList(data);
	}
	
	/*
	 * The test case that examines
	 * that the factorial 
	 * calculates expected values defined
	 * in data() method
	 */
	@Test 
	public void testFactorial() {
		Assert.assertEquals(result, mm.factorial(input));
	}

}
