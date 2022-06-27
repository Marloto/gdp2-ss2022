package lecture20220608;

public class Person {
	private int alter;
	private String name;
	public Person(String name, int alter) {
		super();
		this.alter = alter;
		this.name = name;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name + "(" + this.alter + ")";
	}
	
}
