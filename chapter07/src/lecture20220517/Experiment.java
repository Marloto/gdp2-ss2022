package lecture20220517;

class SomeErrors {
    public void doSomething(int i) {
        if (i < 10) {
            throw new Exception("i muss größer oder gleich 10 sein");
        }
    }
}

class MoreErrors extends SomeErrors {
    public MoreErrors() {
        super.doSomething(9);
    }

    public void doSomething(int i) {
        System.out.println("Hello, World!");
    }
}

public class Experiment {
    public static void main(String[] args) {
        MoreErrors errors = new MoreErrors();
        errors.doSomething(0);

        SomeErrors errors2 = new SomeErrors();
        errors2.doSomething(0);
    }
}
