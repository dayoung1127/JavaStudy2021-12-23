package a12_상속;

/**
 * 
 * 상속(Extends)
 * 부모, 자식 
 * 
 * 자식이 존재하려면 부모가 먼저 존재해야한다.
 * 
 * @는 어노테이션(기능을 대신함)
 * Override 어노테이션: 부모것을 재정의 의미 
 *
 */

/*	public Human() {
super();  // 부모의 생성자 실행, 생략되어 있음
System.out.println("자식 객체 생성.");
super.move(); */


class Human extends Animal {	//animal을 상속받음, 파일명과 클래스명이 같아야 하기 때문에 public 안붙임
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}	

class Tiger extends Animal {	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뛰어다닙니다.");
	}
}	

class Eagle extends Animal {	
	public void flying () {
		System.out.println("독수리가 날개를 펴고 날아다닙니다.");
	}
	
	@Override
	public void move() {
		System.out.println("독수리가 날아다닙니다.");
	}
}	
	


public class ExtendsEx {

	public static void main(String[] args) {
		Animal a = new Animal();
		Human h = new Human();  
		Tiger t = new Tiger();  
		Eagle e = new Eagle();  
		
		a.move();
		h.move();
		h.readBook();
		t.move();
		t.hunting();
		e.move();
		e.flying();
		
		/**
		 * 업캐스팅, 다운캐스팅
		 * 
		 */
		double d = 10;
		int i = (int)10.0;
		
		Animal human = new Human(); //animal로 업캐스팅 됨, 자식이 가진건 쓸수 없음
		Human humanA = (Human)human; 
	//	Tiger tigerA = (Tiger)human; //호랑이로 생성 된 적 없어서 안됨
		
		Animal animal = new Animal();
	//	Human humanA2 = (Human)animal; 		//자식에 대한 메모리주소가 없어서 human으로 형변환 불가능
		
		humanA.readBook();
	//	humanA2.readBook();
		
		
		
		
	/*	h.move();
		System.out.println(h.kind); */
		
		
		
		
		

	}

}
