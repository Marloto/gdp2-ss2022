package lecture20220608;

public class InnerClassCase {
    private static class SomeRunnable implements Runnable {
        public void run() {
            System.out.println("Hello, World!");
        }
    }
    public static void main(String[] args) {
        Runnable example = new SomeRunnable();
        
        example.run();
    }
}
