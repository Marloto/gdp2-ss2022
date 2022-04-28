package lecture20220428;

public class BubblesortMitInterface {
    public static void main(String[] args) {
        Student[] studenten = { new Student("Xaver", 4713), new Student("Bernd", 4712), new Student("Eva", 4711) };
        Quadrat[] quadrate = { new Quadrat(33), new Quadrat(4),new Quadrat(12) };
        
        Bubblesort.sortieren(studenten);
        for (Student s : studenten) {
            System.out.println(s);
        }
        
        // Hinweis: funktioniert auch bei Arrays, Vergleichbar[] vergleichbarArrays = quadrate;
        Bubblesort.sortieren(quadrate);
        for (Quadrat q : quadrate) {
            System.out.println(q);
        }
    }
}
