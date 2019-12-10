package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {

    public boolean containsFiveAllMatch(List<Long> longList) {

        Predicate<? super Long> predicate = aLong -> aLong == 5;
        boolean containsFive = longList.stream().allMatch(predicate);

        return containsFive;
    }

    public boolean containsFiveAnyMatch(List<Long> longList) {

        Predicate<? super Long> predicate = aLong -> aLong == 5;
        boolean containsFive = longList.stream().anyMatch(predicate);

        return containsFive;
    }

    public List<Integer> mapWithNullElements(){

        List<InnerObject> integerList = new ArrayList<>();
        integerList.add(new InnerObject(1));
        integerList.add(new InnerObject(null));
        integerList.add(new InnerObject(3));
        integerList.add(new InnerObject(4));


        return integerList.stream()
                .map(InnerObject::getValue)
                .collect(Collectors.toList());


    }

    public List<InnerObject> streamRetainAll(List<InnerObject> objList, List<InnerObject> retainList) {

        return objList.stream()
                .filter(retainList::contains)
                .collect(Collectors.toList());
//        objList.retainAll(retainList);
//        return objList;
    }

    public static class InnerObject {

        public InnerObject(Integer value) {
            this.value = value;
        }

        Integer value;

        public Integer getValue() {
            return value;
        }
    }
}
