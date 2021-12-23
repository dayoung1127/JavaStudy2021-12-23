package a09_메소드;
//함수 : 특정기능을 정의한 코드들의 집합 (입력값 PARAMETER 매개변수/출력값 RETURN 반환값/처리문)
//메소드 : 함수 종류 중 클래스 내부에 정의되어 있는 함수
//boolean ddd(String name) {
// return true;
//...
// }
//boolean : 리턴 타입, ddd : 메소드이름(소문자로 시작), string name : 파라미터,매개변수(변수를 선언함), 여러개 가능
// return true; : 반환 값(변수or상수), 리턴 타입과 자료형 일치해야함

public class MethodEx {
	// 매개변수 x, 반환값x
	public static void printInfo() { //매개변수 없어서 아래로 실행만함
		System.out.println("김");
		System.out.println("준");
		System.out.println("일");
		
	}
	// 매개변수 o, 반환값 x
	public static void printName(String name) {
		System.out.println("이름: " + name);
	}
	
	// 매개변수x, 반환값 o
	public static String getName() {
		String name = "김준일";
		return name;
	}
	
	// 매개변수o, 반환값o
	public static String transferName(String name) {
		String tName = name + "님";
		return tName;
	}
	
	public static String transferName2(String name, int number) {
		return number + "번 고객: " + name;  // [number + "번 고객: " + name] 이 하나의 문자열
	}
	
	public static void main(String[] args) { //void(공허한) : 반환할게 없음, main : 메소드이름, String[] args: 매개변수
		printInfo();  //메소드 호출, 실행
		
		System.out.println("프로그램 종료");
		
		String name = "김준일";
		printName(name);
		
		String name2 = getName();
		System.out.println(name2);
		System.out.println(getName());  //getName()자체가 값
		
		String name3 = transferName("김준일");
		System.out.println(name3);
		System.out.println(transferName("김준일"));
		
		System.out.println(transferName2("김준일",1));
		
		
		
	}

}
