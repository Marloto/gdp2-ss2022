package lecture20220517;

class SomeErrors {
    public void doSomething(int i) throws Exception {
        if (i < 10) {
            throw new Exception("i muss größer oder gleich 10 sein");
        }
    }
}

class MoreErrors extends SomeErrors {
    public MoreErrors() throws Exception {
        super.doSomething(9);
    }

    public void doSomething(int i) {
        System.out.println("Hello, World!");
    }
}

public class Experiment {
    public static void main(String[] args) throws Exception {
        MoreErrors errors = new MoreErrors();
        errors.doSomething(0);

        SomeErrors errors2 = new SomeErrors();
        errors2.doSomething(0);
        
        SomeErrors errors3 = errors;
        errors3.doSomething(0);
        // -> der datentyp entscheidet über die spezifikation der aufgerufenen methode
        // -> die methode MoreErrors.doSomething wird aber aufgerufen 
    }
}




