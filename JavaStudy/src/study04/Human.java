package study04;

public class Human {
	String name;
	int age;
	double height;
	double weight;

	public Human(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Human aHuman = new Human("ȫ�浿");
		aHuman.age = 21;
		aHuman.height = 180.5;
		aHuman.weight = 73.2;
	}
}
