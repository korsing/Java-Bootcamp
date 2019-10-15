
class Com14 {
	
	static String company;
	static String dept;
	static String info;
		   String part;
	
	static { // Static 초기화 변수 
		// Static이니 어차피 호출될 때 메모리에 로드될텐데, 조건문, 반복문을 사용할 수도 있다.
		// 문제는, 맨 처음 초기화를 하기 위한 코드라서, 메인 함수에서 company, dept 넣어줘도 info는 바뀌지 않는다.
		info = company + " " + dept; 
		
		// part = "A Part"; // Static이 아닌 변수는 이 블럭 안에 넣을 수 없음.
		
	}
	static int Sum (int x, int y) { return x+y; }
}

public class Cla14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com14.company = "SK Hynix";
		System.out.println(Com14.company); // Static Variable 수정 가능한 것 확인
		
		System.out.println(Com14.Sum(10,20));
		
		Com14.company = "SK Hynix";
		Com14.dept = "IM";
		
		System.out.println(Com14.info);
		
	}

}
