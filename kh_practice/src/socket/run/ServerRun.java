package socket.run;

import socket.NetworkServer;

public class ServerRun {

	public static void main(String[] args) {
		// 1. 서버의 포트번호 정함 ==> 프로그램의 포트번호
				new NetworkServer().testTcpServer(9001); 
			}
		
	}


