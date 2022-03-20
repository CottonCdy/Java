package study03;

public class DrawStarWhile {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		while (i < 5) {
			j = i;

			while (j < 5) {
				System.out.print("*");
				j++;
			}

			System.out.println();
			i++;
		}

	}

}
