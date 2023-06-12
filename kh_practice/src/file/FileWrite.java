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
//		path filename
		FileWriter fw = null;
		try {
			f2.createNewFile(); // 파일생성

			fw = new FileWriter(f2); // File에 문자 형태 전송이 가능한 OutputString (File 과 java 프로그램의 통로)
			fw.write("Hello, World"); // 전송하고자 하는 문자
			fw.flush(); // 전송한 문자가 담긴 버퍼(통로)를 깨끗하게 밀어내기
			return;
		} catch (IOException e) {
			System.out.println("file 생성 못함");
			e.printStackTrace();
		} finally { // return 전에 반드시 실행하고 넘어가는 문구
			try {
				if (fw != null)
					/* { */fw.close();/* } */ // 통로를 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}