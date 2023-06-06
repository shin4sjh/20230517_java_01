package operator;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//스캐너 가져다가 전원버튼 누름
		
		/*System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double score = scan.nextDouble();
		System.out.print("");
		System.out.println("성별(M/F) : ");
		String gender = scan.nextLine();
		System.out.print("");
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double score2 = scan.nextDouble();
		System.out.println(gender+score+score2); */
		
		
		
		//enter key눌릴때 가지의 데이터를 스캔해줘
//		1 2 가 나 다 enter
//		scan 은데이터 "11 22 33.3 가가가 나나 다 \n\0"
		String str1 = scan.nextLine(); // 띄워 쓰기 정까지 한덩어리(문자형태) 리턴해달라는 의미
		scan.nextLine(); // flush()
		System.out.println(str1);// 11
		int num1 = scan.nextInt();//띄워쓰기 전까지한덩어리를 정수로 바꿔서 리턴
		scan.nextLine(); // flush()
		System.out.println(num1);//22
		double num2 = scan.nextDouble(); //띄워쓰기 전까지한덩어리를 실수로 바꿔서 리턴
		scan.nextLine(); // flush()
		System.out.println(num2);//33.0
		String str2 = scan.nextLine(); //줄바꿈 까지 덩어리를 문자형태로 바꿔서 리턴
		scan.nextLine(); // flush()
		System.out.println(str2);//가가가 나나 다\n
		
		
		System.out.println("입력1");
		int num3 = scan.nextInt();
		System.out.println(num3);		
		
		
		System.out.println("입력2");
		scan.nextLine();
		String str3 = scan.nextLine(); //버퍼 클리어 flush
		System.out.println(str3);		
		

		System.out.println("끝");
		
		
		//		scan.hasNext();
		
		
		scan.close();
	}
	

}



