package lecture20220503;

import java.util.Arrays;

public class BubblesortMitInterface {
    public static void main(String[] args) {
        Student[] studenten = { new Student("Bernd", 4713), new Student("Bernd", 4712), new Student("Eva", 4711) };
        Quadrat[] quadrate = { new Quadrat(33), new Quadrat(4),new Quadrat(12) };
        
//        Bubblesort.sortieren((Comparable[]) studenten);
//        for (Student s : studenten) {
//            System.out.println(s);
//        }
        
        // Hinweis: funktioniert auch bei Arrays, Vergleichbar[] vergleichbarArrays = quadrate;
        //Bubblesort.sortieren((Comparable[]) quadrate);
//        Arrays.sort(quadrate, new QuadratSeitenlaengenSortierer());
        Arrays.sort(quadrate, new UmgedrehtenQuadratSeitenlaengenSortierter());
        for (Quadrat q : quadrate) {
            System.out.println(q);
        }
    }
}
