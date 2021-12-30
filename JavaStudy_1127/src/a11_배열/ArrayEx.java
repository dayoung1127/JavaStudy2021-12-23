package a11_배열;

public class ArrayEx {

	public static void main(String[] args) {
		int[] num = new int[5];  //num에 배열의 주소값 들어감
		
		int index = 0;
		
	/*	num[0] = 10;  //0번째에 10을 넣기
		num[index] = 20; //변수에 변수 넣을 수 있음
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;  */
		
		for(int i = 0; i <num.length; i++) {
			num[i] = 10 * (i+1);
		}
		
		for(int i = 0; i < num.length; i++) {		// num.length = 5, num 배열의 크기
			System.out.println(num[i]);			
		}
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		
		String[] strArray = {"김준일", "김준이", "김준삼"};
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		
		
	}

}
