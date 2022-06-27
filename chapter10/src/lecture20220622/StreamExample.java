package lecture20220622;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> someList = new ArrayList<>();
        someList.add("3");
        someList.add("1");
        someList.add("42");
        someList.add("10");
        List<Integer> list = someList.stream()
                .map(el -> Integer.valueOf(el))
                .filter(el -> el >= 10)
                .collect(Collectors.toList());
        // Ergebnis => 42 und 10
        System.out.println(list.toString());
        
        // Transformieren die Logik in Stream-API / Lambda Variante in eine ohne Lambda-Ausdrücken
        
        List<String> someList2 = new ArrayList<>();
        someList2.add("3");
        someList2.add("1");
        someList2.add("42");
        someList2.add("10");
        List<Integer> ergebnis = new ArrayList<>();
        for(String el : someList2) {
            Integer value = Integer.valueOf(el);
            if(value >= 10) {
                ergebnis.add(value);
            }
        }
        System.out.println(ergebnis.toString());
        
//        Stream<String> stream = someList.stream();
//        // Generische Datentype -> Einschränkung nur Klassen!
////        stream.map(new Function<String, Integer>() {
////            public Integer apply(String t) {
////                return Integer.valueOf(t);
////            }
////        });
//        Stream<Integer> map = stream.map(t -> Integer.valueOf(t));
//        //map.forEach(el -> System.out.println(el));
//        List<Integer> list = map.collect(Collectors.toList());
        
    }
}
