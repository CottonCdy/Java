package study03;

public class Practice2 {

	public static void main(String[] args) {
		// 2���� �迭 n�� �� �Ҵ�
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

		// forEach�� ���
		// ex) int n[] = {1, 2, 3};
		// forEach(int a : n) -> n�� ���̸�ŭ �ݺ�
		// �ݺ�1 : n�� 0��° �� -> a=1
		// �ݺ�2 : n�� 1��° �� -> a=2
		// �ݺ�3 : n�� 2��° �� -> a=3
		for (int arr[] : n) { // arr[] ������ n[0][], n[1][], n[2][]... ����
			for (int value : arr) // value ������ arr[0], arr[1], arr[2]... ����
				System.out.print(value + " ");

			System.out.println();
		}
	}

}
