package study03;

public class RandomArray {

	public static void main(String[] args) {
		int numberArray[] = new int[10];
		double sum = 0;

		System.out.print("������ ������ : ");
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (int) (Math.random() * 10 + 1);
			sum += numberArray[i];
			System.out.print(numberArray[i] + " ");
		}
		System.out.println();
		System.out.println("����� " + sum / numberArray.length);

	}

}
