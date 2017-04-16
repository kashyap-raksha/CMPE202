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
		
		array = get_Compilation_Array(inputPath);
        buildMap(array);
        for (CompilationUnit cu : array){
            yumlCode += parser(cu);
        }
        yumlCode += parsed_code();
        yumlCode = yuml_UniqueLines(yumlCode);
        System.out.println("Unique Code: " + yumlCode);
        //class for generate diagram.
    }

	private ArrayList<CompilationUnit> get_Compilation_Array(String inputPath2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String parser(CompilationUnit cu) {
		// TODO Auto-generated method stub
		return null;
	}

	private String yuml_UniqueLines(String yumlCode2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String parsed_code() {
		// TODO Auto-generated method stub
		return null;
	}

	private void buildMap(ArrayList<CompilationUnit> array2) {
		// TODO Auto-generated method stub
		
	}

}
