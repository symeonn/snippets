package others;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerInMap {

    public static String orderBy = "order by ";
    private static final String EXERCISE_SUBCATEGORY_SORT_ORDER = "exercise.subcategory.sortOrder";

    private static final Map<String, SortProperty> MAP = ImmutableMap.<String, SortProperty>builder()
            .put(EXERCISE_SUBCATEGORY_SORT_ORDER, new SortProperty("c.sortOrder", "join ste.exercise e"))
//            .put(EXERCISE_SUBCATEGORY_ID, ACTIVATE_TEST_SHORT_TEST)
//            .put(EXERCISE_SORT_ORDER, ACTIVATE_SELF_SERVICE_TEST)
//            .put(EXERCISE_LEVEL, ACTIVATE_TEST_EXAM)
//            .put(EXERCISE_ID, ACTIVATE_TEST_LESSON)

            .build();

    public static void main(String[] args) {


        List<String> sort = new ArrayList<>();
        sort.add(EXERCISE_SUBCATEGORY_SORT_ORDER);


        sort.forEach(orderBy -> {
            String joinSql = MAP.get(orderBy).getJoinSql();

            System.out.println(joinSql);

        });

    }

    private static void doTwo() {
        System.out.println("doTwo");
    }

    private static void doOne() {
        System.out.println("doOne");
    }

    @Getter
    @AllArgsConstructor
    private static class SortProperty {

        public String orderBySQl;
        public String joinSql;
    }
}
