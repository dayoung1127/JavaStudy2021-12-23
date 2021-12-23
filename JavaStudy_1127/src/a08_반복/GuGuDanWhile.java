package a08_반복;

public class GuGuDanWhile {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 출력
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 9 = 18
		 */
		int num = 1;
		
		while(num < 10) {
			System.out.println("2 x " + num + " = " + (2*num));
			num++;
		}

	}

}
