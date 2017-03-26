package src.umlParser;

import java.io.FileInputStream;
import java.io.IOException;

public class MainParser {

	public static void main(String[] args) throws IOException  {
		//FileInputStream in = new FileInputStream("C:/Windows/uml-parser-test-1");
		
		//Stream<String> lines = Files.lines(Paths.get("C:/Windows/uml-parser-test-1"));
		
		String src = args[0];
		String outputfile = args[1];
		
		FileInputStream in = new FileInputStream(src);
		System.out.println(in);

	}

}
