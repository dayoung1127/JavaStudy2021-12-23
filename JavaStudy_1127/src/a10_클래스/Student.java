package a10_클래스;

public class Student {
	String name;
	int studentYear;
	String addr;
	String phone;
	
	void studentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + studentYear);
		System.out.println("주소 : " + addr);
		System.out.println("전화번호 : " + phone);
		
	}
	
	
/*	public Student() {   //<- 기본 생성자(생략 가능)
		               	//생성자는 무조건 주소값을 반환 -> Student 앞 반환형 생략
		System.out.println("학생 만들어짐?");
	} */
	
	
	
}
