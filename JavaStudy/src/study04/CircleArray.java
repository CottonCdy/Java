package study04;

public class CircleArray {

	public static void main(String[] args) {
		CircleEx c[]; // Circle �迭�� ���� ���۷��� c ����
		c = new CircleEx[5]; // 5���� ���۷��� �迭 ����

		for (int i = 0; i < c.length; i++) // �迭�� ���� ��ŭ
			c[i] = new CircleEx(i); // i��° ���� ��ü ����

		for (int i = 0; i < c.length; i++)
			System.out.print((int) (c[i].getArea()) + " ");
	}

}
