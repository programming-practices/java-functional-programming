package optional.filter;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class Example {

    @Test
    void test() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> result = list.stream()
                .filter(number -> number >= 10)
                .filter(number -> number <= 15)
                .collect(Collectors.toList());

        assertThat(result).containsExactly(10, 11, 12, 13, 14, 15);
    }
}
