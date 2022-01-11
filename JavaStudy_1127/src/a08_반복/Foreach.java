package a08_반복;

public class Foreach {

	public static void main(String[] args) {
		String[] strArray = {"김준일", "김준이", "김준삼", "김준사"};
		int[] numArray = {1,2,3,4,5,6,7,8,9};
		
		//일반 for문 - 반복 시작과 끝 지정가능
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		
		//for each문 - 처음부터 끝까지 반복
		
		int i = 0;
		for(String str : strArray) {
			if(i == 3) {
				break;
			}
			System.out.println(str);
			i++;
		}
		
		for(int num : numArray) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
