
public class For02_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1;
		for (i = 1; i<10; i++) {
			System.out.println(i + "DAN");
			for (j = 1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}

}
