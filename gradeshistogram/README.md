# Grades Histogram

This is a module created as a part of the 2nd assignment for the course Software Engineering in Practice offered by the department of Management Science and Technology of the Athens University of Economics and Business.

The goal is to create an histogram from a given file of grades.

## Build the project

iIn order to build the project and create the executable jar, run the Maven command
```
mvn package
```
### jFree chart dependency

In order to create the histogram, ``` jfreechart ``` dependency is added in themodule's ``` pom.xml ``` file
```
<dependency>
      <groupId>org.jfree</groupId>
      <artifactId>jfreechart</artifactId>
      <version>1.5.0</version>
</dependency>
```

### Maven assembly plugin

This module uses an one runtime dependency and thus, it is packaged in the main jar (fat-jar) using the ``` maven-assembly-plugin plugin``` in the module's ``` pom.xml ``` file

```
 <plugin>
        <artifactId>maven-assembly-plugin</artifactId>
        <version>3.2.0</version>
        <configuration>
          <archive>
            <manifest>
              <mainClass>HistogramGenerator</mainClass>
            </manifest>
          </archive>
          <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
          </descriptorRefs>
        </configuration>
        <executions>
          <execution>
            <id>make-assembly</id> <!-- this is used for inheritance merges -->
            <phase>package</phase> <!-- bind to the packaging phase -->
            <goals>
              <goal>single</goal>
            </goals>
          </execution>
        </executions>
</plugin>
```

## Run the project

The produced jar is located in the target directory and is executed from the root directory as following:
```
java -jar gradeshistogram/target/gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar [input_file]
```

