package a10_클래스2;

public class UserControl {

	public static void main(String[] args) {
		UserService userService = new UserService(); //생성되는순간 스캐너 쓸수 있음
		
		User[] users = userService.setUserArray(); 
		
		userService.insertUser(users);
		
		userService.showUsersInfo(users);
		
	//	User user = userService.addUser();   //return되는 주소값을 user에 넣음
		
	//	user.showUserInfo();

	}

}
