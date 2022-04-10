import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("곱하고자 하는 두 수 입력 >> ");

			int n = scan.nextInt();
			int m = scan.nextInt();
			System.out.print(n + "x" + m + "=" + (n * m));
			System.out.println();

		}
	}

}
