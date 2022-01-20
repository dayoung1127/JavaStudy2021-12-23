package a20_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* create추가(set 선호) read조회(list 선호) update수정(list 선호) delete삭제(set 선호)
 * create 추가 - list 앞에 추가하면 뒤에 다 밀림 (set 선호)
 * Read 조회 set은 앞에 데이터 다 꺼내야 뒤에거 볼 수 있음 tree일 경우에는 set이 빠를수 있음
 * update 수정 (list 선호)
 * delete 데이터 삭제하면 list는 빈칸 앞으로 다 땡겨옴 (set 선호)
 * http://www.tcpschool.com/java/java_collectionFramework_concept
 */

public class CollectionEx {
	private Collection<String> collection; //컨트롤 누르고 들어가보기
	private ArrayList<String> arrayList;
	private HashSet<String> hashSet;
	private HashMap<String, String> hashMap;
	
}
