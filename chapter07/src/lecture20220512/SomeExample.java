package lecture20220512;

public class SomeExample {
    private String msg;

    public SomeExample(String msg) {
        this.msg = msg;
        this.print();
    }
    
    private void print() {
        //System.out.println(msg);
    	throw new RuntimeException("Immer!");
    }

    public static void doSomething(String msg) {
        new SomeExample(msg);
    }
    
    public static void main(String[] args) {
    	try {    		
    		doSomething("Hello, World!");
    	} catch(RuntimeException exc) {
    		exc.printStackTrace();
    	}
    }
}
