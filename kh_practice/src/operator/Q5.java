package operator;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 입력");
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.println("반(숫자만) : ");
		int Class = sc.nextInt();
		System.out.println("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.println("성별(M/F) : "); 
		sc.nextLine();		
		String gender = sc.nextLine();	//"gender = 'm' 일경우" "남" 어캐햄	
		if (gender.equals("M")) { //소문자 , m,f구분 ; 오류)
		gender = "남";
		}
		else {gender = "여";
				
		}
		
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		System.out.println(grade+"학년 "+Class+"반 "+num+"번 "+name+gender+"학생의 성적은 "+score+"이다.");
		sc.close();

	}
}
