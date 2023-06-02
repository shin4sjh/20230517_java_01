package kh.lclass.Collection;

import kh.lclass.oop.sample.Car;

public class Main {

	public static void main(String[] args) {
		new TestCollection().testHashSet();
		new TestCollection().testHashMap();
		new TestCollection().TestArrayList();
		new TestCollection().TestStack();
		new TestCollection().testGeneric(35.5,11);
		TestCollection tc = new TestCollection();
		tc.testGeneric(35.5,"노기");
		String str = tc.testGeneric(35.5,2);
		System.out.println(str);
//		str = tc.testGeneric("안녕",35);
		str = tc.testGeneric(22,"안녕");
		System.out.println(str);
//		str = tc.testGeneric(new Car(300));
		System.out.println(str);
		
		
	}

}
