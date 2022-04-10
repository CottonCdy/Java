package study03;

public class Practice13 {

	public static void main(String[] args) {
		int tenNumber; // 십의자리 숫자
		int oneNumber; // 일의자리 숫자

		for (int i = 1; i < 100; i++) {
			tenNumber = i / 10;
			oneNumber = i % 10;

			// 십의자리 숫자나 일의자리 숫자중에 3, 6, 9가 들어가면 박수짝
			if ((oneNumber == 3 || oneNumber == 6 || oneNumber == 9)
					|| ((tenNumber == 3 || tenNumber == 6 || tenNumber == 9))) {
				// 십의자리 숫자와 일의자리 숫자 둘 다 3, 6, 9가 들어가면 박수짝짝
				if ((oneNumber == 3 || oneNumber == 6 || oneNumber == 9)
						&& ((tenNumber == 3 || tenNumber == 6 || tenNumber == 9)))
					System.out.println(i + " 박수 짝짝");
				else
					System.out.println(i + " 박수 짝");
			}
		}
	}
}
