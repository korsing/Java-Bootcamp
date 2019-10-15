
public class Op02 {

	public static void main(String[] args) {
		int a = 7, b = 3;
		System.out.println((a==b)&&(a>b++));
		System.out.println(b);
		
		System.out.println((a==b)&(a>b++));
		System.out.println(b);
		
		System.out.println((a!=b)||(a>b++));
		System.out.println(b);
		
		System.out.println((a!=b)|(a>b++));
		System.out.println(b);
	}

}
