package lecture20220524;

class A { }
public class Example {
 public class B { } // erhalten automatisch einen Verweis auf das "erzeugende" äußere Objekt
 public static class C { }
 public Example() {
	 new B();
 }
 
 public void doSomething() {
  new A();
  new B();
  new C();
 }
 
 public B moreThings() {
	 return new B();
 }
 
 // In welchen Methoden kann B instanziiert werden?
 // -> in Methoden die nicht statisch sind
 public static void main(String[] args) {
  new A();
  //new B();
  new C();
  
  B b = new Example().moreThings();
  
 }
}
