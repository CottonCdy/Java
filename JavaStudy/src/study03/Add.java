package study03;

public class Add {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			try {
				int number = Integer.parseInt(args[i]);
				sum += number;
			} catch (NumberFormatException e) {
			}
		}

		System.out.println("гу╟Х : " + sum);

	}

}
