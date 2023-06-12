package socket.run;

import socket.NetworkClint;

public class ClintRun {

	public static void main(String[] args) {
		new NetworkClint().testTcpClient("127.0.0.1", 9001);
	}

}
