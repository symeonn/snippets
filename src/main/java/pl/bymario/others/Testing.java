package pl.bymario.others;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Testing {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("eight", "two", "three");
        Optional<Integer> firstLength = getFirstLength(strings);

        firstLength.ifPresent(val -> System.out.println(val));


        Optional<Integer> firstLengthStream = getFirstLengthStream(strings);
        firstLengthStream.ifPresent(val -> System.out.println(val));

        System.out.println("END");
    }


    private static Optional<Integer> getFirstLength(List<String> studentList) {

        if (studentList != null && studentList.size() > 1) {
            return studentList.stream().map(String::length)
                    .findFirst();
        }
        return Optional.empty();
    }


    private static Optional<Integer> getFirstLengthStream(List<String> studentList) {

        return Optional.ofNullable(studentList).map(sl -> sl.stream()
                .map(String::length)
                .findFirst().orElse(null));
    }
}
