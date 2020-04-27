package io;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class FileIOTest {

	FileIO fIO = new FileIO();
	public static String resourcePath = "src/test/resources/";
	
	/*
	 * A test case that examines
	 * that only Integers input file in readFile
	 * gives the expected value
	 */
	@Test 
	public void readFileNormalInput() {
		int[] expectedValues = new int[] { 1, 2, 3, 4, 123, 0};
		Assert.assertArrayEquals(expectedValues, fIO.readFile(resourcePath + "normal_input.txt"));
	}
	
	/*
	 * A test case that examines
	 * that not only Integers 
	 * input file in readFile
	 * gives the expected value
	 */	
	@Test
    public void testReadFileContainsInvalidEntries() {
    	int[] expectedValues = new int[] { 1, 789};
    	Assert.assertArrayEquals(expectedValues, fIO.readFile(resourcePath + "invalid.txt"));
    }

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * A test case for the exception 
	 * caused in readFile
	 * when a file is empty
	 */
	@Test
	public void readFileEmpty() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Given file is empty");
		fIO.readFile(resourcePath + "empty.txt");
	}
	
	/*
	 * A test case for the exception 
	 * caused in readFile
	 * when a file doesn't exist 
	 */	
	@Test
	public void readFileNonexistent() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input file does not exist");
		fIO.readFile(resourcePath + "nonexistent");
	}
	
	
}
