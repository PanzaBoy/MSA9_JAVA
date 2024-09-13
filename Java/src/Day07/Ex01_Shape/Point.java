package Day07.Ex01_Shape;

public class Point {
	
	int x, y;

	// alt + shift + S -> Generate Contructor Using Field...
	// 기본생성자
	public Point() {
		this(0, 0);
	}

	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// alt + shift + S -> Generate toString()...
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
	


