package optional.of;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Example {

    @Test
    void test() {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 3");
        String str3 = null;
        assertThrows(NullPointerException.class, () -> Optional.of(str3));
    }

    @Test
    void test1() {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 3");
        String str3 = "Hello World!!!";
        Optional<String> result = (Optional<String>) Optional.of(str3);
        out.println(result.isPresent());
    }
}
