package a08_반복;

public class ContinueBreak {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {   //짝수
				continue;	   // 짝수일경우 println 실행 없이 다음 반복으로 넘어감
			}
			if(i == 81) {
				break;		   // i가 81일 경우 for문 중지
			}
			System.out.println(i);
		}
		
		
	}

}
