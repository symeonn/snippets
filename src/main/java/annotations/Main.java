package annotations;

public class Main {

    public static void main(String[] args) {


        noArgConstr();
        allArgConstr();
        setters();



    }

    private static void setters() {
        ObjectOne objectOne = new ObjectOne();

        objectOne.setName("kuku - setter");
        objectOne.setAge(55);

        System.out.println(objectOne.getName());
    }

    private static void allArgConstr() {
        ObjectOne objectOne = new ObjectOne("kuku - constr", 2);
        System.out.println(objectOne.getName());

    }

    private static void noArgConstr() {
        ObjectOne objectOne = new ObjectOne();

        System.out.println(objectOne.getName());
    }
}
