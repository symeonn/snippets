package pl.bymario;

public class Main {

    public static void main(String[] args) {

//        DateTimeCheck dateTimeCheck = new DateTimeCheck();
//        HandleExceptions handleExceptions = new HandleExceptions();
//        Optionals optionals = new Optionals();
//
////        dateTimeCheck.testZoneDateTime();
//        dateTimeCheck.equalsDates();


//        handleExceptions.foo();

//        optionals.check();

        String t = null;

        if (t == null || t.contains("dd")) {
            System.out.println("tt");
        } else {
            System.out.println("nn");
        }

    }

    private static void checkComparisonWithNull() {

        Integer x = null;

        if (x != null ? x > 3 : false) System.out.println(x);
//        if ( 3 >x) System.out.println(x);
//        if ( x.compareTo(3) == 0) System.out.println(x);

    }


}
