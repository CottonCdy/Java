package study04;

class Sample {
	public int a;
	private int b;
	int c; // ����Ʈ ���� ����
}

public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
//		sample.b = 10;	// private ����̹Ƿ� ���� �Ұ�
		sample.c = 10;

	}

}
