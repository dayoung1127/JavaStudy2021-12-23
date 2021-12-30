package a10_클래스2;

import java.util.Scanner;

public class UserService {
	private Scanner scanner; //Scanner - 자료형
	
	public UserService() {		//UserService()가 생성되는 시점에 스캐너 실행
		scanner = new Scanner(System.in);
	}
	//사용자 추가
	public User addUser() {
		String username = null;  //null = 주소가 0, 초기화 하는 것
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("사용자의 정보를 입력해 주세요.");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("이메일: ");
		email = scanner.nextLine();

		return new User(username, password, name, email);  //User user = new User();  return user와 같음,  주소값을 리턴함
		
		//User user = new User();
		//return user;
		
		
	/*	User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setEmail(email);
		*/
	}
	
	//사용자 추가
	public User addUser2() {
		User user = new User();
		
		System.out.println("사용자의 정보를 입력해 주세요.");
		System.out.print("아이디: ");
		user.setUsername(scanner.nextLine());
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
		System.out.print("이름: ");
		user.setName(scanner.nextLine());
		System.out.print("이메일: ");
		user.setEmail(scanner.nextLine());
		
		return user; 
	
		}
	
	public User[] setUserArray() {
		System.out.print("몇명의 사용자를 입력하시겠습니까? ");
		int index = scanner.nextInt();
		scanner.nextLine();
		return new User[index];	
	} 
	
	/*
	 * 1첫번째 사용자를 등록하시겠습니까? 
	 * y면 addUser() 호출해서 사용자등록
	 * n면 continue
	 * 
	 * 2두번째 사용자를 등록하시겠습니까? 
	 * y면 addUser() 호출해서 사용자등록
	 * n면 continue
	 */
	

	public void insertUser(User[] users) {
		int insertCount = 0;
		
		for(int i = 0; i < users.length; i++) {
			System.out.print((i + 1) + "번째 사용자를 등록하시겠습니까? ");
			String select = scanner.nextLine();
			if(select.equals("y")) {		//string만 equals 씀, 리턴값 boolean
				users[i] = addUser();	
				insertCount++;
			}else {
				continue;
			}
			
		}
		System.out.println("사용자 입력 완료(" + insertCount + "건)");
	}
	
	public void showUsersInfo(User[] users) {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			users[i].showUserInfo();
		}
	}

}
