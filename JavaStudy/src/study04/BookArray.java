package study04;

import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book book[] = new Book[2];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < book.length; i++) {
			System.out.print("力格>>");
			String title = scan.nextLine();
			System.out.print("历磊>>");
			String author = scan.nextLine();
			book[i] = new Book(title, author); // 硅凯 盔家 按眉 积己
		}

		for (Book arr : book)
			System.out.print("(" + arr.title + ", " + arr.author + ")");

		scan.close();
	}

}
