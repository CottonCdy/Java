package study03;

public class Practice10 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		// 2차원배열의 인덱스를 랜덤하게 받기 위해 x, y 선언
		// 정수를 10개만 생성하기 위한 cnt변수 선언
		int x = 0, y = 0, cnt = 0;

		while (cnt < 10) {
			// 2차원 배열의 랜덤한 위치 값 받기
			x = (int) (Math.random() * 4);
			y = (int) (Math.random() * 4);

			// 해당 위치에 index값이 0이면 1~10사이의 랜덤한 숫자 저장
			if (array[x][y] == 0) {
				array[x][y] = (int) (Math.random() * 10 + 1);
				cnt++; // 10번 반복 후 반복문 탈출
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
