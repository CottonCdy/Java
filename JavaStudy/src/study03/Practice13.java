package study03;

public class Practice13 {

	public static void main(String[] args) {
		int tenNumber; // �����ڸ� ����
		int oneNumber; // �����ڸ� ����

		for (int i = 1; i < 100; i++) {
			tenNumber = i / 10;
			oneNumber = i % 10;

			// �����ڸ� ���ڳ� �����ڸ� �����߿� 3, 6, 9�� ���� �ڼ�¦
			if ((oneNumber == 3 || oneNumber == 6 || oneNumber == 9)
					|| ((tenNumber == 3 || tenNumber == 6 || tenNumber == 9))) {
				// �����ڸ� ���ڿ� �����ڸ� ���� �� �� 3, 6, 9�� ���� �ڼ�¦¦
				if ((oneNumber == 3 || oneNumber == 6 || oneNumber == 9)
						&& ((tenNumber == 3 || tenNumber == 6 || tenNumber == 9)))
					System.out.println(i + " �ڼ� ¦¦");
				else
					System.out.println(i + " �ڼ� ¦");
			}
		}
	}
}
