
public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sArr = new String[3];
		sArr[0] = "AA"; sArr[1] = "AA"; 
		sArr[2] = new String("AA");
		
		System.out.println(sArr[0] == sArr[1]);
		System.out.println(sArr[1] == sArr[2]);
	}

}
