package main.java.optionals;

import java.util.Optional;

public class Optionals {

    public void check(){

        Double d = null;

        Double d1 = Optional.ofNullable(d).orElse(0d);


        Optional<Double> od = Optional.ofNullable(d);
        Double d2 = od.orElse(0d);

        System.out.println(d1);
        System.out.println(d2);

    }
}
