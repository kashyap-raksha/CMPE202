# CMPE202 Project

UMLParser:
A Java code parser which takes Java code file as input and gives the UML class diagram as the output based on the code.

Apache Maven: Apache Maven is a software project management and comprehension tool. Maven addresses two aspects of building software: firstly, it describes how software is built, and secondly, it describes its dependencies. Maven dynamically downloads Java libraries and Maven plug-ins. Apache Maven is used with Eclipse IDE.

This project consists of two main parts:
1.	Parser: The parser in this project parses the input JAVA source code provided by the user and converts it into a grammar that is interpretable by the UML diagram generator tool. JavaParser is used to parse the input JAVA source code in this project.
2.	UML diagram generator: The UML diagram generator tool accepts the parsed grammar as input, interprets the grammar and draws a UML diagram for the grammar. (In our case, a UML Class diagram). PlantUML tool is used to draw the UML diagram in this project.

JavaParser:  JavaParser is a set of tools to parse, analyze, transform a JAVA source code and generate a grammar that can be interpreted. For more information on JavaParser, follow this link: http://javaparser.org/

PlantUML: PlantUML is a tool that interprets the parsed grammar of a source code and generates a UML diagram. To use this tool, Java must be installed on your machine, and Graphviz software is required for generating a UML Class diagram using PlantUML. Follow this link for more information on PlantUML: http://plantuml.com/

Execution requirements:
1.	Source Folder Path: 
  •	Source Path string is the first argument to be provided.
  •	The string must be enclosed within double quotes.
  •	The entire path to the folder containing the .java source files to be given as input must be mentioned as the argument.
  For example: “D:\SJSU\202-Project\test4”
2.	Diagram file name:
  •	Diagram file name is the second argument that needs to be provided.
  •	This string has to be enclosed within double quotes.
  •	The file name has to be given without the destination folder path and the file extension.
  •	The diagram is always generated in the folder where the project files are present.
  For example: “class_diagram”
  
To generate the class diagram using the .jar file in the command prompt:
  java -jar UMLParser.jar class "D:\SJSU\202-Project\test4" “class_diagram”
