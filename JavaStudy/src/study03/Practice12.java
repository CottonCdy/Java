package study03;

public class Practice12 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			try {
				// 정수 number 변수에 정수값 저장
				int number = Integer.parseInt(args[i]);
				sum += number;
			} catch (NumberFormatException e) { // 정수가 아니면 예외 발생
			}
		}

		System.out.println("합계 : " + sum);
	}
}
