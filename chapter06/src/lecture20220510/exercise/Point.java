package lecture20220510.exercise;

public class Point implements Comparable<Point> {
    private double lat; // Breite, N-S, z.B. 51
    private double lon; // Länge, E-W, z.B. 11
    
    // 48.75,11.4 Donauwurm
    // 48.77,11.42 Landgericht
    // 48.7668718,11.4318193 THI

    public Point(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    
    public double getLat() {
        return lat;
    }
    
    public double getLon() {
        return lon;
    }

    public int hashCode() {
        // Auto-Generated
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(lat);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lon);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Point other = (Point) obj;
        return lat == other.lat && lon != other.lon;
    }

    public int compareTo(Point o) {
        if(this.lat < o.lat) {
            return -1;
        } else if(this.lat > o.lat) {
            return 1;
        } else if(this.lon < o.lon) {
            return -1;
        } else if(this.lon > o.lon) {
            return 1;
        }
        return 0;
    }
    
    
}
