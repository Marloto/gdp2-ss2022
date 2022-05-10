package lecture20220510.exercise;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PointsOfInterest {
    public static void main(String[] args) {
        Location thiLoc = new Location("THI", new Point(48.7668718,11.4318193));
        Location donauwurmLoc = new Location("Donauwurm", new Point(48.75,11.4));
        
//        LinkedList<Location> list1 = new LinkedList<>();
        Collection<Location> list1 = new LinkedList<>();
        
        // Alle Vererbungshierarchie-Klassen lassen sich als Datentypen verwenden
        // Alle Schnittstellen lassen sich als Datentypen verwenden
        
        
        list1.add(thiLoc);
        list1.add(donauwurmLoc);
        // wie iterieren Sie über arrays?
        for(Location loc : list1) {
        	
        }
        // index + schleife + size
        for(int i = 0; i < list1.size(); i ++) {
//        	Location loc = list1.get(i);
        }
//        list1.set(0, null); // 1. option für entfernern
        list1.remove(thiLoc);
        
        
        // Welche Mengen / Sets sind bekannt aus Java?
        // -> Tree- und HashSet
        Collection<Location> set1 = new TreeSet<>();
        set1.add(donauwurmLoc);
        set1.add(thiLoc);
        
        set1.remove(donauwurmLoc);
        
        for(Location loc : set1) {} // Set<Location>
        for(int i = 0; i < set1.size(); i ++) {
        	// geht nicht, da kein get!
        }
        
        // Map?
        // -> HashMap und TreeMap
        // -> 2 generics, Key und Value, Point und Location
        Map<Point, Location> treeMap = new TreeMap<>();
        treeMap.put(donauwurmLoc.getPoint(), donauwurmLoc);
        treeMap.put(thiLoc.getPoint(), thiLoc);
        
        // Iteration über Schlüssel
        for(Point p : treeMap.keySet()) {}
        // Iteration über Werte
        for(Location loc : treeMap.values()) {}
        Set<Entry<Point, Location>> entrySet = treeMap.entrySet();
        for(Entry<Point, Location> entry : entrySet) {
        	Point key = entry.getKey();
        	Location value = entry.getValue();
        }
    }
}













