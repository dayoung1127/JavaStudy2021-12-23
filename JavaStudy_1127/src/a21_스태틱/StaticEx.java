package a21_스태틱;

public class StaticEx {

	public static void main(String[] args) {
		Student.name = "황다영"; //객체 생성 없이 데이터 입력 가능
		Student.phone = "010-7207-3926";
		Student.studentInfo();
		System.out.println(); //out은 변수(시스템 클래스 안에 객체를 갖고 있음)
	}

}
//static은 모두가 다 같이 쓸 수 있음
//클래스 생성될 때 스택 영역에 static 공간은 별도로 존재 -> 여러 복사 클래스에 동일한 값 들어감 -> 위치 확인 위해 
//Student.name <- 스튜던트 찍어줌 / 메소드도 마찬가지

/*
 * 싱글톤패턴
 * Class LG {
 * 	private LG(){ <- 퍼블릭이 아닌 프라이빗 생성자 ->> 외부에서 LG lg = new LG(); 생성 안됨
 * 
 */
