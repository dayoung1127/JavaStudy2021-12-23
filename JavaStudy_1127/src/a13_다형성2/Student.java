package a13_다형성2;

/*
 * 학생
 * studentYear   학년
 * studentGroup  반
 * studentNumber 번호
 */

public class Student extends Person{
	private int studentYear;
	private int studentGroup;
	private int studentNumber;
	
	public void study() {
		System.out.println(super.getName() + "학생이 공부를 합니다.");
		// 000학생이 공부를 합니다.
	}
	

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getStudentGroup() {
		return studentGroup;
	}

	public void setStudentGroup(int studentGroup) {
		this.studentGroup = studentGroup;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public void showInfo() {
		System.out.println("이름 : " + super.getName());
		System.out.println("학년 : " + studentYear);
		System.out.println("반 : " + studentGroup);
		System.out.println("번호 : " + studentNumber);
	}
	
	
	//사람의 showInfo 메소드 오버라이딩 후 학생정보 출력
	
	
	
}
