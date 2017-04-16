package src.umlParser;

import java.io.File;
import java.util.ArrayList;

import japa.parser.ast.CompilationUnit;

public class javaParser {
	
	final String inputPath;
    final String outPath;
    String yumlCode;
	ArrayList<CompilationUnit> array;
	
	public javaParser(String args, String args2){
		//constructor
		inputPath = args;
		outPath = args+"\\" + args2 + ".png";
		System.out.println(inputPath);
		System.out.println(outPath);
	}
	
	public void startParsing(File file){
		//read the file for different keywords in the files.
		
		
	}

}
