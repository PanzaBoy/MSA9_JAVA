package Day07.Ex04_NestedInterface;

public class K implements I.J {

	@Override
	public void metgodA() {
		System.out.println("중첩 인터페이스 - methodA();");
	}

	@Override
	public void metgodB() {
		System.out.println("중첩 인터페이스 - methodB();");
	}

}
