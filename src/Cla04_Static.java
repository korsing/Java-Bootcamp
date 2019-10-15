
class Calc04 {
	// 계산기 비스므리한 것
	void sum (int i, int j) { 
		System.out.println( i+j ); 
		// return; Void형이라고 리턴 값이 없는 것은 아니다.
	}
	static void sub (int i, int j) { // 함수에 static을 붙였음 -> 
		System.out.println( i-j ); 
	}
}

public class Cla04_Static {
	
	// 계산기 비스므리한 것
	void mul (int i, int j) { 
		System.out.println( i*j ); 
		// return; Void형이라고 리턴 값이 없는 것은 아니다.
	}
	static void div (int i, int j) { // 함수에 static을 붙였음
		System.out.println( i/j ); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		
		Calc04 c1 = new Calc04(); 
		
		c1.sum(a, b);
		Calc04.sub(a, b);
		
		Cla04_Static c2 = new Cla04_Static(); // 일반적인 객체는 필요할 때마다 붕어빵을 새로 찍어냄
		c2.mul(a, b);           // Static 객체는 위에 하나 박아두고, 끌어와서 사용
		c2.div(a, b);
	}

}
