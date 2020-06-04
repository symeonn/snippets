package pl.bymario.others;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Log
public class Comparison {

    public static void main(String[] args) {

//        ClassOne one = new ClassOne();
//        ClassOne two = new ClassOne();
//        ClassOne three = one;
//
//        System.out.println(one == two);
//        System.out.println(one.equals(two));
//
//        System.out.println(one == three);
//        System.out.println(one.equals(three));
//
//
//        System.out.println(EnumOne.ENUM_ONE == EnumOne.ENUM_ONE);
//        System.out.println(EnumOne.ENUM_ONE.equals(EnumOne.ENUM_ONE));
//
//        System.out.println(EnumOne.ENUM_ONE == EnumOne.ENUM_TWO);
//        System.out.println(EnumOne.ENUM_ONE.equals(EnumOne.ENUM_TWO));
//
//
//        String strOne = "one";
//
//        System.out.println(strOne == "one");
//        System.out.println(strOne.equals("one"));

        lambdaComparison();

    }


    static void lambdaComparison(){
        List<StringTuple> strings = new ArrayList<>();
        strings.add(new StringTuple("one", "one"));
        strings.add(new StringTuple("one", "two"));
        strings.add(new StringTuple("two", "two"));
        strings.add(new StringTuple("one", "three"));

//        List<StringTuple> collect =
                strings.stream()
//                .filter(stringTuple -> stringTuple.first == stringTuple.second)
                .forEach(stringTuple -> log.info(String.valueOf(stringTuple.first == stringTuple.second)));
//                .collect(Collectors.toList());

        log.info("d");

    }
    static class StringTuple {
        public StringTuple(String first, String second) {
            this.first = first;
            this.second = second;
        }

        private String first;
        private String second;
    }

    static class ClassOne {
        private int fieldInt;
        private String fieldStr;
        private RuntimeException fieldExc;
    }


    static enum EnumOne {

        ENUM_ONE, ENUM_TWO, ENUM_THREE


    }
}
