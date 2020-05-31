# SEiP Assignments
![Build Status](https://travis-ci.com/Elviraant/seip-assignments-2020.svg?token=pzpqKfQedSgCeLFRqpFW&branch=master)

This is a repository created as a part of the course of Software Enginering in Practice offered by the Department of Management Science and Technology of Athens University of Economics and Business in order to understand and practice on Maven and other build automation tools.

## Requirements
In order to build this project, download:

1) [Java Development Kit 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

2) [Maven](https://maven.apache.org/download.cgi)

## Project Structure
The repository consists of a parent Maven project and a sub-project(module).

* [Grades Histogram](gradeshistogram) - creates a histogram based on the frequencies of a given set of grades.

* [Unit Testing](unittesting) - contains classes for simple and complex arithmetic operations as well as for input/output operations for files and their respective test classes.
 
* [Source Code Analzyer](sourcecodeanalyzer) - contains a redesign of a system based on the SOLID design principles by applying the appropriate design patterns.
### Grades Histogram
This module uses an one runtime dependency and thus, it is packaged in the main jar (fat-jar) using the ```maven-assembly-plugin``` plugin.

In order to build the module execute the following command in the repository root directory:
```
mvn package
```

The produced jar is located in the target directory and is executed as following:
```
java -jar gradeshistogram/target/gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar [input_file]
```
### Unit Testing
This module contains functional code and their respective test cases.

The tests are executed using the following Maven command
```
mvn test jacoco:report
```

You'll also get a test coverage report produced by JaCoCo which is located in the ``` target/site/jacoco ``` of the unittesting module.  

## Build the project

In order to build the whole project, execute the following Maven commnand
```
mvn clean package jacoco:report
```

### JaCoCo Code Coverage
In order to generate the code coverage report for the unittesting module, the ```jacoco-maven-plugin``` plugin is added in the main ``` pom. xml ``` file

```
<plugin>
        <groupId>org.jacoco</groupId>
		<artifactId>jacoco-maven-plugin</artifactId>
		<version>0.8.2</version>
		<executions>
			<execution>
				<goals>
					<goal>prepare-agent</goal>
				</goals>
			</execution>
			<!-- attached to Maven test phase -->
			<execution>
				<id>report</id>
				<phase>test</phase>
				<goals>
					<goal>report</goal>
				</goals>
			</execution>
		</executions>
</plugin>
```
### jUnit dependency

In order to test the project, the ``` junit ``` dependency was added in the parent's ``` pom.xml ``` file

```
<dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
</dependency>
```

### Mockito dependency
The ``` mockito-core ``` dependency is also added into the parent's ``` pom.xml ``` file to help with the creation of some unit tests


```
<dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>2.27.0</version>
            <scope>test</scope>
</dependency>
```

## Continuous Integration service
This project utilizes TravisCI services in other to test and build the application upon each git-push in the repository. In the ``` .travis.yml ```configuration file the script that we'll be executed after each commit is defined and it is the following
``` 
mvn clean package jacoco:report
```
If there are no erros, then the build will pass and the badge will be green. Otherwise, it will be red.
