package kh.lclass.oop.sample;

public class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal {
	@Override
	public void move() {
		
	}
}