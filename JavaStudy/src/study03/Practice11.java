package study03;

public class Practice11 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			// ���ڿ��� int������ ��ȯ
			int number = Integer.parseInt(args[i]);
			sum += number;
		}

		System.out.println("��� : " + sum / args.length);

	}

}