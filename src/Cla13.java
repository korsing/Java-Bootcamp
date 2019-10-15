
public class Cla13 {

	public static void main(String[] args) {
		String str1 = "SK Hynix";
		String str2 = "HP Edu";
				
		System.out.println(str1.substring(3));  // 
		System.out.println(str1.substring(0,3));

		System.out.println(str2 + str1);
		System.out.println(str2.concat(str1));
		System.out.println(str2.indexOf("d"));
		System.out.println(str2.lastIndexOf("d"));
		System.out.println(str2.replace("d","s"));
		System.out.println(str2.replace("du","ty"));
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println("A".compareTo("a"));
		System.out.println("a".compareTo("A"));
		System.out.println("A".compareTo("B"));
		System.out.println("D".compareTo("o"));
		System.out.println(str1.compareTo(str2));
		
		if(str1.compareTo(str2)>0) 
			{System.out.println("SK Hynix 가 크다");}
		else{System.out.println("HP Edu 가 크다");}
		
		String str3 = "ab-cd-ef";
		String[] sArr = str3.split("-");
		
		System.out.println(sArr[1]);
		
		int i = 20, j = 10;
		System.out.println(String.valueOf(i)+String.valueOf(j));// 2010
		String x = "20", y="10";
		System.out.println(Integer.parseInt(x)+Integer.parseInt(y));// 30

	}

}
