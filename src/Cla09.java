
class Point09 {
	int x, y;
	Point09(int x, int y) { 
		this.x = x;
		this.y = y;
		//System.out.println("NEW Point [X : " + x + ", Y : " + y + "]"); 
	}
	
	static Point09 sum(Point09 p1, Point09 p2) {
		int px = p1.x + p2.x;
		int py = p1.y + p2.y;
		//System.out.println("SUM Point [X : " + px + ", Y : " + py +"]"); 
		
		Point09 result = new Point09(px, py);
		return result;
	}
	
}
public class Cla09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point09 p1 = new Point09(20,10);
		Point09 p2 = new Point09(35,25);
		//Point09.sum(p1, p2);
		
		Point09 p3 = Point09.sum(p1, p2);
		System.out.println("NEW Point [X : " + p3.x + ", Y : " + p3.y + "]");
		
	}

	
}
