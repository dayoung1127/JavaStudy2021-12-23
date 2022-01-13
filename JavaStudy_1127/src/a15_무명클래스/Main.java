package a15_무명클래스;

/**
 * 
 * 무명, 익명 클래스
 *
 */
class Test extends AnonymousClass {
	@Override
	public void showInfo() {
		System.out.println("test1입니다.");
	}
}

public class Main {

	public static void main(String[] args) {
	//	AnonymousClass anonymousClass = new AnonymousClass(); <- x / 오버라이딩 하지않으면 생성못하기 때문에 아래와같이 함 
		AnonymousClass anonymousClass = new AnonymousClass() { // 중요 //AnonymousClass 클래스를 상속 받은 클래스가 있음 -> 생략함 / 위 test랑 같음 / 딱 한번 생성할 때 
			@Override
			public void showInfo() {
				System.out.println("test1입니다.");
				
			}
		};
		
		AnonymousClass anonymousClass2 = new AnonymousClass() {
			
			@Override
			public void showInfo() {
				System.out.println("test2입니다.");
			}
		};
		
		anonymousClass.showInfo();
		anonymousClass2.showInfo();
		
		Test test1 = new Test(); //<- 재사용 가능, anonymousClass는 이렇게 안됨 오버라이딩 포함 복붙 해야함
		Test test2 = new Test();
		Test test3 = new Test();
		Test test4 = new Test();  
		
		
		
		

	}

}
