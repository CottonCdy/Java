package study03;

public class Practice1_3 {

	public static void main(String[] args) {
		int sum = 0, i = 0;

		do {
			sum += i; // sum = sum + i
			i += 2; // i 값을 2씩 증가
		} while (i < 100); // i가 100 이상이면 반복문 탈출

		System.out.println(sum);

	}

}
