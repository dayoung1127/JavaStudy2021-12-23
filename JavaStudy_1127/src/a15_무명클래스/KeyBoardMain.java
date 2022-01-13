package a15_무명클래스;

public class KeyBoardMain {

	public static void main(String[] args) {
		KeyBoard keyUp = new KeyBoard() {   //추상클래스라서 그냥 생성 안됨 {} 넣어서 오버라이딩 해야함
			@Override
			public void keyUp() {
				System.out.println("위쪽 버튼을 눌렀습니다.");
			}
		};
		
		KeyBoard keyDown = new KeyBoard() { // 추상메소드가 아님 -> 원하는 것만 재정의 가능 
			@Override
			public void keyDown() {
				System.out.println("아래쪽 버튼을 눌렀습니다.");
			}
		};
		
		keyUp.keyUp();
		keyDown.keyDown();
		
		
		
		
		
		
	}

}
