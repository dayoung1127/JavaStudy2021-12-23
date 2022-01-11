package a10_클래스;

public class Main {

	private Service service;
	
	public Main() {
		service = new Service();
	}
	
	public int computer(int price) {
		return price - (int) (price * service.getDiscount());   //* 0.3대신 디스카운트 호출
	}
	
	public int phone(int price) {
		return price - (int) (price * service.getDiscount()); 
	}
	
	
	// null 은 주소값이 0
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.computer(1000000));  //static있으면 computer 바로 못찍음
		System.out.println(m.phone(800000));
		
		
		/*	String name = " ";	   
		String phoneNumber = "";
		
		if(name.equals("") || name.equals(" ")){     //string은 equals씀
			System.out.println("값이 비어있습니다.");
		}
		
		if(phoneNumber.equals("") || phoneNumber.equals(" ")){
			System.out.println("값이 비어있습니다.");
		}
		
	}*/
	}
		
	
	
	
	
	
	
	
	
	
}
