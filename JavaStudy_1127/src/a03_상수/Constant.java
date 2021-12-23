package a03_상수;

public class Constant {

	public static void main(String[] args) {
		int maxNumber;
		final int MAX_NUMBER;
		
		maxNumber = 100;
		MAX_NUMBER = 200;
		
		System.out.print("변수: ");
		System.out.println(maxNumber);
		System.out.print("상수: ");
		System.out.println(MAX_NUMBER);
		
		maxNumber = 200; 
		
		System.out.print("변수: ");
		System.out.println(maxNumber);
		System.out.print("상수: ");
		System.out.println(MAX_NUMBER - 100);
		

	}

}
