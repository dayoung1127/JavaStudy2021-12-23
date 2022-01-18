package a17_기본클래스;

public class Name {

	public static void main(String[] args) {
		ObjectEx objectEx = new ObjectEx();
		ObjectEx objectEx2 = new ObjectEx();
		ObjectEx objectEx3 = objectEx; 
		
		objectEx.setUsername("다용");
		objectEx.setPassword("1234");
		objectEx2.setUsername("다용");
		objectEx2.setPassword("1234");
		
		
		System.out.println(objectEx.toString());
		System.out.println(objectEx); //toString() 생략가능
		//  return getClass().getName() + "@" + Integer.toHexString(hashCode()); 해쉬코드는 10진수 hexstring에 넣으면 16진수로 변환됨
		System.out.println(objectEx == objectEx2); //주소값이 다르기 때문에 false나옴
		System.out.println(objectEx.equals(objectEx2)); //hashcode자동 입력했을때랑 equal 직접 입력했을 때랑 비교
		System.out.println(objectEx.equals(objectEx2));
		
		

	}

}
