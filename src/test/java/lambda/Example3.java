package lambda;

public class Example3 {
    public static void main(String[] args) {

//        Object x = () -> System.out.println("Hello World!!");                                     // Compilation Error

        Object x = (Runnable)() -> System.out.println("Hello World!!");                         // Not Compilation Error

    }
}
