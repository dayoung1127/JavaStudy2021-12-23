package a09_메소드;

import java.util.Scanner;

public class Calculator {
	
	public static void add(double num1, double num2) {
		System.out.println("두 수의 합은: " +  (num1 + num2));
	}
	
	public static void sub(double num1, double num2) {
		System.out.println("두 수의 차는: " +  (num1 - num2));
	}
	
	public static void mul(double num1, double num2) {
		System.out.println("두 수의 곱은: " +  (num1 * num2));
	}
	
	public static void div(double num1, double num2) {
		if(num1 == 0 || num2 == 0) {
			System.out.println("0에서 나누거나 0으로 나누는 것은 불가능합니다.");
		}else {
			System.out.println("두 수의 몫은: " +  (num1 / num2));			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 덧셈");   //println 메소드명, "" 내용은 매개변수 
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("계산 방법을 선택해 주세요: ");
			int cmd = sc.nextInt();
			sc.nextLine();
			
			double num1, num2;
			
			System.out.println("두 수를 입력해 주세요.");
			System.out.print("첫번째 수: ");
			num1 = sc.nextDouble();
			//sc.nextLine();   <- 안해도 됨
			System.out.print("두번째 수: ");
			num2 = sc.nextDouble(); 
			sc.nextLine();
			
			if(cmd == 1) {
				add(num1,num2);
			}else if(cmd == 2) {
				sub(num1,num2);
			}else if(cmd == 3) {
				mul(num1,num2);
			}else if(cmd == 4) {
				div(num1,num2);
			}else if(cmd == 0) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 선택입니다.");
			}
		}
		
		
	}

}

/*
 객체지향언어 : 객체(클래스, object)들의 관계성을 사용하여 순차적으로 수행되는 프로그램 내에서 
 객체간 관계를 형성하여 프로그램을 동작하게함
 객체 = 데이터(변수 : 명사)+기능(메소드 : 동사)
 컴퓨터 = 모니터, 키보드 등등 + 화면출력 프로그램 실행 등등
 객체지향언어특징 : 상속, 캡슐화, 추상화, 다형성 (중요)
 1. 상속 : 상위클래스의 모든것을 상속받아 사용하는 것 , 데이터의 관계성, 
 2. 캡슐화 : 데이터 기능을 외부로부터 접근은 차단하고 권한 절차 없이 데이터 변경 또는 기능 수행을 할 수 없게 캡슐처럼 보호함
             데이터의 은닉성
 3. 추상화 : 추상적인 요소들을 묶어서 분류하는 것, 데이터의 구조화 
 4. 다형성 : 객체의 기능이 다양한 형태를 가질 수 있음, 부모클래스로부터 상속받은 데이터를 자식클래스에서 재정의하여 사용할 수 있음
             상속과 깊은 관계를 가진다.
객체지향언어의 장점
 - 재사용성(상속을 통해 재사용 높일 수 있음), 생산성 향상(클래스단위의 부품들을 조립), 유지보수의 우수성(구조화된 소스코드 클래스 단위로 관리할 수 있음)
 단점
 - 객체 세분화하여 설계해야함, 실행속도가 절차지향언어 대비 느리다, 상속으로 인하여 관계가 많이 형성되면 코딩 난이도 높아짐

객체지향언어도 절차지향언어에 속하지만 객체라는 녀석들의 관계가 추가된 것이다. (반대가 아님) */
 
/* Git(버전관리) & Github (git을 저장할 수 있는 클라우드)
 * 검색창에 sourcetree 검색 후 다운로드
 * 소스트리 완전 삭제 방법  : 프로그램 추가 제거 - 소스트리 프로그램 제거 - c드라이브 - 사용자(user)
 * - 계정폴더 - appdata 폴더 - atlassian 폴더 삭제 
 * 윈도우 검색에 자격증명관리자 검색 후 실행 - 윈도우자격증명 - 하단 일반자격증명에서 git 소스트리 관련항목 제거
 * 







