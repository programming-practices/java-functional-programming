package optional.orElseThrow;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Example {

    @Test
    void test() {
        String str = null;
        assertThrows(
                NoSuchElementException.class,
                () -> Optional.ofNullable(str).orElseThrow()
        );
    }

    @Test
    void test1() {
        String str = null;
        assertThrows(
                IllegalArgumentException.class,
                () -> Optional.ofNullable(str).orElseThrow(IllegalArgumentException::new)
        );
    }

    @Test
    void test2() {
        String str = "Hello World!!!";
        String result = Optional.ofNullable(str).orElseThrow();
        assertThat(result).isEqualTo("Hello World!!!");
    }
}
