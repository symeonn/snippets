package pl.bymario.collections.streams;

import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> emptyList = Collections.emptyList();

        List<Tmp> objectListInitNull = null;

        if(!emptyList.isEmpty()){

            objectListInitNull = emptyList.stream()
                    .map(s -> new Tmp(1, s))
                    .collect(Collectors.toList());
        }


        List<Tmp> objectList = emptyList.stream()
                .map(s -> new Tmp(1, s))
                .collect(Collectors.toList());

        System.out.println("objectListInitNull " + objectListInitNull);
        System.out.println("objectList " + objectList);


    }

    @AllArgsConstructor
    public static class Tmp {
        int field1;
        String field2;

    }

}
