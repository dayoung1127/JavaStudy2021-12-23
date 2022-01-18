package a17_기본클래스;
//lombok 다운 -> 폴더명 다 영문으로 변경 -> 프로젝트 우클릭 configure 맨 밑 -> jar 파일 이클립스 폴더에 넣고 shift 누르기
//이클립스exe 있는 폴더로 경로 설정 후 실행 안될경우 프로젝트 우클릭  maven -> update
//https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.22
public class UserTest {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("dayoung");
		user.setPassword("1234");
		
		User dbUser = new User();
		dbUser.setUsername("dayoung");
		dbUser.setPassword("1234");
		
		System.out.println(user.equals(dbUser)); //주소값은 달라도 리터럴 값 해쉬코드가 생성됨 -> 같음
		
	}

}
