package a13_다형성2;

import java.util.Scanner;


/*
 * Service는 로직 처리
 */
public class SchoolService {
	private Scanner scanner;
	
	public SchoolService() {
		scanner = new Scanner(System.in);
	}
	
	public Person[] setPersonArray() {
		System.out.print("학생과 선생님 정보를 담을 배열의 크기를 지정해 주세요: ");
		int index = scanner.nextInt();
		scanner.nextLine();
		return new Person[index];	
		//사람 배열의 크기를 지정
	}
	
	public Teacher addTeacher() {
		Teacher teacher = new Teacher();
		System.out.println("[선생님 정보 입력]");
		System.out.print("이름 : ");
		teacher.setName(scanner.nextLine());
		System.out.print("과목 : ");
		teacher.setSubject(scanner.nextLine());
		System.out.print("담임 학년 : ");
		teacher.setClassYear(scanner.nextInt());
		System.out.print("담임 반 : ");
		teacher.setClassGroup(scanner.nextInt());
		scanner.nextLine();
		return teacher;
	}
	
	public Student addStudent() {
		Student student = new Student();
		System.out.println("[학생 정보 입력]");
		System.out.print("이름 : ");
		student.setName(scanner.nextLine());
		System.out.print("학년 : ");
		student.setStudentYear(scanner.nextInt());
		System.out.print("반 : ");
		student.setStudentGroup(scanner.nextInt());
		System.out.print("번호 : ");
		student.setStudentNumber(scanner.nextInt());
		scanner.nextLine();  //int는 엔터 안먹어서 젤 마지막에만 넣어도 됨
		return student;
	}
	
	public void insertPerson(Person[] persons) {
		for(int i = 0; i < persons.length; i++) {
			while(true) {   //1,2가 나올때까지 반복
				System.out.println("[총 " + persons.length + "명 중 " + (i + 1) + "번째 입력]");
				System.out.print("1. 학생 등록하려면 1을, 선생님을 등록하려면 2를 입력해주세요 : ");
				int num = scanner.nextInt();
				scanner.nextLine();
				if(num == 1) {
					persons[i] = addStudent();
					break;
				}else if(num == 2){
					persons[i] = addTeacher();
					break;
				}else {
					System.out.println("잘못된 명령입니다.");
				}				
			}
		}
		System.out.println("모든 정보가 입력되었습니다.");
		
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
		
		
	/*	for(int i = 0; i < persons.length; i++) {
			persons[i].showInfo();
			if(persons[i] instanceof Student) {
				Student student = (Student)persons[i];
				student.study();
			}else if(persons[i] instanceof Teacher) {
				Teacher teacher = (Teacher)persons[i];
				teacher.studyClass();
			}
		} */
		for(Person person : persons) {
			person.showInfo();
			if(person instanceof Student) {
				Student student = (Student)person;
				student.study();
			}else if(person instanceof Teacher) {
				Teacher teacher = (Teacher)person;
				teacher.studyClass();
			}
		} 
	}
	
	

	
	}
	
	
	
	
	
