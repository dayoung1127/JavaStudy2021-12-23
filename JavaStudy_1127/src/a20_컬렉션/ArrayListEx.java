package a20_컬렉션;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("안녕"); //0,1,2 index 한번에 조회가능
		arrayList.add("하세");
		arrayList.add("요.");
		
		System.out.println(arrayList);
		System.out.println(arrayList.size()); //collection에선 lenth 안씀
		System.out.println("0인덱스 값 : " + arrayList.get(0));
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(i+ "인덱스 값 : " + arrayList.get(i));
		}
		
		for(String str : arrayList) {
			System.out.println(str);
		}
		
	
		System.out.println(arrayList.remove(1)); //데이터를 지우고 해당데이터를 리턴함
		System.out.println(arrayList); //[안녕, 요.] 삭제 후 자동 정렬됨 (빈공간 없음)
		
		
		String[] array1 = {"안녕","하세","요."};
		array1[1] = null; 
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] == null && (i+1) != array1.length) {
				array1[i] = array1[i+1];
				array1[i+1] = null;					
			}
		}
		int count = 0;
		for(String str : array1) {
			if(str != null) {
				count++;
			}
		}
		String[] array2 = new String[count];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
			System.out.println(array2[i]);
		}
	}

}
