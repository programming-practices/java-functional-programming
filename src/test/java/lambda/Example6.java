package lambda;

import java.util.function.IntSupplier;

public class Example6 {
    public static void main(String[] args) {

        // "Void-compatible" lambda and "Value-compatible"
        IntSupplier x = () -> {while (true){}};
        System.out.println(x.getAsInt());

        // "Void-compatible" lambda and "Value-compatible"
        IntSupplier x2 = () -> {throw  new RuntimeException();};
        System.out.println(x2.getAsInt());

    }
}
