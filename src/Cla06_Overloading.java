
class Book06{
	String title = "No Title";
	String author = "No Author";
	int    price = 0;
	
	Book06() { System.out.println(title + " " + author + " " + price); } // ������ �����ڰ� �ִٸ� �⺻ �����ڵ� ������ִ°� ����.
	Book06(String t, String a, int p) { 
		title = t;
		author = a;
		price = p;
		System.out.println(title + " " + author + " " + price);
	}

}
public class Cla06_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book06 b1 = new Book06();
		Book06 b2 = new Book06("JAVA", "Tom", 45000);
	}

}
