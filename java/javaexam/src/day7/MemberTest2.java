package day7;

class Book {
	String title;
	String author;
	int price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Book() {
		this("�ڹ��� ����", "���ü�", 30000);
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	String getBookInfo() {
		return title + "\t" + author + "\t" + price;
	}
}

public class MemberTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		Book book2 = new Book("Do it! ���� �� ���̽�", "������", 18800);
		Book book3 = new Book("�˰��� ���� �ذ� ����", "������", 45000);
		Book book4 = new Book("����� ���� �˰��� with ���̽� ", "Srini Devadas", 18000);
		Book book5 = new Book("�ڹٷ� ���� �ٽ� �ڷᱸ���� �˰���", "�ٷ� B. �ٿ��", 144000);

		System.out.println(book1.getBookInfo());
		System.out.println(book2.getBookInfo());
		System.out.println(book3.getBookInfo());
		System.out.println(book4.getBookInfo());
		System.out.println(book5.getBookInfo());

	}

}
