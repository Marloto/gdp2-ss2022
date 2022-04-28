package lecture20220428;

public class Student implements Vergleichbar {
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String toString() {
        return "Student [name=" + name + ", matrikelnummer=" + matrikelnummer + "]";
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }
    
    public boolean istGroesserAls(Vergleichbar vrgl) {
    	if(vrgl instanceof Student) {
    		Student st = (Student) vrgl;
    		return this.matrikelnummer > st.matrikelnummer; 
    	}
    	return false;
    }
}








