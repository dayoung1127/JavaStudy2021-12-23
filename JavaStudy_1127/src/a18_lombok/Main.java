package a18_lombok;

public class Main {

	public static void main(String[] args) {
		User user = new User("ddd","1234","sss","ffff");
		User user2 = new User("ddd","1234","sss","ffff");
		
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user.equals(user2));
		
		Student s = Student.builder().studentName("다영").studentYear("1").studentClass("2").build();
		//builder() 까지가 생성 그 후에는 setter 실행됨 (생성+setter)
		System.out.println(s);
	}

}
