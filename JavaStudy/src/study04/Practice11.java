package study04;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			String operator = scan.next();

			// operator�� �׸��� �Է��ϸ� ���α׷� ����
			if (operator.equals("�׸�"))
				return;

			switch (operator) {
			case "+":
				// operand�� +�ΰ�� Add Ŭ���� ����
				Add add = new Add();
				add.setValue(number1, number2);
				System.out.println(add.calculate());
				break;
			case "-":
				// operand�� -�ΰ�� Sub Ŭ���� ����
				Sub sub = new Sub();
				sub.setValue(number1, number2);
				System.out.println(sub.calculate());
				break;
			case "*":
				// operand�� *�ΰ�� Mul Ŭ���� ����
				Mul mul = new Mul();
				mul.setValue(number1, number2);
				System.out.println(mul.calculate());
				break;
			case "/":
				// operand�� /�ΰ�� Div Ŭ���� ����
				Div div = new Div();
				div.setValue(number1, number2);
				System.out.println(div.calculate());
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
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

	// ���� �޼ҵ�
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

	// ���� �޼ҵ�
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

	// ���� �޼ҵ�
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

	// ���� �޼ҵ�
	public int calculate() {
		return a / b;
	}
}