package codeanalyzer;

import org.junit.Assert;

import org.junit.Test;

public class MetricsExporterFactoryTest {

	MetricsExporterFactory mexFactory = new MetricsExporterFactory();
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateMetricsExporterException() {
		mexFactory.createMetricsExporter("non-existent-file");
	}
	
	@Test 
	public void testCreateMetricsExporterCsv() {
		MetricsExporter mex = mexFactory.createMetricsExporter("csv");		
		Assert.assertTrue(mex instanceof CsvExporter);
	}
	
	@Test 
	public void testCreateMetricsExporterJson() {
		MetricsExporter mex = mexFactory.createMetricsExporter("json");		
		Assert.assertTrue(mex instanceof JsonExporter);
	}

}
