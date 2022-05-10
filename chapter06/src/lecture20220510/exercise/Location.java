package lecture20220510.exercise;

public class Location implements Comparable<Location> {
    private String name;
    private Point point;

    public Location(String name, Point point) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public Point getPoint() {
        return point;
    }
    
    public String toString() {
        return "Location[name = " + this.name + "]";
    }

    public int hashCode() {
        // Auto-Generated
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((point == null) ? 0 : point.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        // Auto-Generated
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Location other = (Location) obj;
        return this.name.equals(other.name) && this.point.equals(other.point);
    }

    public int compareTo(Location o) {
        int compare = this.point.compareTo(o.point);
        if(compare == 0) { // nur wenn Positionen identisch
            compare = this.name.compareTo(o.name);
        }
        return compare;
    }
}
