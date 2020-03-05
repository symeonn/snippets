package pl.bymario.logic;

public class Main {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println(a||b&&c);
        System.out.println(a||(b&&c));
        System.out.println((a||b)&&c);


    }
}
