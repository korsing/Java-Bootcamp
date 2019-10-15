
public class Quiz02 {

	public static void main(String[] args) {
		// 1 ~ 100 까지를 세로방향으로 출력하세요
		// 단, 4의 배수는 제외
		for (int i = 0; i<100; i++) {
			if ((i+1)%4 != 0) {
				System.out.println(i+1);
			}
		}
	}

}
