package kh.lclass.oop.sample;

public class TestPolymophism {

	public static void main(String[] args) {
		Driver ej = new Driver();
		ej.setMoney(10000);
		ej.buy(new Avante());
		ej.buy(new Sonata());
	
	}

}
