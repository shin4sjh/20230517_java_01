package operator;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int iNum = sc.nextInt();
		
		if (iNum > 0) {
			System.out.println("양수다.");
		} 
		else if (iNum == 0) {
			System.out.println("0이다.");
		}
		else {
			System.out.println("음수다.");
		}	
		sc.close();
	}
}