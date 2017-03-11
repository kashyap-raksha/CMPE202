package src.umlParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainParser {

	public static void main(String[] args) throws IOException  {
		//FileInputStream in = new FileInputStream("C:/Windows/uml-parser-test-1");
		
		Stream<String> lines = Files.lines(Paths.get("C:/Windows/uml-parser-test-1"));
		
		System.out.println(lines);

	}

}
