package a16_인터페이스;

public class ButtonTest {

	public static void main(String[] args) {
		Button[] buttons = new Button[5];
		
	//	자동문버튼 j = new 자동문버튼(); -> 를 하기와같이 줄임
	//	buttons[2] = j;
		
		buttons[0] = new 초인종();
		buttons[1] = new 자동문버튼();
		
		
		for(Button button : buttons) {
			if(button == null) { //배열 중 나머지 3개는 null이라서 들어가야함
				continue;
			}
			button.onClick(); //개수 or 결과는 달라도 버튼을 누르는 동작은 동일함 , 한꺼번에 가능 -> 인터페이스가 동일하기때문에
		}
		
	}

}
