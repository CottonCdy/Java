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
		int[] combineArray = new int[a.length + b.length]; // 배열 a, b의 길이를 합친 크기로 배열 생성

		for (int i = 0; i < a.length; i++)
			combineArray[i] = a[i];

		// a배열을 다 넣었으므로 배열 a의 길이를 시작값으로 지정
		for (int i = 0; i < b.length; i++) {
			int tmp = a.length + i; // 배열 a길이 + i값을 combineArray 배열의 인덱스로 사용
			combineArray[tmp] = b[i]; // tmp 번째 부터 값 초기화
		}

		return combineArray;
	}

	// 출력 메소드
	public static void print(int[] a) {
		System.out.print("[ ");

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.print("]");
	}
}
