package lecture20220407.example;

public class Child extends Base {
  public void test() {
    a = 1;
    b = 2;
    c = 3;
//    d = 4; -> nicht sichtbar
    f();
    g();
    h();
//    k(); -> nicht sichtbar
  }
}
