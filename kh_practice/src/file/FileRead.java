package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {

	public void testFileRead() {
		String filePath = "D:/Hello/World/b.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			String string = br.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {// 해제 순서 (생성반대순서) : 보조스트림 -->
				if (br != null)
					br.close();
				if (isr != null)
					isr.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
