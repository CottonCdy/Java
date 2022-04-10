package study04;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("두 정수와 연산자를 입력하시오 >> ");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			String operator = scan.next();

			// operator에 그만을 입력하면 프로그램 종료
			if (operator.equals("그만"))
				return;

			switch (operator) {
			case "+":
				// operand가 +인경우 Add 클래스 생성
				Add add = new Add();
				add.setValue(number1, number2);
				System.out.println(add.calculate());
				break;
			case "-":
				// operand가 -인경우 Sub 클래스 생성
				Sub sub = new Sub();
				sub.setValue(number1, number2);
				System.out.println(sub.calculate());
				break;
			case "*":
				// operand가 *인경우 Mul 클래스 생성
				Mul mul = new Mul();
				mul.setValue(number1, number2);
				System.out.println(mul.calculate());
				break;
			case "/":
				// operand가 /인경우 Div 클래스 생성
				Div div = new Div();
				div.setValue(number1, number2);
				System.out.println(div.calculate());
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
}

class Add {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 연산 메소드
	public int calculate() {
		return a + b;
	}
}

class Sub {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 연산 메소드
	public int calculate() {
		return a - b;
	}
}

class Mul {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 연산 메소드
	public int calculate() {
		return a * b;
	}
}

class Div {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 연산 메소드
	public int calculate() {
		return a / b;
	}
}