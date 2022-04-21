package lecture20220421;

public enum TerminTyp {
	UNDEFINIERT(15), PRAESENZ(120), 
	ONLINE(60), TELEFON(30), KURZ_MEETING(10);
	
	private int minDauer;
	
	private TerminTyp(int minDauer) {
	}
	
	public int getMinDauer() {
		return minDauer;
	}
	
	public void doSomething() {
		System.out.println("xyz");
	}
	
	public String doOtherthing() {
		return "Hello, World";
	}
}
