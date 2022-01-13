package a16_인터페이스2;

public class UserData {
	private User[] userDataBase;
	
	public UserData() {
		userDataBase = new User[5];
	}
	
	public User[] getUserDataBase() {
		return userDataBase;
	}

	public void setUserDataBase(User[] userDataBase) {
		this.userDataBase = userDataBase;
	}

	public void insertUsers() {
		userDataBase[0] = new User("aaaa", "1234", "다영", "wou3768@gmail.com");
		userDataBase[1] = new User("bbbb", "123", "다영2", "wou376@gmail.com");
		userDataBase[2] = new User("cccc", "12", "다영3", "wou37@gmail.com");
		userDataBase[3] = new User("dddd", "1", "다영4", "wou3@gmail.com");
		userDataBase[4] = new User("eeee", "12345", "다영5", "wou@gmail.com");
	}
	
}
