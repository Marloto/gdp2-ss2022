package lecture20220628.poly3;

public class Example {
	public static void main(String[] args) {
		Polyline polyline = new Polyline();
		polyline.add(0, 0);
		polyline.add(10, 0);
		polyline.add(20, 0);
		
		for(Position p : polyline) {
			System.out.println(p);
		}
	}
}



