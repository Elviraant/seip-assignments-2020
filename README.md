# SEiP Assignments
This is a repository created as a part of the course of Software Enginering in Practice offered by the Department of Management Science and Technology of Athens University of Economics and Business in order to understand and practice on Maven and other build automation tools.

## Project Structure
The repository consists of a parent Maven project and a sub-project(module).

* [Grades Histogram](gradeshistogram) - creates a histogram based on the frequencies of a given set of grades.

In order to build the module execute the following command in the repository root directory:
```
mvn package
```

### Grades Histogram
This module uses an one runtime dependency and thus, it is packaged in the main jar (fat-jar) using the ```maven-assembly-plugin``` plugin.

The produced jar is located in the target directory and is executed as following:
```
java -jar gradeshistogram/target/gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar [input_file]
```

