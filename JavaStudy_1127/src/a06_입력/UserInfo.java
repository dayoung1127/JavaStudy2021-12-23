package a06_입력;

import java.util.Scanner;

/**
 * 
 * 사용자의 이름을 입력해 주세요 : 김준일 -> 문자열
 * 사용자의 아이디를 입력해 주세요 : junil -> 문자열
 * 사용자의 비밀번호를 입력해 주세요 : 1234 -> 정수
 * 사용자의 이메일을 입력해 주세요 : skjil1218@gmail.com -> 문자열
 * 
 * [입력한 사용자의 정보]
 * 이름 : 김준일
 * 아이디 : junil
 * 비밀번호 : 1234
 * 이메일 : skjil1218@gmail.com
 *
 */

public class UserInfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("사용자의 이름을 입력해 주세요 :");
		String name = in.nextLine();
		System.out.print("사용자의 아이디를 입력해 주세요 :");
		String id = in.nextLine();
		System.out.print("사용자의 비밀번호를 입력해 주세요 :");
		int password = in.nextInt();
		in.nextLine(); //버퍼에 있는 데이터를 한번에 정리 (flush)
		System.out.print("사용자의 이메일을 입력해 주세요 :");
		String email = in.nextLine();
		
		System.out.println("\r\n[입력한 사용자의 정보]\r\n"
				+ "이름 :" + name + "\r\n"
				+ "아이디 :" + id + "\r\n"
				+ "비밀번호 :" + password + "\r\n"
				+ "이메일 :" + email + "\r\n"); // \r\n : 줄바꿈

		

	}

}
