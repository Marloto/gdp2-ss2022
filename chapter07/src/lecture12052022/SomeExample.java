package lecture12052022;

public class SomeExample {
    private String msg;

    public SomeExample(String msg) {
        this.msg = msg;
        this.print();
    }
    
    private void print() {
        System.out.println(msg);
    }

    public static void doSomething(String msg) {
        new SomeExample(msg);
    }
    
    public static void main(String[] args) {
        doSomething("Hello, World!");
    }
}
