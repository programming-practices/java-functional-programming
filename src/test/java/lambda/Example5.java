package lambda;

import java.util.function.IntSupplier;

public class Example5 {
    public static void main(String[] args) {

        IntSupplier x = () -> 5;
        System.out.println(x.getAsInt());

    }
}
