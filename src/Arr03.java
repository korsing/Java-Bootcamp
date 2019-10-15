
public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] iArr = {{10,20,30}, {40,50,60}};
		
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
