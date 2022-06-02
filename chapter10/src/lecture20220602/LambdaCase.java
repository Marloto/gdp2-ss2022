package lecture20220602;

public class LambdaCase {
    public static void main(String[] args) {
        Runnable example = () -> System.out.println("Hello, World");
        
        example.run();
    }
}
