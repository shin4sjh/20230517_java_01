package kh.lclass.oop.sample;

public class Driver {
	private int license;
	private int money;

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 자동차 구매
	public void buy(Car c) {
		if (money > c.getPrice()) {
			((Avante)c).moveAvante();
			if(c instanceof Sonata) {
				((Sonata)c).moveSoanta();
				c.defaultFun();
				System.out.println("Sonata 이벤트에 응모되셨습니다.");
			}
			System.out.println(c.getPrice()+"원에 구매 확정");
			money = money-c.getPrice();
		} else {
			System.out.println("잔액 부족");
		}
	}

	public void driving() {

	}
}
