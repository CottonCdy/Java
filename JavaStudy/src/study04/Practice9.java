package study04;

public class Practice9 {
	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int[] combineArray = new int[a.length + b.length]; // �迭 a, b�� ���̸� ��ģ ũ��� �迭 ����

		for (int i = 0; i < a.length; i++)
			combineArray[i] = a[i];

		// a�迭�� �� �־����Ƿ� �迭 a�� ���̸� ���۰����� ����
		for (int i = 0; i < b.length; i++) {
			int tmp = a.length + i; // �迭 a���� + i���� combineArray �迭�� �ε����� ���
			combineArray[tmp] = b[i]; // tmp ��° ���� �� �ʱ�ȭ
		}

		return combineArray;
	}

	// ��� �޼ҵ�
	public static void print(int[] a) {
		System.out.print("[ ");

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.print("]");
	}
}
