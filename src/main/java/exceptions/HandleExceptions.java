package exceptions;

public class HandleExceptions {


    public void foo(){

        try {

            System.out.println(this.getClass().getSimpleName());
            System.out.println("in foo");
            bar();
        } catch (Exception e) {
            System.out.println("in catch");
            e.printStackTrace();
        }finally {
            System.out.println("in finally");
        }

    }

    private void bar() throws Exception {
        System.out.println("in bar");
        throw new Exception();
    }

}
