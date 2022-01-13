package a14_추상;

public class Main {

	public static void main(String[] args) {
	//	Animal animal = new Animal(); <- 추상클래스라서 생성 못함
		Human h = new Human();
		Animal a = new Human(); //업캐스팅은 가능
		
		Animal[] animals = new Animal[10];
		animals[0] = new Human();
		animals[1] = new Tiger();
		
	}

}
