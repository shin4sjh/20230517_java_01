package file.run;

import file.FileRead;
import file.FileWrite;

public class Run {

	public static void main(String[] args) {
		FileWrite tf = new FileWrite();
		FileRead rf = new FileRead();
		
		tf.testFile();
		rf.testFileRead();
	}

}


