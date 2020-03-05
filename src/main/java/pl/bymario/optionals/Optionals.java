package pl.bymario.optionals;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Optionals {

    public void check() {

        Double d = null;

        Double d1 = Optional.ofNullable(d).orElse(0d);


        Optional<Double> od = Optional.ofNullable(d);
        Double d2 = od.orElse(0d);

        System.out.println(d1);
        System.out.println(d2);

    }

    public void iterateOver() {

        Set<String> set = new HashSet<>();

        getVal(null).ifPresent(set::add);
        getVal("one").ifPresent(set::add);
        getVal("two").ifPresent(set::add);

        System.out.println(String.join(", ", set));

    }

    public void concatOptionalToString() {

        String str = "abc";

        str += getString()
                + getEmptyOptional().orElse("")
                + getOptional().orElse("");

        System.out.println(str);
    }

    private Optional<String> getEmptyOptional() {
        return Optional.empty();
    }

    private Optional<String> getOptional() {

        return Optional.ofNullable("xyz");
    }

    private String getString() {
        return "123";
    }

    private Optional<String> getVal(String string) {

        return Optional.ofNullable(string);
    }

    public void ofNullable() {
        Object obj = new String("kk");
        String kuku = Optional.ofNullable(obj).map(o -> Optional.of("left join")).orElse(Optional.of("empty")).get();

        System.out.println(kuku);

//        IntStream.range(1, 3).

    }
}
