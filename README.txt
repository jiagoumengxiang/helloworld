Simple Java 8 Hello World program with Gradle

A simple Java 8 Hello World program that takes command line arguments as input into the textual response.
The program is built using gradle with the Spock Framework used for testing.

1. Run the gradle build to compile, test, and assemble the code into a JAR file.

./gradle build

2. The program can be run from the assembled jar file located in the project's build/libs folder.

java -jar example-helloworld-1.0.0.jar
java -jar example-helloworld-1.0.0.jar World
java -jar example-helloworld-1.0.0.jar Boys and Girls
