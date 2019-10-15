
class Book01 { // 클래스 명은 같은 폴더 안에 따로 저장되기 때문에, 중복으로 사용할 수 없다. 
	  		   // Book이 아닌, Book01로 하는 이유가 바로 이것.
	
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
