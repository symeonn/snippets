package streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Grouping {


    public static void main(String[] args) {


        ArrayList<SimpleObj> objects = new ArrayList<>();
        objects.add(new SimpleObj(1, "one"));
        objects.add(new SimpleObj(2, "two"));
        objects.add(new SimpleObj(3, "three"));

        TreeMap<Integer, List<SimpleObj>> collect = objects.stream()
                .collect(groupingBy(SimpleObj::getFieldA, TreeMap::new, Collectors.toList()));

        System.out.println(collect.keySet());

        List<Integer> collect1 = objects.stream()
                .collect(groupingBy(SimpleObj::getFieldA, TreeMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .map(e -> {
                    System.out.println(e.getKey());
                    return e.getKey();
                })
                .collect(Collectors.toList());

        System.out.println(collect1);

    }

    @Setter
    @Getter
    @AllArgsConstructor
    private static class SimpleObj {

        private Integer fieldA;
        private String fieldB;

    }
}
