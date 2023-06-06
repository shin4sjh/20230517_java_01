package operator;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사탕의 개수를 입력해 주세요. ");
		
				
		System.out.println("인원 수 : ");
		int pNum = sc.nextInt();
		
		
		System.out.println("사탕 개수 : ");
		int cNum = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+ cNum / pNum );
		System.out.println("남는 사탕 개수 : "+ cNum % pNum );
		
		sc.close();
	}
}

