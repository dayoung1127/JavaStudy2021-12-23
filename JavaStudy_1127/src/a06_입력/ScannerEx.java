package a06_입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next(); //문자열
		System.out.println("사용자의 이름은 " + name + " 입니다.");
		int year = in.nextInt(); //숫자열
		System.out.println("입력하신 년도는 " + year + " 입니다.");

	}

}
