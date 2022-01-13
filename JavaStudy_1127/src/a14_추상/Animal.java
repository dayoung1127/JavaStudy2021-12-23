package a14_추상;

public abstract class Animal { //추상메소드 있으면 클래스도 추상 클래스로
	public abstract void move(); //오버라이딩 할 것이기 때문에 굳이 내용 쓸 필요x -> 추상메소드(미완성)
	public abstract void jump(); 
}

class Human extends Animal { // 추상 클래스 상속 받을경우 추상메소드 재 정의
	@Override
	public void move() {
	}
	@Override
	public void jump() {
	}
}

class Tiger extends Animal {
	@Override
	public void jump() {
		// TODO Auto-generated method stub
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
	}
}