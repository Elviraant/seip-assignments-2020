package codeanalyzer;

import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WebFileReader implements SourceFileReader {
	

	/**
	 * Reads a file stored in the web
	 * and returns its content in a List 
	 * @param filepath the url of the file
	 * @return a List that contains the contents of the file 
	 * @throws IOException
	 */
	@Override
	public List<String> readFileIntoList(String filepath) throws IOException {	
		List<String> lines = new ArrayList<>();
	    URL url = new URL(filepath);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	    	lines.add(line);
	    }
	    reader.close();
		return lines;
	}
	
	
	/**
	 * Reads a file stored in the web
	 * and returns its content in a single String
	 * @param filepath the url of the file
	 * @return a String that contains the contents of the file
	 * @throws IOException
	 */
	@Override 
	public String readFileIntoString(String filepath) throws IOException {
		StringBuilder sb = new StringBuilder();
        URL url = new URL(filepath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
        	sb.append(line + "\n");
        }
        reader.close();
		return sb.toString();	
	}
}
