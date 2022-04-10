package study04;

class Sample {
	public int a;
	private int b;
	int c; // 디폴트 접근 지정
}

public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
//		sample.b = 10;	// private 멤버이므로 접근 불가
		sample.c = 10;

	}

}
