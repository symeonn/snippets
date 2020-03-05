package pl.bymario.others;

public class Comparison {

    public static void main(String[] args) {

        ClassOne one = new ClassOne();
        ClassOne two = new ClassOne();
        ClassOne three = one;

        System.out.println(one == two);
        System.out.println(one.equals(two));

        System.out.println(one == three);
        System.out.println(one.equals(three));


        System.out.println(EnumOne.ENUM_ONE == EnumOne.ENUM_ONE);
        System.out.println(EnumOne.ENUM_ONE.equals(EnumOne.ENUM_ONE));

        System.out.println(EnumOne.ENUM_ONE == EnumOne.ENUM_TWO);
        System.out.println(EnumOne.ENUM_ONE.equals(EnumOne.ENUM_TWO));



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
