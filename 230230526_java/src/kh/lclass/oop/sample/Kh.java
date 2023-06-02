package kh.lclass.oop.sample;

public class Kh implements TestInterface {

//	private static final long

//	static final long serrialVersionUID

	public void khSpecual() {
		String str = "1111122222222";
//		int c =  Interger.parseIn(str);
		Car[] carArr = new Car[3];
		try {
			System.out.println("1");
			carArr[4].setPrice(5000);
			System.out.println("2");
			carArr[0].setPrice(5000);
			int a = Integer.parseInt(str); 
			int c = 10 / 0; 
			c = 0 / 10;
		}	catch(Exception e) {
			System.out.println(Integer.MAX_VALUE + "까지의 정수만 입력해 주세요");
			e.printStackTrace();
			}
		}

//			Car[] carArr = new Car[3];
//			carArr[0] = new Car();
//			carArr[0].setPrice(5000); // NullPointException
//
//			int a = Integer.parseInt(str); // NumberFormatException
//
//			int c = 10 / 0; // ArtihmeticException
//			c = 0 / 10;
//
//		} catch (Exception e) {
//			System.out.println(Integer.MAX_VALUE + "까지의 정수만 입력해 주세요");
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눈 수는 나타낼 수 없습니다.");
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		} 
//			carArr[4].setPrice(5000);
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//
//	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int method3(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
