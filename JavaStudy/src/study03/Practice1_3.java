package study03;

public class Practice1_3 {

	public static void main(String[] args) {
		int sum = 0, i = 0;

		do {
			sum += i; // sum = sum + i
			i += 2; // i ���� 2�� ����
		} while (i < 100); // i�� 100 �̻��̸� �ݺ��� Ż��

		System.out.println(sum);

	}

}
