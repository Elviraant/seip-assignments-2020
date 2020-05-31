# Source Code Analyzer

This is a module created as a part of the 4th assignment for the course Software Engineering in Practice offered by the department of Management Science and Technology of the Athens University of Economics and Business.

This module contains a redesign of a system based on the SOLID
design principles by applying the appropriate design
patterns.

# Class Diagram 

# Design Patterns

# Build the module

Build the executable Java application with
	mvn package jacoco:report

# Run the module

Run the executable by executing
   ```
     java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4
   ```

   ,where args translate to: 	
	arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
	arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
	arg2 = “SourceCodeLocationType” [local|web]
	arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
	arg4 = “OutputFileType” [csv|json]

   Here is an example: 
	```
	java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv
	```

