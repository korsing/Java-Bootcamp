
class Calc08 {
	static void sum(int[] iArr) {
		int total = 0;
		for (int i = 0; i < iArr.length; i++) {
			total += iArr[i];
		}
		System.out.println("The sum is " + total + ".");
	}
		
}
public class Cla08 {

	public static void main(String[] args) {
//		int[] iArr = {1,2,3};
//		
//		int sum = 0;
//		for (int i = 0; i < iArr.length; i++) {
//			sum += iArr[i];
//		}
//		
//		System.out.println("The sum is " + sum + ".");
		
		int[] iArr1 = {1,2,3};
		int[] iArr2 = {10,20,30,40};
		
		
		Calc08.sum(iArr1); // new �Ⱦ��� Ŭ���� ������ Ŭ������ Static���� �����ؾ���
		Calc08.sum(iArr2);
	}
}
