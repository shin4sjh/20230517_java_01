package kh.lclass.oop.sample;

public class Person {
	
	// main 메소드 안에 private / public 같은 접근제한자 못써요. 
	// 메소드 안에는 지역변수로 접근제한자 사용이 불가합니다.
	// 필드 / 메소드 정의 위치 다시 확인!!!
	
		private String name;
		private int age;
		private char gender;
		
		//생성자 여러개
//		오버로딩 생성자 메소드이름 클래스 명과동일
//		생성자 new와 함께
//		리턴타입 없다.
		public Person(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		//기본생성자
//		allArgumentsConstructor
//		allAumentsConstrutor
//		allAumentsConstrutor 란 모든 매개인자를 받아서 처리하는 생성자
//overloading으로 생성자
//		Arguments parameter 매개인자
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age= age; 
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public char getGender() {
			return gender;
		}
		
		public void setGender(char gender) {
			this.gender = gender;
		}

		
		
	}
	