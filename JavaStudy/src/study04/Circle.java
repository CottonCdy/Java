package study04;

public class Circle {

	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드

	public Circle() // 생성자
	{
		radius = 1; // 필드 초기화
		name = ""; // 필드 초기화
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; // 매개 변수로 필드 초기화
		name = n; // 매개 변수로 필드 초기화
	}

	public double getArea() { // 원의 면적 계산 메소드
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자"); // 객체 생성, 반지름을 10으로, 이름을 "자바피자"로 초기화

		double area = pizza.getArea(); // 피자의 면적 알아내기;
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle(); // Circle 객체 생성
		donut.name = "도넛피자"; // 도넛의 이름 설정
		area = donut.getArea(); // 도넛의 면적 알아내기;
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
