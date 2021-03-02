package optional.empty;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static java.lang.System.out;

class Example {

    @Test
    void test() {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 1");
        Optional<Object> o1 = Optional.empty();
        out.println(o1.isPresent());
    }
}
