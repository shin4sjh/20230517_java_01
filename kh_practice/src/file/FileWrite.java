package file;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {

	public void testFile() {

		String path = "D:/Hello/World";
		String filename = "a.txt";
		new File(path).mkdirs();
		File f1 = new File("D:/Hello/World");
		f1.mkdir();
		File f2 = new File("D:/Hello/World/a.txt");
		FileWriter fw = null;
		try {
			f2.createNewFile(); 

			fw = new FileWriter(f2); 
			fw.write("Hello, World"); 
			fw.flush(); 
			return;
		} catch (IOException e) {
			System.out.println("file 생성 못함");
			e.printStackTrace();
		} finally { 
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}