package study03;

public class Practice9 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// MathŬ������ random�޼ҵ带 Ȱ���� ������ ����
				// (0 ~ 1 ������ double ��) * 10 + 1
				array[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}
	}
}
