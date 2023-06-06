package variable;

import java.util.Scanner;

public class VariablePractice3 {

//	키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//	계산 공식 ) 면적 : 가로 * 세로
//	둘레 : (가로 + 세로) * 2
//
//	ex.
//	가로 : 13.5
//	세로 : 41.7
//
//	면적 : 562.95
//	둘레 : 110.4

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 : ");
		double width  = sc.nextDouble();
		System.out.println("세로 : ");
		double length = sc.nextDouble();
		
		System.out.println("면적 : " + (width * length));
		System.out.println("둘레 : " + 2*(width+length));
		
		sc.close();
	}
}