package kh.lclass.udp;

public class RT {

	public static void main(String[] args) {
		new RT().receiver();
	}
	public void receiver() {
		
	}
}
/*
 * 1. 서버가 보낸 메시지를 받을 byte[] 준비 
 * 2. DatagramSocket 객체 생성 
 * 3. 메시지 받을 DatagramPacket객체 준비 
 * 4. byte[]로 받은 메시지를 String으로 바꾸어 출력 
 * 5. 소켓 닫음
 */