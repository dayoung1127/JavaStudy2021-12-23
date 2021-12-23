package a09_메소드;

/**
 * 
 * 오버로드
 * 같은 메소드명을 가지면서 다른 형태의 기능으르 구현할 수 있는 메소드 정의 방식
 * 
 * 매개변수가 다르면 같은 이름이더라도 다른 메소드이다.
 *
 */

public class Overload {
	
	// 두 수의 합을 구하는 메소드
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void add(String num1, String num2) {	//매개변수의 자료형이 다르면 다른 메소드, 오버로딩은 매개변수만을 따른다.
		System.out.println(num1 + num2);
	}
	
	public static void add(String num1, int num2) {	
		System.out.println("string, int");
		System.out.println(num1 + num2);
	}
	
	public static void main(String[] args) {
		add(5,7);
		add("5","7"); 
		add("5",4); 
	}

}
