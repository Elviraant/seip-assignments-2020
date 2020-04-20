package math;

import io.FileIO;
import java.util.List;
import java.util.ArrayList;

/**
* ArrayOperations provides operations on 
* arrays to practice on unit testing using Mockito 
* @author  Elviraant
* @since   2020-04-19
*/
public class ArrayOperations {
	
	/**
	 * Iterates an array of numbers and returns a new
	 * array that contains only prime numbers
	 * @param a FileIO object
	 * @param a file's path
	 * @param a MyMath object
	 * @return an array of prime integers
	 */	
	public int[] findPrimesInFile(FileIO fileIO, String filepath, MyMath myMath) {
		int[] array = fileIO.readFile(filepath);
		List<Integer> listWithPrimes = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			if (myMath.isPrime(number)) {
				listWithPrimes.add(number);
			}
		}
		
		return listWithPrimes.stream().mapToInt(i -> i).toArray();
	}
}
