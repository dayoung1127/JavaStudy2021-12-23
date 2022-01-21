package a21_스태틱;

import lombok.Data;

@Data
public class Apple {
	public static Apple instance = new Apple(); //같은 클래스 안에서는 private 호출가능
	
	private int product_code;
	
	private Apple() {	
	}
	
	public static Apple getInstance() {
		if(instance == null) {
			instance = new Apple(); //생성이 안될수도 있어서 적어줘야 함
		}
		return instance;
	}
	
	public AppleProduct createProduct(String product_name, String version) {
		AppleProduct appleProduct = new AppleProduct(++product_code, product_name, version);
		return appleProduct;
	}
	
	
}
