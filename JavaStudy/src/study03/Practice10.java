package study03;

public class Practice10 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		// 2�����迭�� �ε����� �����ϰ� �ޱ� ���� x, y ����
		// ������ 10���� �����ϱ� ���� cnt���� ����
		int x = 0, y = 0, cnt = 0;

		while (cnt < 10) {
			// 2���� �迭�� ������ ��ġ �� �ޱ�
			x = (int) (Math.random() * 4);
			y = (int) (Math.random() * 4);

			// �ش� ��ġ�� index���� 0�̸� 1~10������ ������ ���� ����
			if (array[x][y] == 0) {
				array[x][y] = (int) (Math.random() * 10 + 1);
				cnt++; // 10�� �ݺ� �� �ݺ��� Ż��
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}

	}

}
