package study04;

public class Practice1 {

	public static void main(String[] args) {
		Tv myTv = new Tv("LG", 2017, 32); // TV��ü ����
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

	// TV���� ��� �޼ҵ�
	public void show() {
		System.out.println(name + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}

}
