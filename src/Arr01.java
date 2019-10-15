
public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr = new int[3];
		
		iArr[0] = 10; 
		iArr[1] = 10; 
		iArr[2] = 20;
		
		if(iArr[0] == iArr[1]) { System.out.println("Same"); }
		else 				   { System.out.println("Different"); }
		
		
		String[] sArr = {"Apple", "Pear", "Banana"};
		String s1 = "Pear";
		
		if(sArr[1] == s1) { System.out.println("Same"); }
		else 			  { System.out.println("Different"); }
		// 애초에 배열을 만들 때, 3칸짜리 메모리를 생성해 놓았는데, 
		
	}

}
