package a20_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();  //hashset을 set으로 업캐스팅해서 생성함
		List<Set<String>> list = new ArrayList<Set<String>>();
		
		set.add("황");
		set.add("다");
		set.add("영");
		set.add("영"); //중복안돼서 "영" 안뜸(덮어씀)
		
		System.out.println(set); //순서가 없어서 지맘대로 들어감 [영, 다, 황]
		System.out.println(set.size()); //중복허용x
		
		
		Iterator<String> iterator = set.iterator(); // 결과의 객체가 iterator / 줄을세움 / set 쓸 때는 항상 iterator 사용
		
		while(iterator.hasNext()) {
			String str = iterator.next(); //글자 하나하나씩 꺼내는 변수 str이 필요
			
			if(str.equals("영")) {
				System.out.println(str);
			}
		//	System.out.println(iterator.next()); //.next -> 첫번째껄 찍고 조건이 true면 다음 값을 출력
			//그럼 첫번째 데이터는? -> 실행될때 시작하는 부분이 BOF(Begin of file)  마지막 데이터 다음은
			//없으므로 EOF(끝) 앞에서 종료
		}
		
		set.remove("영");
		System.out.println(set);
		
	}

}
