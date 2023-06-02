package kh.lclass.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class TestCollection<Car> {
	
	public <E extends Number, J> String testGeneric(E a,J b) {
		System.out.println(a.getClass().getName());
		return a.toString()+"결과값";	
	}
	
	public void TestStack() {
		Stack<String> strStack = new Stack<String>();
		strStack.push("안녕");
		strStack.add("하");
		strStack.push("세요");
		System.out.println(strStack);
		System.out.println(strStack.get(1));
	}
	
	public void testHashMap() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("ej", 35.0);
		objMap.put("jy", "지영이네");
		objMap.put("hj", "");

		System.out.println(objMap.toString());
		System.out.println();
		Set<String> keyset = objMap.keySet();
		System.out.println("=====");
		for (String item : keyset) {
			Object value = objMap.get(item);
			System.out.println(item + " : " + value);
		}
		Set<String> StringSet = new HashSet<String>();
		Iterator<String> itr = StringSet.iterator();
		while (itr.hasNext()) {
			String item = itr.next();
			Object value = objMap.get(item);
			System.out.println(item + " : " + value);
		}

	}

	public void testHashSet() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(0);
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(44);
		System.out.println(integerSet.toString());
		System.out.println("===");
		for (Integer item : integerSet) {
			System.out.println(item);
		}
		System.out.println("==");
		Iterator<Integer> itr = integerSet.iterator();
		System.out.println(itr);
		while (itr.hasNext()) {
			Integer item = itr.next();
			System.out.println(item);
		}
	}

	public void TestArrayList() {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Car> list3 = new ArrayList<Car>();

		String[] strArr1 = new String[3];
		strArr1[0] = "apple";
		strArr1[1] = "banana";
		strArr1[2] = new String("mango");

		/*
		 * 
		 * public class ArrayList implements List{ public boolean add (String e){ // }
		 * public boolean add (Integer e) // public boolean add (Double e) // public
		 * boolean add (Car e)
		 * 
		 * ----------------------- public boolean add (Object)
		 */ //

		// List-for

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		// 배열-for

		for (int i = 0; i < strArr1.length; i++) {
			String item = strArr1[i];
			System.out.println(strArr1[i]);
		}
		// enhanced for
		for (Integer item : list2) {
		}
		for (String item : strArr1) {
		}

		list.add("1번");
		list.add("2");
		list.add("3번");
		list.add("2번");
		list.add(1, "2번대신끼워넣기");
//		list.remove"2번;
//		list.removeall(list2);
		Collection<String> collection1 = new ArrayList<String>();
//		list.remove(0);
//		list.clear();
		collection1.add("2번");
//		collection1.add("3번");
		list.remove(collection1);
		((ArrayList<String>) list).clone();

		if (list instanceof ArrayList) {
			ArrayList<String> copylist = (ArrayList<String>) (((ArrayList<String>) list).clone());
			System.out.println(copylist);

		}

		ArrayList<String> copy = (ArrayList<String>) list.clone();

		System.out.println(copy);
		System.out.println(list);
	}

}
