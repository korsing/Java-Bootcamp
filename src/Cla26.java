class Book26 {
	String title = "No Title";
	String author = "No Author";
	int    price = 0;
	
	@Override
	public String toString() {
		return this.title + ", " + this.author + ", " + this.price;
	}
}

public class Cla26 {

	public static void main(String[] args) {
		
		Object o1 = "Education";
		System.out.println (o1.toString());

		Book26 b1 = new Book26();
		System.out.println (b1.toString());

		
	}

}
