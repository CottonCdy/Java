package study03;

public class Practice12 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			try {
				// ���� number ������ ������ ����
				int number = Integer.parseInt(args[i]);
				sum += number;
			} catch (NumberFormatException e) { // ������ �ƴϸ� ���� �߻�
			}
		}

		System.out.println("�հ� : " + sum);
	}
}
