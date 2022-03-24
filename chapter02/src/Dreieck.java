
public class Dreieck {
	double a;
	double b;
	double c;
	
	Dreieck() { // A
		this(0, 0, 0);
	}
	Dreieck(double x, double y, double z) { // B
		a = x;
		b = y;
		c = z;
	}
	Dreieck(int x, int y, int z) { // B
		a = x;
		b = y;
		c = z;
	}
	Dreieck(double x, double y) { // C
		this(x, y, y);
	}
	Dreieck(double x) { // D
		this(x, x);
	}
}
