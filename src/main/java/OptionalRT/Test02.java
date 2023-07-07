package OptionalRT;

import java.util.Optional;

public class Test02 {
    public static void main(String[] args) {
        //String name = null;
        String name = "nick";
        Optional<String> optional = Optional.ofNullable(name);
        optional.ifPresent(System.out::println);
    }
}
