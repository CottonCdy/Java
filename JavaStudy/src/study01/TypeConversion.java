package study01;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b + i); // b�� int Ÿ������ �ڵ� ��ȯ
		System.out.println(10 / 4); // ���� �������̹Ƿ� ����� 2
		System.out.println(10.0 / 4); // 4�� 4.0���� �ڵ� ��ȯ
		System.out.println((char) 0x12340041); // char�� ��ȯ�� ��� 0x0041�μ� ���� 'A'
		System.out.println((byte) (b + i)); // b+i�� 217, 16���� 0xE3, �� -29
		System.out.println((int) 2.9 + 1.8);
		System.out.println((int) (2.9 + 1.8));
		System.out.println((byte) (128 + 128));
		System.out.println((byte) (128 + 127));
		System.out.println((int) 2.9 + (int) 1.8);
	}
}