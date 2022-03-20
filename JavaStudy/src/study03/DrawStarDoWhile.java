package study03;

public class DrawStarDoWhile {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		do {
			j = i;

			do {
				System.out.print("*");
				j++;
			} while (j < 5);

			System.out.println();
			i++;
		} while (i < 5);

	}

}
