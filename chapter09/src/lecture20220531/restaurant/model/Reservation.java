package lecture20220531.restaurant.model;

public class Reservation implements Comparable<Reservation> {

    private String name;
    private String date;

    public Reservation(String date, String name) {
        this.date = date;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDate() {
        return date;
    }
    
    public String toString() {
        return this.date + " " + this.name;
    }
    
    public int compareTo(Reservation o) {
    	if(o == null) {
    		return 1;
    	}
    	return date.compareTo(o.date);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reservation other = (Reservation) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}
