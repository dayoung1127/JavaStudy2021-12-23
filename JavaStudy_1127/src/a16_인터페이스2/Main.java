package a16_인터페이스2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService userService = null;
		
		while(true) {
			System.out.println("[서비스 선택]");
			System.out.println("1. naver");
			System.out.println("2. kakao");
			int select = scanner.nextInt();
			scanner.nextLine();
			
			if(select == 1) {
				userService = new NaverUserServiceImpl();
				break;
			}else if(select == 2) {
				userService = new KakaoUserServiceImpl();
				break;
			}else {
				System.out.println("지원하지 않는 서비스입니다.");
			}
			System.out.println();			
		}
		
/*		UserService naverService = new NaverUserServiceImpl();
		User naverUser = naverService.getUser();
		if(naverUser == null) {
			System.out.println("입력하신 계정의 사용자를 찾을 수 없습니다.");
		}else {
			System.out.println(naverUser.toString());
		} 
		
		UserService kakaoService = new KakaoUserServiceImpl(); */
		
		
		User user = userService.getUser(); //인터페이스가 같이때문에 네이버,카카오 동일하게 getuser 기능 사용 가능
		if(user == null) {
			System.out.println("입력하신 계정의 사용자를 찾을 수 없습니다.");
		}else {
			System.out.println(user.toString());
		}
		
		
		
		
		
	}

}
