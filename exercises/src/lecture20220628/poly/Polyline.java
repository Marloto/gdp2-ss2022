package lecture20220628.poly;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
	private List<Position> positions;
	
	public Polyline() {
		this.positions = new ArrayList<>();
	}
	
	public Polyline add(double x, double y) {
		this.add(new Position(x, y));
		return this;
	}
	
	public Polyline add(Position p) {
		this.positions.add(p);
		return this;
	}
	
	public String toString() {
		return this.positions.toString();
	}
}
