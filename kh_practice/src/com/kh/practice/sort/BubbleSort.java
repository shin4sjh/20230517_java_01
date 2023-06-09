package com.kh.practice.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// SWAP a방에 b값으로 바꾸고 , b방에 a값으로 바꾸기
		int a = 10;
		int b = 30;

		/*
		 * int c = 0; c = a; // c = 10 a = b; // a= 30 b = c; // b= 10
		 */

		int temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

		// 버블정렬
		int[] arr = new int[] { 3, 2, 5, 1, 6, 8 };
		System.out.println(Arrays.toString(arr));
		// 배열 ==> List
		System.out.print("[");
		for (int ar : arr) {
			System.out.print(ar);
			if (ar != arr[arr.length - 1]) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // 오름차순
					// if(arr[j] < arr[j+1]) { // 내림차순
					// SWAP
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.print("[");
		for (int ar : arr) {
			System.out.print(ar);
			if(ar != arr[arr.length - 1]) {
				System.out.print(",");
			}
		}
		System.out.println("]"); // if last sysout ar
		// 버블정렬
		String[] nameArr = new String[]{ "손범규","천영준","유청하","김민성" };
		System.out.println(Arrays.toString(nameArr));
		// 배열 ==> List
		System.out.print("[");
		for (String ar : nameArr) {
			System.out.print(ar);
			if(ar != nameArr[nameArr.length - 1]) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		for (int i = 0; i < nameArr.length - 1; i++) {
			for (int j = 0; j < nameArr.length - 1 - i; j++) {
//						if (nameArr[j].compareTo(nameArr[j + 1]) > 0) { // 오름차순
				if (nameArr[j].compareTo(nameArr[j + 1]) < 0) { // 내림차순
					// SWAP
					String tmp = nameArr[j];
					nameArr[j] = nameArr[j + 1];
					nameArr[j + 1] = tmp;
				}
			}
		}
		System.out.print("[");
		for (String ar : nameArr) {
			System.out.print(ar);
			if(ar != nameArr[nameArr.length - 1]) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		System.out.println("========");
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		String names = sc.nextLine();
		StringTokenizer strToken = new StringTokenizer(names, ",");
		List<String> nameList = new ArrayList<String>();
		while (strToken.hasMoreTokens()) {
			nameList.add(strToken.nextToken());
		}
		// 버블 정렬하기
		System.out.println(nameList);
		System.out.print("[");
		for(String ar : nameList) {
			System.out.print(ar);
			if(ar != nameList.get(nameList.size() - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		for(int i = 0; i < nameList.size() - 1; i++) {
			for(int j = 0; j < nameList.size() - 1 - i; j++) {
				if(nameList.get(j).compareTo(nameList.get(j + 1)) > 0) {
					String tmp = nameList.get(j);
					nameList.set(j, nameList.get(j+1));
					nameList.set(j+1, tmp);
				}
			}
		}
		System.out.print("[");
		for(String ar : nameList) {
			System.out.print(ar);
			if(ar != nameList.get(nameList.size() - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		sc.close();
	}
}
