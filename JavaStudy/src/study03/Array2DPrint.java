package study03;

public class Array2DPrint {

	public static void main(String[] args) {
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

		for (int arr[] : n) {
			for (int value : arr)
				System.out.print(value + " ");

			System.out.println();
		}
	}

}
