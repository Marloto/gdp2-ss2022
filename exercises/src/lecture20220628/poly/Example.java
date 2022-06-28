package lecture20220628.poly;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int length = scanner.nextInt();
		
		
		Polyline polyline = new Polyline();
		polyline.add(0, 0);
		polyline.add(10, 0);
		polyline.add(20, 0);
		
//		for(Position p : new PolylinePart(length, polyline)) {
//			System.out.println(p);
//		}
//		for(Position p : polyline.iterator(15)) {
//			System.out.println(p);
//		}
		
//		for(Position p : polyline.scale(2).stopAfter(25)) {
//			System.out.println(p);
//		}
		
		for(Position p : new Polyline()
				.add(0, 0)
				.add(10, 0)
				.add(20, 0)
				.scale(2)
				.stopAfter(25)) {
			System.out.println(p);
		}
	}
}



