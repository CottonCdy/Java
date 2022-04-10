package study04;

public class Practice1 {

	public static void main(String[] args) {
		Tv myTv = new Tv("LG", 2017, 32); // TV객체 생성
		myTv.show();
	}
}

class Tv {
	private String name;
	private int year;
	private int inch;

	public Tv(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}

	// TV정보 출력 메소드
	public void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}

}
