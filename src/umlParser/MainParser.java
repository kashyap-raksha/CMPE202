package src.umlParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainParser {
	
	private static File src_files = null;
	private static File[] listOfFiles = null;

	public static void main(String[] args) throws IOException  {
		//FileInputStream in = new FileInputStream("C:/Windows/uml-parser-test-1");
		
		//Stream<String> lines = Files.lines(Paths.get("C:/Windows/uml-parser-test-1"));
		if (args.length == 2){
			String src = args[0];
			String outputfile = args[1];
			src_files = new File(src);		
		}
		else
		{
			System.out.println("Provide all required arguments.");
		}
		
		
		//FileInputStream in = new FileInputStream(src);
		//System.out.println(in);
		
	}
}
