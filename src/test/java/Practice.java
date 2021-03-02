import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

class Practice1 {

    @Test
    void test() {
        Consumer<Object> lambdaPrinter = obj -> System.out.println(obj);
        Consumer<Object> methodRefPrinter = System.out::println;

        System.setOut(null);

        methodRefPrinter.accept("hello");
        lambdaPrinter.accept("hello");          // Will be throw exception
    }
}
