package optional.orElse_and_orElseGet;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static java.lang.System.out;

class OrElse {

    @Test
    void test() {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 2");
        String str2 = null;
        String result = Optional.ofNullable(str2).orElse("default value!!!");
        out.println(result);
    }
}
