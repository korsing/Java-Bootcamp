

class Book05{
	String title = "No Title";
	String author = "No Author";
	int    price = 0;
	
	Book05() { System.out.println(title + " " + author + " " + price); }
	Book05(String t) { 
		title = t;
		System.out.println(title + " " + author + " " + price);
	}
	Book05(String t, String a) { 
		title = t;
		author = a;
		System.out.println(title + " " + author + " " + price);
	}
	Book05(String t, String a, int p) { // �������� ������
		title = t;
		author = a;
		price = p;
		System.out.println(title + " " + author + " " + price);
	}

}
public class Cla05_Constructor {

	static void sum (int i, int j) { System.out.println(i+j); }
	static void sum (int i, int j, int k) { System.out.println(i+j+k); }
	static void sum (String i, String j) { System.out.println(i+j); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book05 b1 = new Book05(); // Class ���ο� �ƹ� �͵� ���� ������ ������ �Ǵ� ������ ������ ������ ����
		sum(10,20);
		sum(10,20,30);
		sum("SK", " Hynix");
	}

}
