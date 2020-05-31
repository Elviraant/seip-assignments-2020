package codeanalyzer;

import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * This class implements SourceFileReader
 * in order to retrieve (read) the contents 
 * of a locally stored files. 
 * @author Elviraant
 */
public class LocalFileReader implements SourceFileReader {
	
	/**
	 * Reads a locally file and returns its content in a List 
	 * @param filepath the url of the file
	 * @return a List that contains the contents of the file 
	 * @throws IOException
	 */
	@Override 
	public List<String> readFileIntoList(String filepath) throws IOException {
		List<String> lines = new ArrayList<>();
		File file = new File(filepath);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}
		reader.close();
		return lines;
	}
	

	/**
	 * Reads a locally stored file 
	 * and returns its content in a single String
	 * @param filepath the url of the file
	 * @return a String that contains the contents of the file
	 * @throws IOException
	 */
	@Override 
	public String readFileIntoString(String filepath) throws IOException {
		StringBuilder sb = new StringBuilder();
		File file = new File(filepath);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		reader.close();
		return sb.toString();
	}
}
