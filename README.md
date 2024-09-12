1. What do you know about StringUtils?

StringUtils is a java class from the library Apache Commons Lang. It extends Java’s built-in String capabilities, and has a range of useful methods. Some of the common methods in StringUtils can be used to check for Empty or Null Strings, manipulate Strings such as capitalization and abbreviation, or even splitting and joining Strings.

2. How to find the class in the project?

The class StringUtils is not located in the main Java libraries that are present in the JDK. Therefore, classes such as these must have the libraries that they are located in, be imported into the project. Then the library must also be added to the project’s dependencies. Once these steps are complete, the class can be used in the project.

3. How to find strings in the project?

For this project, the contents of a file can be read and stored in our code as one large String. This String can then be modified and split into many Strings as separated, individual words using the StringUtils.split() method. 

4. What do you know about FileUtils?

FileUtils is a java class from the library Apache Commons IO. This class comes with useful methods for manipulating  files and directories in Java. Some of these methods include reading and writing to files, copying or moving files and directories,  or even deleting files and directories.

5. How to debug code? How to get the current variables' value on debugging?

Using IntelliJ IDEA, you can start the debugging process by setting breakpoints in your code. Then by either pressing the Debug button or Shift + F9 in IntelliJ, the program will start running in debug mode. Then using the Step Over, Step Into, Step Out, and Resume Program buttons, you can step through the code. In the Variables pane in the Debug window, a list of all the current values of all the variables in the current scope will be displayed. 

6. How to set up remote debugging?

Assuming that the Java application is running in a remote environment, you start by opening up the Java project, navigating to the Run menu, and then stepping into Edit Configurations. This is where you can set up and configure the remote debug settings. Start by giving the configuration a name, then enter the Host address and the Port number where the application is being run remotely. To finalize the configuration settings, click on Apply and OK. Now when debugging the program, IntelliJ will start the remote debugging session and connect to the remote application.
