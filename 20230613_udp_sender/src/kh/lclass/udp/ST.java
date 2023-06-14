package kh.lclass.udp;

public class ST {

	public static void main(String[] args) {
		new ST().sender();
	}
	public void sender() {
		int myport = 1248;
		int destport = 0613;
	}
}


/*
 * 1. 서버의 포트번호 정함 
 * 2. DatagramSocket 객체 
 * 3. 연결한 클라이언트 IP주소를 가진 InetAddress 객체 생성
 * 4. 전송할 메시지를 byte[]로 바꿈 
 * 5. 전송할 메시지를 DatagramPacket 객체에 담음 
 * 6. 소켓 레퍼런스를 사용하여 메시지전송 
 * 7. 소켓 닫음
 */