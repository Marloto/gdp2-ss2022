package lecture20220628.poly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 1. Schritt Iterable implementieren
// 2. iterator() : Iterator<T>

public class Polyline implements Iterable<Position> {
	private List<Position> positions;
	
	public Iterator<Position> iterator() {
		 return positions.iterator();
	}
	
	public Iterable<Position> iterator(double length) {
		//return new PolylinePartIterator(length, positions);
		
		// return new PolylinePart(length, this);
		
		//return () -> new PolylinePartIterator(length, positions);
		
		return new Iterable<Position>() {
			public Iterator<Position> iterator() {
				return new PolylinePartIterator(length, positions);
			}
		};
	}
	
	public Polyline() {
		this.positions = new ArrayList<>();
	}
	
	public List<Position> getPositions() {
		return positions;
	}
	
	public Polyline add(double x, double y) {
		this.add(new Position(x, y));
		return this;
	}
	
	public Polyline add(Position p) {
		this.positions.add(p);
		return this;
	}
	
	public Polyline scale(double factor) {
		Polyline line = new Polyline();
		for(Position p : this) {
			line.add(p.mul(factor));
		}
		return line;
	}
	
	public Polyline stopAfter(double f) {
		Polyline polyline = new Polyline();
		if(this.positions.size() < 1) {
			return polyline;
		}
		polyline.add(this.positions.get(0));
		for(int i = 1; i < this.positions.size(); i ++) {
			Position a = this.positions.get(i - 1);
			Position b = this.positions.get(i);
			double distanceTo = a.distanceTo(b);
			if(distanceTo > f) {
				polyline.add(b.sub(a).normalize().mul(f).add(a));
				break;
			} else {
				polyline.add(b);
				f -= distanceTo;
				if(f == 0) {
					break;
				}
			}
		}
		return polyline;
	}
	
	public String toString() {
		return this.positions.toString();
	}
	
}
