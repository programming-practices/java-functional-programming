package optional.isPresent;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static java.lang.System.out;

class Example {

    @Test
    void test() {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 2");
        String str2 = "Hello World!!!";
        Optional<String> o2 = Optional.of(str2);
        out.println(o2.isPresent());

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 3");
        String str3 = "Hello World!!!";
        Optional<String> o3 = Optional.of(str3);
        o3.ifPresent(out::println);
    }
}
