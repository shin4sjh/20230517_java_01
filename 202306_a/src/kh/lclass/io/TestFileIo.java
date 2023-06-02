package kh.lclass.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIo {
	public void testFile() /* throws IOException */ {
//		File f1 = new File("D:/data/aaa.txt");
//		Unhandled exception type IOException

		String path = "D:/data2/test";
		String filename = "aaa.txt";
		new File(path).mkdirs();
		File f1 = new File("D:/data2/test");
		f1.mkdir();
		File f2 = new File("D:/data2/test/aaa.txt");
//		path filename
		FileWriter fw = null;
		try {
			f2.createNewFile();

			fw = new FileWriter(f2);
			fw.write("abcdefg");
			fw.flush();

		} catch (IOException e) {
			System.out.println("file 생성 못함");
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)	/* { */fw.close();/* } */
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}