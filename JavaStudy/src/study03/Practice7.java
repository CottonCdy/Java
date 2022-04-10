package study03;

public class Practice7 {

	public static void main(String[] args) {
		int numberArray[] = new int[10];
		double sum = 0;

		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < numberArray.length; i++) {
			// Math클래스의 random메소드를 활용해 랜덤값 저장
			// (0 ~ 1 사이의 double 값) * 10 + 1
			numberArray[i] = (int) (Math.random() * 10 + 1);
			sum += numberArray[i];
			System.out.print(numberArray[i] + " ");
		}
		System.out.println();
		System.out.println("평균은 " + sum / numberArray.length);

	}

}
