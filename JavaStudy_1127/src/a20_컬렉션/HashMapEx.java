package a20_컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> category = new HashMap<String, String>();
		
		category.put("tumbler", "텀블러");
		category.put("mugcup", "머그컵");
		category.put("plate", "접시");
		category.put("spoon&chopsticks", "수저");
		category.put("pot", "냄비");
		
		String input = "mugcup";
		
		//if input == tumbler -> 텀블러 출력
		if(input.equals("tumbler")) {
			System.out.println("텀블러");
		}else if(input.equals("mugcup")) {
			System.out.println("머그컵");			
		}else if(input.equals("plate")) {
			System.out.println("접시");			
		}else if(input.equals("spoon&chopsticks")) {
			System.out.println("수저");			
		}else if(input.equals("pot")) {
			System.out.println("냄비");			
		}else {
			System.out.println("null");
		}
		
		
		String koStr = category.get(input); // category.get(input) k값을 넣으면 value값 반환
		if(koStr == null) {
			System.out.println("지원하지 않는 값입니다.");
		}else {
			System.out.println(koStr);
		}
		
		PersonalUser personalUser = new PersonalUser();
		personalUser.setUsername("p_junil");
		personalUser.setPassword("1234");
		personalUser.setPersonal_name("김준일");
		
		CompanyUser companyUser = new CompanyUser();
		companyUser.setUsername("c_junil");
		companyUser.setPassword("4321");
		companyUser.setCompany_name("(주)준일회사");
		
		CompanyUser companyUser2 = new CompanyUser();
		companyUser2.setUsername("c_junil");
		companyUser2.setPassword("1234");
		companyUser2.setCompany_name("(주)준이회사");
		
		
		String username = "p_junil";
		String password = "1234";
		
		
		Map<String, User> userMap = new HashMap<String, User>();
		userMap.put(personalUser.getUsername(), personalUser);
		userMap.put(companyUser.getUsername(), companyUser);
		userMap.put(companyUser2.getUsername(), companyUser2);
		
		
		System.out.println(userMap); //k = 컬렉션의 set과동일 -> 동일한 데이터 덮어씌워짐
		
		User user = userMap.get(username);
		if(user != null && user.getPassword().equals(password)) {
			if(user instanceof PersonalUser) {
				System.out.println((PersonalUser)user);
			}else {
				System.out.println((CompanyUser)user);
			}
		}else {
			System.out.println("존재하지 않는 계정이거나 비밀번호가 다릅니다.");
		}
		
		System.out.println(userMap.keySet()); //keySet = key를 Set 객체로 바꿈
		
		Set<String> set = userMap.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		userMap.remove("p_junil");
		
		
		
	}

}
