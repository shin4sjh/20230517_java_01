package kh.lclass.oop.sample;

public class Car {
	private int price;
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void defaultFun() {
		System.out.println("Car 기본 기능");
	}
	
	public void moveCar() {
		System.out.println("Car Move");
	}
}
