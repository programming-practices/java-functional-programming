package optional.ofNullable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

import static java.lang.System.out;

class Example {

    @Test
    void test() {
        String str2 = null;
        Optional<String> result2 = Optional.ofNullable(str2);
        out.println(result2.isPresent());
    }

    @Test
    void test1() {
        String str3 = "Hello World";
        Optional<String> result3 = Optional.ofNullable(str3);
        out.println(result3.isPresent());
    }

    @Test
    void test2() {
        String str2 = null;
        Optional<String> result2 = Optional.ofNullable(str2);
        Assertions.assertThrows(NoSuchElementException.class, () -> result2.get());
    }
}
