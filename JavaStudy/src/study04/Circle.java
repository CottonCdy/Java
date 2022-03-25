package study04;

public class Circle {

	int radius; // ���� ������ �ʵ�
	String name; // ���� �̸� �ʵ�

	public Circle() // ������
	{
		radius = 1; // �ʵ� �ʱ�ȭ
		name = ""; // �ʵ� �ʱ�ȭ
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int r, String n) { // �Ű� ������ ���� ������
		radius = r; // �Ű� ������ �ʵ� �ʱ�ȭ
		name = n; // �Ű� ������ �ʵ� �ʱ�ȭ
	}

	public double getArea() { // ���� ���� ��� �޼ҵ�
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "�ڹ�����"); // ��ü ����, �������� 10����, �̸��� "�ڹ�����"�� �ʱ�ȭ

		double area = pizza.getArea(); // ������ ���� �˾Ƴ���;
		System.out.println(pizza.name + "�� ������ " + area);

		Circle donut = new Circle(); // Circle ��ü ����
		donut.name = "��������"; // ������ �̸� ����
		area = donut.getArea(); // ������ ���� �˾Ƴ���;
		System.out.println(donut.name + "�� ������ " + area);
	}

}
