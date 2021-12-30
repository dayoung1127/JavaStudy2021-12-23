package a11_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];	//user 다섯개를 담을 수 있는 공간 5개
		
		User user = new User("dayoung", "1234", "다영", "werrew");
		User user2 = new User("dayoung", "4321", "황다영", "werrew");
		
		users[0] = user;
		users[4] = user2;
		
	
		
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {		// i =1 일 땐 주소값 없음
				continue;
			}
			users[i].showUserInfo();
		
		}
		
		
		
		
	}

}
