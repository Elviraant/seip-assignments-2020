package math;

import org.junit.Assert;
import org.junit.Test;

import io.FileIO;

import static org.mockito.Mockito.*;

public class ArrayOperationsTest {
	
	ArrayOperations ao = new ArrayOperations();
	
	/*
	 * A test case for FindPrimesInFile
	 * with a file input
	 * that contains both 
	 * primes and composites
	 */
	@Test 
	public void testFindPrimesInFilesNormal() {
		
		FileIO fileIO = mock(FileIO.class);
		MyMath myMath = mock(MyMath.class);
		
		String filepath = "src/test/resources/normal.txt";
		
		when(fileIO.readFile(filepath)).thenReturn( new int[] { 4, 2, 15, 27, 89, 97});
		when(myMath.isPrime(4)).thenReturn(false);
		when(myMath.isPrime(2)).thenReturn(true);
		when(myMath.isPrime(15)).thenReturn(false);
		when(myMath.isPrime(27)).thenReturn(false);
		when(myMath.isPrime(89)).thenReturn(true);
		when(myMath.isPrime(97)).thenReturn(true);
				
		int[] expectedValues = new int[] { 2, 89, 97};
		int[] actual = ao.findPrimesInFile(fileIO, filepath, myMath);
		
		Assert.assertArrayEquals(expectedValues, actual);
	}
	
	
	
	

}
