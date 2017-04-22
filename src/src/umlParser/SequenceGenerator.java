package src.umlParser;

public class SequenceGenerator {

	final String inputPath;
	final String className;
	final String funcName;
	final String outputFile;

	public SequenceGenerator(String inputPath, String className, String funcName,String outputFile) {
		this.inputPath = inputPath;
        this.outputFile = inputPath + "\\" + outputFile + ".png";
        this.className = className;
        this.funcName = funcName;
	}

	public void start() {
		// TODO Auto-generated method stub
		//Generates sequence diagram

	}
}