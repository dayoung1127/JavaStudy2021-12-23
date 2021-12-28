package a10_클래스;

/**
 * 
 * 접근 지정자
 * default 동일 패키지 내에서만
 * public 접근제한없음
 * private 동일 클래스 내에서만
 * protected 동일 패키지와 상속받은 클래스 내부
 * 
 */

public class Car {
	private String carNumber; //public 없을시 클래스2 carTest에서 접근불가함(default)
	private String model;
	private int serialNumber;
	
	public Car() {  //		Car c4 = new Car(); 실행됨 , 생성자와 메소트 통해서만 접근 가능
		System.out.println(carNumber);
		System.out.println(model);
	}
												//기본생성자는 생략됨 , 동일한 변수명일경우 매개변수가 우선순위 높음
	public Car(String carNumber, String model) { //오버로드 할 경우 기본생성자 비활성화 되기 때문에 윗줄처럼 적어줘야함
		System.out.println(this);
		this.carNumber = carNumber; // 매개변수 값을 클래스 내 변수 안에 넣는 것
		System.out.println(carNumber); 
		System.out.println(model);
	}
	
	
	
	
	
	
	
/*	public void setCarNumber(String carNumber) { //외부 값을 집안에 집어넣음
		this.carNumber = carNumber;
	}
	
	public String getCarNumber() {
		return carNumber; //내부 값을 외부로 보냄 , 매개변수 없으므로 this. 안붙여도 됨
	} */
	
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public int getSerialNumber2() {
		return serialNumber - 20210000;
	}
	
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber + 20210000; //그냥 c1.serialNumber=10; 하면 20210000이 적용안되기 때문에 
													// 변수선언은 항상 private 로 하고 get set 으로 불러오기로 약속함
	}
	public void carInfo() {
		System.out.println("차량번호는 " + carNumber + "이고 모델은 " + model + "입니다.");
	}

}
