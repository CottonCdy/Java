package study03;

public class Practice11 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			// 문자열을 int형으로 변환
			int number = Integer.parseInt(args[i]);
			sum += number;
		}

		System.out.println("평균 : " + sum / args.length);

	}

}