package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void method3() {
		
		System.out.println("세 과목의 점수를 입력");
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		int K = sc.nextInt();  
		System.out.println("수학 : ");
		int M = sc.nextInt();  
		System.out.println("영어 : ");
		int E = sc.nextInt();  
		
		System.out.println("총점 : " + (K+M+E) );
		System.out.println("평균 : " + (K+M+E)/3);
		
		sc.close();
		}
	}
		
	

