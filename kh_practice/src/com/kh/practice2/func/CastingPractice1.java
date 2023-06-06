package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void method2() {
	
	System.out.println("문자 : ");
	Scanner sc = new Scanner(System.in);
	char code = sc.next().charAt(0);
	System.out.println("A unicode : " + (int)code);
	
	sc.close();
	}
}