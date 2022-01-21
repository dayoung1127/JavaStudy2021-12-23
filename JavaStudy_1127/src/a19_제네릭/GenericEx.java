package a19_제네릭;

public class GenericEx {
	
	public Message<? extends User> sendMessage(int select){ //?(와일드카드)가 아니면 return 유형 여러가지 못함
		if(select == 1) {
			PersonalUser personalUser = new PersonalUser("hwang dayoung");
		//	Message<PersonalUser> message = new Message<PersonalUser>(10, personalUser);
		//  return message;	
			return new Message<PersonalUser>(10, personalUser);
		}else if(select == 2) {
			CompanyUser companyUser = new CompanyUser("korea it");
			return new Message<CompanyUser>(20, companyUser);
		}else {
			User user = new User("aaaa", "1234");
			return new Message<User>(0, user);
		}
	}

	public static void main(String[] args) {
	/*	Message<String> strMessage = new Message<String>();
		strMessage.setCode(10);
		strMessage.setData("오류메세지입니다.");
		
		System.out.println(strMessage);
	*/	
		User user = new User();
		user.setUsername("dayoung");
		user.setPassword("1234"); 
		
	//	Message<User> userMessage = new Message<User>();
	//	userMessage.setCode(20);
	//	userMessage.setData(user);
		Message<?> userMessage = new Message<User>(20, user); //? <- new에 생성된걸 물음표에 대입 ?는 유저가됨
		
		System.out.println("userMessage: " + userMessage);
		
	}

}
