package Day09.Ex07_Review.추상클래스;

public class User {
	
	public static void main(String[] args) {
		Computer computer = new DeskTop();
		// Computer computer2 = new LapTop();
		// 추상 클래스는 객체로 생성할 수 없다.
		
		Computer computer2 = new MacBook();
		LapTop laptop = new MacBook();
		MacBook macbook = new MacBook();
		// DeskTop desktop = new MacBook();
		// * MacBook 은 DeskTop 클래스와 부모/자식 관계가 아니기 때문에 업캐스팅 불가
		
		computer.on();
		computer.display();
		computer.tying();
		computer.off();
		System.out.println();

		computer2.on();
		computer2.display();
		computer2.tying();
		computer2.off();
		System.out.println();
		
		laptop.on();
		laptop.display();
		laptop.tying();
		laptop.off();
		System.out.println();
		
		macbook.on();
		macbook.display();
		macbook.tying();
		macbook.off();
		System.out.println();
		
		
	}

}
