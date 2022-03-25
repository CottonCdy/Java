package study03;

public class ThreeSixNine {

	public static void main(String[] args) {
		int tenNumber;
		int oneNumber;

		for (int i = 1; i < 100; i++) {
			tenNumber = i / 10;
			oneNumber = i % 10;

			if ((oneNumber == 3 || oneNumber == 6 || oneNumber == 9)
					|| ((tenNumber == 3 || tenNumber == 6 || tenNumber == 9))) {
				if ((oneNumber == 3 || oneNumber == 6 || oneNumber == 9)
						&& ((tenNumber == 3 || tenNumber == 6 || tenNumber == 9)))
					System.out.println(i + " ¹Ú¼ö Â¦Â¦");
				else
					System.out.println(i + " ¹Ú¼ö Â¦");
			}
		}

	}

}
