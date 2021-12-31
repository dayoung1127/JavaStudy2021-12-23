package a13_다형성2;

import java.util.Scanner;

import a10_클래스2.User;

/*
 * Service는 로직 처리
 */
public class SchoolService {
	private Scanner scanner;
	
	public SchoolService() {
		scanner = new Scanner(System.in);
	}
	
	
	public Person[] setPersonArray() {
		System.out.print("몇명의 사람을 입력하시겠습니까? ");
		int index = scanner.nextInt();
		scanner.nextLine();
		return new Person[index];	
		//사람 배열의 크기를 지정
	}
	
	public Teacher addTeacher() {
		Teacher teacher = new Teacher();
		teacher.setName(scanner.nextLine());
		return teacher;
	}
	
	public Student addStudent() {
		Student student = new Student();
		student.setName(scanner.nextLine());
		return student;
	}
	
	public void insertPerson(Person[] persons) {
		int i = scanner.nextInt();
		if(i == 1) {
			
		}
		/*
		 * 1. 학생 등록
		 * 2. 선생님 등록
		 * if 1 이면 학생 등록
		 * if 2면 선생님 등록
		 */
	}
	
	public void showInfoPerson(Person[] persons) {
		/*
		 * instanceof
		 */
	}
	
	
	
	
	
	
}
