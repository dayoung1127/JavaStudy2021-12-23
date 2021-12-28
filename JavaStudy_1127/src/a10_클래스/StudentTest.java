package a10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(); //생성자 만든 후 학생을 s1에 넣기(주소값 반환)
		s1.name = "김준일"; //s1 주소의 name을 가져옴 
		s1.addr = "부산진구";
		s1.phone = "01099881916";
		s1.studentYear = 3;
		
		Student s2 = new Student(); //println 호출됨
		s2.name = "김준이";
		s2.addr = "동래구";
		s2.phone = "01012345678";
		s2.studentYear = 2;
		
		s1.studentInfo();
		s2.studentInfo();
		
		
		
		
	/*	System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println(s1); //a10_클래스.Student@4517d9a3  숫자는 메모리의 주소(heap 영역을 빌려 생성함) */
	}

}
