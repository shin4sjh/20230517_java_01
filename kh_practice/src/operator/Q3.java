package operator;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		
				
		int iNum = sc.nextInt();
		if (iNum % 2 == 0) {
			System.out.println("짝수다.");
		} 
		else {
			System.out.println("홀수다.");
		}	

		/*		if (iNum % 2 == 1) {
			System.out.println("홀수다.");
		} 
		else if (iNum == 0){
			System.out.println("0이다.");
		}	
		else System.out.println("짝수다.");
		 */		
		
		sc.close();
	}
}

