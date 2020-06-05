package codeanalyzer;

import java.util.Map;

/**
 * This class is used to refer 
 * to all objects of MetricsExporter
 * without the client knowing the instance
 * of the object.
 * @author Elviraant
 */
public class MetricsExporterFactory {
	
	public MetricsExporter createMetricsExporter(String outputType) {
		MetricsExporter exporter;
		if (outputType.equals("csv")) {
			exporter = new CsvExporter();
		} else if (outputType.equals("json")) {
			exporter = new JsonExporter();
		} else {
			throw new IllegalArgumentException("Unknown type : " + outputType);
		}
		
		return exporter;
	}
	

}
