package a21_스태틱;

public class SingleTon {

	public static void main(String[] args) {
		Apple 본사 = Apple.getInstance();
		Apple 한국지사 = Apple.getInstance();
		
		AppleProduct iphone12 = 본사.createProduct("아이폰", "12");
		AppleProduct iphone13 = 한국지사.createProduct("아이폰", "13");
		AppleProduct ipad_pro = 한국지사.createProduct("아이패드", "pro");
		
		System.out.println(iphone12);
		System.out.println(iphone13);
		System.out.println(ipad_pro);
		
		본사.setProduct_code(100);
		한국지사.setProduct_code(200);
		
		System.out.println(본사.getProduct_code());
		
		
		/*
		 * mariadb
		 * ip주소(ex:아파트명), port는 상세주소(동), db명(도서관이름)
		 * https://offbyone.tistory.com/199
		 * primary key값으로 조회하면 하나의 값만 나옴
		 * username하나만 ㅍ라이머리키로 했을경우 아이디 노출됨 노출하지않기 위해서 유니크 / 코드가 프라이머리로 씀
		 */
	}

}
