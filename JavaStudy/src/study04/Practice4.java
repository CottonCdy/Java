package study04;

public class Practice4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show(); // ��ü r�� �簢�� ���� ���
		System.out.println("s�� ������ " + s.square()); // ��ü s�� �簢�� ���� ���

		// ��ü t �簢�� �ȿ� ��ü r �簢���� �ȿ� ������ ���
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");

		// ��ü t �簢�� �ȿ� ��ü s �簢���� �ȿ� ������ ���
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
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

	// �簢�� ���� �����ϴ� �޼ҵ�
	public int square() {
		return width * height;
	}

	// �簢���� ������ ����ϴ� �޼ҵ�
	public void show() {
		System.out.println("(" + x + ", " + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}

	// �Ű������� ���� ��ü�� �簢���� ���� ��ü�� �簢�� �ȿ� �ִ��� Ȯ���ϴ� �޼ҵ�
	public boolean contains(Rectangle r) {
		// �Ű����� r�� �簢�� ũ�Ⱑ ���� �簢�� �ȿ� ������ Ȯ���ϴ� ���ǹ�
		if ((this.x < r.x) && (this.y < r.y) && (this.x + this.width) > (r.x + r.width)
				&& (this.y + this.height) > (r.y + r.height))
			return true;
		else
			return false;

	}
}