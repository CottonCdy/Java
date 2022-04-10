package study03;

public class Practice1_1 {

	public static void main(String[] args) {
		int sum = 0, i = 0;

		while (i < 100) {
			sum += i; // sum = sum + i
			i += 2; // 반복할 때마다 i값을 2씩 증가
		}
		System.out.println(sum);
	}
}
