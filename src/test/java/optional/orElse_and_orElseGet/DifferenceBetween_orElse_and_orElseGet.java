package optional.orElse_and_orElseGet;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static java.lang.System.out;

class DifferenceBetween_orElse_and_orElseGet {

    @Test
    void test() {

        String str = null;

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> orElseGet");
        String result = Optional.ofNullable(str).orElseGet(this::getDefaultValue);
        out.println(result);

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> orElse");
        String result1 = Optional.ofNullable(str).orElse(getDefaultValue());
        out.println(result1);

    }

    @Test
    void test1() {

        String str = "Hello World!!!";

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> orElseGet");
        String result = Optional.ofNullable(str).orElseGet(this::getDefaultValue);
        out.println(result);

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> orElse");
        String result1 = Optional.ofNullable(str).orElse(getDefaultValue());
        out.println(result1);

    }

    public String getDefaultValue() {
        out.println("<<<<<<<<<< Inside method getDefaultValue() >>>>>>>>>>");
        return "default value!!!";
    }

}
