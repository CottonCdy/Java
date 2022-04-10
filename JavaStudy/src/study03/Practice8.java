package study03;

import java.util.Arrays;
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[]; // n���� ������ ���� �迭
		int count = 0; // �������� ���� 10�� ������ ��� ���
		boolean check = true; // �ߺ����� ������ false, ������ true

		System.out.print("���� �? ");
		int inputNumber = scan.nextInt();

		// ������ ������ �Ѿ�� ���α׷� ����
		if (inputNumber > 100 || inputNumber <= 1) {
			System.out.println("1~100 ������ ���ڸ� �Է� �����մϴ�");
			return;
		}

		// �Է¹��� ������ ũ��� �迭 �ʱ�ȭ
		array = new int[inputNumber];

		for (int i = 0; i < array.length; i++) {
			// MathŬ������ random�޼ҵ带 Ȱ���� ������ ����
			// (0 ~ 1 ������ double ��) * 100 + 1
			int rNumber = (int) (Math.random() * 100 + 1);

			// �ߺ��� �˻�
			for (int j = 0; j < array.length; j++) {
				if (array[j] == rNumber) {
					check = false;
					break; // �ߺ����� Ȯ�εǸ� break
				} else {
					check = true; // �ߺ����� ������ check = true
				}
			}

			// �ߺ����� ������ array�� �� ����
			if (check)
				array[i] = rNumber;
			else {
				// �ߺ����� �����Ͽ� ���� �ε����� ���� �ٸ� ������ �ٲٱ� ���� continue
				// ���� ���� �ٲ�� �ϹǷ� ������ i�� �̸� ����
				i--;
				continue;
			}

			System.out.print(array[i] + " ");
			count++;

			// ���� 10�� ��� �Ŀ� �ٹٲ�
			if (count % 10 == 0)
				System.out.println();
		}

		System.out.println("\n=====����=====");

		Arrays.sort(array); // �迭 �������� ����
		count = 0;
		// forEach�� ���
		for (int value : array) {
			System.out.print(value + " ");
			count++;

			if (count % 10 == 0)
				System.out.println();
		}
	}
}
