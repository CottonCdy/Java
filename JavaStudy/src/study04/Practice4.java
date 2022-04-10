package study04;

public class Practice4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show(); // 객체 r의 사각형 정보 출력
		System.out.println("s의 면적은 " + s.square()); // 객체 s의 사각형 넓이 출력

		// 객체 t 사각형 안에 객체 r 사각형이 안에 있으면 출력
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");

		// 객체 t 사각형 안에 객체 s 사각형이 안에 있으면 출력
		if (t.contains(s))
			System.out.println("t는 s를 포합합니다.");
	}
}

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// 사각형 넓이 리턴하는 메소드
	public int square() {
		return width * height;
	}

	// 사각형의 정보를 출력하는 메소드
	public void show() {
		System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}

	// 매개변수로 받은 객체의 사각형이 현재 객체의 사각형 안에 있는지 확인하는 메소드
	public boolean contains(Rectangle r) {
		// 매개변수 r의 사각형 크기가 현재 사각형 안에 들어가는지 확인하는 조건문
		if ((this.x < r.x) && (this.y < r.y) && (this.x + this.width) > (r.x + r.width)
				&& (this.y + this.height) > (r.y + r.height))
			return true;
		else
			return false;

	}
}