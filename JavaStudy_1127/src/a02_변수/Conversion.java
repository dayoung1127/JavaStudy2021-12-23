package a02_변수;

public class Conversion {

	public static void main(String[] args) {
		int num = 10;
		double number = num;
		int age = (int)number;
		
		System.out.println(age);
		
		//업캐스팅
		// 1. 문자 -> 정수
		char c = 'A';
		int i_c = c;
		System.out.println(i_c);
		
		int i = 10000000;
		char c_i = (char)i;
		System.out.println(c_i);
		
		//정수 - 실수
		double i_d = i;
		System.out.println(i_d);

		double d = 3.14;
		int d_i = (int)d;
		System.out.println(d_i);
	}

}
