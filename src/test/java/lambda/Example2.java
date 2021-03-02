package lambda;

public class Example2 {
    public static void main(String[] args) {

        run(() -> System.out.println("Hello World!!"));

    }

    static void run(Runnable r) {
        r.run();
    }

}
