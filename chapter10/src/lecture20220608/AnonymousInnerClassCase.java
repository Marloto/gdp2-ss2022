package lecture20220608;

public class AnonymousInnerClassCase {
    public static void main(String[] args) {
        Runnable example = new Runnable() {
            public void run() {
                System.out.println("Hello, World!");
            }
        };
        
        example.run();
    }
}
