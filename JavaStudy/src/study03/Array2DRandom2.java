package study03;

public class Array2DRandom2 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		int x = 0, y = 0, cnt = 0;

		while (cnt < 10) {
			x = (int) (Math.random() * 4);
			y = (int) (Math.random() * 4);

			if (array[x][y] == 0) {
				array[x][y] = (int) (Math.random() * 10 + 1);
				cnt++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}

	}

}
