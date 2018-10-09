package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorss {

    public static void main(String[] args) {

        Iteratorss thiss = new Iteratorss();

        thiss.checkRemove();
    }

    public void checkRemove(){


        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");


        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {


            String str = iterator.next();

            System.out.println(str);

        }


    }
}
