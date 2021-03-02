package lambda;

public class Example1 {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello World!!");
        r.run();

    }
}
