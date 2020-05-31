package codeanalyzer;

public class SourceFileReaderFactory {

	public SourceFileReader createSourceFileReader(String type) {
		SourceFileReader sourceFileReader;
		if (type.equals("local")) {
			sourceFileReader = new LocalFileReader();			
		} else if (type.equals("web")) {
			sourceFileReader = new WebFileReader();
		} else {
			return null;
		}		
		return sourceFileReader;
	}
}
