package study03;

public class Practice2 {

	public static void main(String[] args) {
		// 2차원 배열 n에 값 할당
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

		// forEach문 사용
		// ex) int n[] = {1, 2, 3};
		// forEach(int a : n) -> n의 길이만큼 반복
		// 반복1 : n의 0번째 값 -> a=1
		// 반복2 : n의 1번째 값 -> a=2
		// 반복3 : n의 2번째 값 -> a=3
		for (int arr[] : n) { // arr[] 변수에 n[0][], n[1][], n[2][]... 저장
			for (int value : arr) // value 변수에 arr[0], arr[1], arr[2]... 저장
				System.out.print(value + " ");

			System.out.println();
		}
	}

}
