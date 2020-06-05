package codeanalyzer;

/**
 * This class is used to refer 
 * to all objects of SourceFileReader
 * without the client knowing the instance
 * of the object.
 * @author Elviraant
 */
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
