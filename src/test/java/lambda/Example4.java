package lambda;

public class Example4 {
    public static void main(String[] args) {

        Runnable r = (
                args.length > 0 ?
                () -> System.out.println("Hello " + args[0] + "!!!") :
                () -> System.out.println("Hello World!!!")
        );

        // Compilation Error
//        Object x = (Runnable) (
//                args.length > 0 ?
//                        () -> System.out.println("Hello " + args[0] + "!!!") :
//                        () -> System.out.println("Hello World!!!")
//        );

    }
}
