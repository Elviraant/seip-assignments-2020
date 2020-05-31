package codeanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class SourceFileReaderFactoryTest {


	SourceFileReaderFactory sfrFactory = new SourceFileReaderFactory();
	
	@Test
	public void testCreateSourceFileReaderNull() {
		SourceFileReader sfr = sfrFactory.createSourceFileReader("non-existent-type");
		Assert.assertNull(sfr);
	}
	
	@Test 
	public void testCreateMetricsExporterLocal() {
		SourceFileReader sfr = sfrFactory.createSourceFileReader("local");		
		Assert.assertTrue(sfr instanceof LocalFileReader);
	}
	
	@Test 
	public void testCreateMetricsExporteWeb() {
		SourceFileReader sfr = sfrFactory.createSourceFileReader("web");		
		Assert.assertTrue(sfr instanceof WebFileReader);
	}


}
