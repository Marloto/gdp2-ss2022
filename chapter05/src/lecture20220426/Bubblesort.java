package lecture20220426;

public class Bubblesort {
    /**
     * Sortiert "studenten" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Matrikelnummer.
     */
    public static void sortiereStudenten(Student[] studenten) {
        boolean getauscht = true;

        if (studenten.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < studenten.length - 1; ++i) {
                if (studenten[i].getMatrikelnummer() > studenten[i + 1].getMatrikelnummer()) {
                    Student tmp = studenten[i];
                    studenten[i] = studenten[i + 1];
                    studenten[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }

    /**
     * Sortiert "quadrate" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Seitenlänge.
     */
    public static void sortiereQuadrate(Quadrat[] quadrate) {
        boolean getauscht = true;

        if (quadrate.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < quadrate.length - 1; ++i) {
                if (quadrate[i].getSeitenlaenge() > quadrate[i + 1].getSeitenlaenge()) {
                    Quadrat tmp = quadrate[i];
                    quadrate[i] = quadrate[i + 1];
                    quadrate[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
}
