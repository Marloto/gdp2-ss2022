package lecture20220608;

public class LambdaCase {
    public static void main(String[] args) {
        Runnable example = () -> System.out.println("Hello, World");
        
        example.run();
    }
}
