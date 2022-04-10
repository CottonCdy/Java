package study03;

public class Practice9 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// Math클래스의 random메소드를 활용해 랜덤값 저장
				// (0 ~ 1 사이의 double 값) * 10 + 1
				array[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}
	}
}
