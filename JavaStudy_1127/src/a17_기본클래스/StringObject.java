package a17_기본클래스;

import java.util.Scanner;

public class StringObject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name1 = "황다영";
		String name2 = "황다영";
		System.out.print("이름 입력 : ");
		String name3 = scanner.nextLine();
		String name4 = new String("황다영");
		
		System.out.println("name1, name2: " + (name1 == name2)); //리터럴상수라서 주소가 같음
		System.out.println("name1, name3: " + (name1 == name3)); //버퍼에 저장해놨다가 스트링을 생성하는 과정을 거치기 때문에 주소가 다름
//		System.out.println("name1, name4: " + (name1 == name4)); //스트링 클래스를 생성 후 그 안에 값을 넣어서 주소가 다름
		System.out.println("name1, name4: " + (name1.equals(name4))); //equals 들어가보기
		
		
	}

}
