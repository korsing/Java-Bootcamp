
class Book01 { // Ŭ���� ���� ���� ���� �ȿ� ���� ����Ǳ� ������, �ߺ����� ����� �� ����. 
	  		   // Book�� �ƴ�, Book01�� �ϴ� ������ �ٷ� �̰�.
	
	String title;
	String author;
	int    price;
	
	void pBook() { System.out.println(title + ", " + author + ", " + price); }
}

public class Cla01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book01 b1 = new Book01();
		b1.title = "JAVA";
		b1.author = "Tom";
		b1.price = 35000;
		
		b1.pBook();
	}
}
