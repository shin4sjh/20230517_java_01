package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkServer {
 
//	1. 서버의 포트번호 정함
//	2. 서버용 소켓 객체 생성
//	3. 클라이언트 쪽에서 접속 요청이 오길 기다림
//	4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓
//	객체 생성
//	5. 연결된 클라이언트와 입출력 스트림 생성
//	6. 보조 스트림을 통해 성능 개선
//	7. 스트림을 통해 읽고 쓰기
//	8. 통신 종료
	
	public void testTcpServer(int port) {
		// 1
		ServerSocket ss = null;
		Socket sc = null;
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		BufferedWriter wr = null;
		try {
			// 2
			ss = new ServerSocket(port);
			
			
			while(true) {
				System.out.println("클라이언트 접속 대기 중......");
				// 3
				// 4
				sc = ss.accept();
				System.out.println("클라이언트 접속됨:"+sc.getPort());
				
				// 5.
				in = sc.getInputStream();
				out = sc.getOutputStream();
				// 6.
				br = new BufferedReader(new InputStreamReader(in));
				wr = new BufferedWriter(new OutputStreamWriter(out));
				
				String receivedMsg = null;
				while((receivedMsg = br.readLine()) != null ) {
					System.out.println("받은메시지: "+ receivedMsg);
					wr.write(receivedMsg+":메시지 잘 받았음.\n");
					wr.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(wr!=null) wr.close();
				if(br!=null) br.close();
				if(out!=null) out.close();
				if(in!=null) in.close();
				if(sc!=null) sc.close();
				if(ss!=null) ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
