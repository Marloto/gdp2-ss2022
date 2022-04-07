public class StaticStuff {
    private static int something = 42;
    public void doOtherthing() {
        something ++;
    }
    public static void doSomething() {
        new StaticStuff().doOtherthing();
    }
    public static void main(String[] args) {
    	StaticStuff.doSomething();
    	StaticStuff.doSomething();
        System.out.println(StaticStuff.something);
    }
}



