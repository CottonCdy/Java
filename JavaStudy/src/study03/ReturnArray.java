package study03;

public class ReturnArray {

	// ������ �迭�� �����ϴ� �޼ҵ�
	static int[] makeArray() {
		int temp[] = new int[4]; // �迭 ����

		for (int i = 0; i < temp.length; i++)
			temp[i] = i; // �迭�� ���Ҹ� 0, 1, 2, 3���� �ʱ�ȭ

		return temp;
	}

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();

		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}

}
