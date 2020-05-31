# Source Code Analyzer

This is a module created as a part of the 4th assignment for the course Software Engineering in Practice offered by the department of Management Science and Technology of the Athens University of Economics and Business.

This module contains a redesign of a system based on the SOLID
design principles by applying the appropriate design
patterns.

## Class Diagram
### Original System Design
This is the original design of the system containing code smells and violations of design principles.

![original][original_system_class_diagram.PNG]
### Current Redesign
This is the current redesign of the system based on the SOLID principles. This design still contains code smells and violations of design principles.

![current][current_class_diagram.png]
## Design Patterns

The patterns, that are used in the redesign of the original system, are represented in the chapter.

### Factory on Strategy patterns

#### Export Metrics 
In order to export the metrics into a file, a Factory on a Strategy pattern was implemented.  This pattern was chosen due to the fact that it makes it easier to extend MetricsExporter and add new types of exporting files without affecting the clients. This happens thanks to the Strategy pattern where we create an interface and we are easily able to extend the Exporters with less need of changes in the client. Only implementing a Strategy pattern still affects the clients , since it is coupled in MetricsExporter implementation. In order to avoid that, the Factory pattern is implemented on a Strategy pattern. This helps to extend MetricsExporter without affecting the client and the logic to instantiate classes is separated(separation of concerns). 

 The following classes participate in this pattern:
* MetricsExporterFactory - it is used to refer to all objects of MetricsExporter in order for the the clients not to be aware of which instance they are using

* MetricsExporter - it is an interface that is used in order to reduce the dependency between the clients and the different types of Exporters and makes the Exporters extendible with less needs of changes.

* CsvExporter - it is a class that implements the MetricsExporter and its methods. It is used to export the Metrics into a csv file.

* JsonExporter -  it is a class that implements the MetricsExporter and its methods. It is used to export the Metrics into a csv file.

## Build the module

Build the executable Java application with the following command

    ``` mvn package jacoco:report ```


## Run the module

Run the executable by executing
   ```
     java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4
   ```

   , where args translate to:  
  *   arg0 = “JavaSourceCodeInputFile” (e.g.,   src/test/resources/TestClass.java)
  * arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
  * arg2 = “SourceCodeLocationType” [local|web]
  *    arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
  *    arg4 = “OutputFileType” [csv|json]

   Here is an example:
          
        java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv
