package codeanalyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Exports (writes) the metrics to a given output.
 * The output can be CSV or JSON files.
 *  
 * @author Elviraant
 *
 */
public interface MetricsExporter {
	
	public void writeFile(Map<String, Integer> metrics, String filepath); 
	
	
	
}
