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
	 * that doesn't contain 
	 * any primes
	 */
	@Test 
	public void testFindPrimesInFileNoPrimes() {
		
		FileIO fileIO = mock(FileIO.class);
		MyMath myMath = new MyMath();
		
		String filepath = "src/test/resources/noprimes.txt";
		
		when(fileIO.readFile(filepath)).thenReturn( new int[] { 4, 6, 15, 27, 82, 99});
		
		int[] expectedValues = new int[] {};
		int[] actual = ao.findPrimesInFile(fileIO, filepath, myMath);
		
		Assert.assertArrayEquals(expectedValues, actual);
	}
	
	/*
	 * A test case for FindPrimesInFile
	 * with a file input
	 * that contains both 
	 * primes and composites
	 */
	@Test 
	public void testFindPrimesInFilesNormal() {
		
		FileIO fileIO = mock(FileIO.class);
		MyMath myMath = new MyMath();
		
		String filepath = "src/test/resources/normal.txt";
		
		when(fileIO.readFile(filepath)).thenReturn( new int[] { 4, 2, 15, 27, 89, 97});
		
		int[] expectedValues = new int[] { 2, 89, 97};
		int[] actual = ao.findPrimesInFile(fileIO, filepath, myMath);
		
		Assert.assertArrayEquals(expectedValues, actual);
	}
	
	
	/*
	 * A test case for FindPrimesInFile
	 * with a file input
	 * that only contains 
	 * prime numbers
	 */
	@Test 
	public void testFindPrimesInFilesOnlyPrimes() {
		
		FileIO fileIO = mock(FileIO.class);
		MyMath myMath = new MyMath();
		
		String filepath = "src/test/resources/primes.txt";
		
		when(fileIO.readFile(filepath)).thenReturn( new int[] { 103, 2, 17, 97, 41, 89});
		
		int[] expectedValues = new int[] { 103, 2, 17, 97, 41, 89};
		int[] actual = ao.findPrimesInFile(fileIO, filepath, myMath);
		
		Assert.assertArrayEquals(expectedValues, actual);
	}
	
	
	

}
