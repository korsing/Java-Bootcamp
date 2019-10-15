class Sing16 {
	private static Sing16 sing = new Sing16();
	private Sing16() {} // 생성자를 블럭할거니까, 우회생성자를 만들어줘야함
	static Sing16 getInstance() { // 이 친구가 우회
		return sing;
	}
}
public class Cla16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 원래 클래스 개념 자체가 지금처럼 같은 종류를 여러 인스턴스에 찍어내는건데 (생성자가 계속 실행되니까 발생 -> 생성자를 Block하면 된다)
        // 만약 단 하나의 인스턴스만 생성이 되도록 하고 싶다면? [Singleton]
//		Sing16 s1 = new Sing16(); 
//		Sing16 s2 = new Sing16(); 
		
		Sing16 s1 = Sing16.getInstance();
		Sing16 s2 = Sing16.getInstance();
		
		System.out.println(s1 == s2);

	}

}
