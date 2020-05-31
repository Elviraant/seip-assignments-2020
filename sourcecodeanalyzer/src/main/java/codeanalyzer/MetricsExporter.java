package codeanalyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This is an interface to implement
 * in order to export (write) metrics 
 * to several types of output.  
 * @author Elviraant
 */
public interface MetricsExporter {
	
	public void writeFile(Map<String, Integer> metrics, String filepath); 
	
	
	
}
