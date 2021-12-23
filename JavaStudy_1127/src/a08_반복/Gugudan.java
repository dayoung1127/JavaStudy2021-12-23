package a08_반복;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 2x1~9x9
		/*
		 * [2단]
		 * 2x1=2
		 * 2x2=4
		 * 2x3=6
		 * ...
		 * 2x9=18
		 * 
		 * [3단]
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("시작 단수: ");
		int startDan = input.nextInt();
		input.nextLine();
		System.out.print("마지막 단수: ");
		int endDan = input.nextInt();
		input.nextLine();
		
		for(int i = startDan; i < (endDan + 1); i++) {
			System.out.println("[" + i + "단]");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}

}
