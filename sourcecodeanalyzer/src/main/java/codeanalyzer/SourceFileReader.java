package codeanalyzer;

import java.io.IOException;
import java.util.List;

/**
 * /**
 * This is an interface to implement
 * in order to retrieve (read) the contents 
 * of several types of files. 
 * @author Elviraant
 */
public interface SourceFileReader {

	/**
	 * Reads a file and returns its content in a List
	 * @param filepath the url of the file
	 * @return a List that contains the contents of the file 
	 * @throws IOException
	 */
	public List<String> readFileIntoList(String filepath) throws IOException;
	
	/**
	 * Reads a file and returns its content in a single String
	 * @param filepath the url of the file
	 * @return a String that contains the contents of the file
	 * @throws IOException
	 */
	public String readFileIntoString(String filepath) throws IOException;

}
