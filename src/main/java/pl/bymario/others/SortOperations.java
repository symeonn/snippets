package pl.bymario.others;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortOperations {

    private static final String EXERCISE_SUBCATEGORY_SORT_ORDER = "exercise.subcategory.sortOrder";
    private static final String EXERCISE_SUBCATEGORY_ID = "exercise.subcategory.id";
    private static final String EXERCISE_SORT_ORDER = "exercise.sortOrder";
    private static final String EXERCISE_LEVEL = "exercise.level";
    private static final String EXERCISE_ID = "exercise.id";

    public static void main(String[] args) {


        Map<String, String> orderByMap = new HashMap<>();

        orderByMap.put("exercise.subcategory.sortOrder", "asc");
        orderByMap.put("exercise.subcategory.id", "asc");
        orderByMap.put("exercise.sortOrder", "asc");
        orderByMap.put("exercise.level", "asc");
        orderByMap.put("exercise.id", "asc");

        StringBuilder orderByClause = new StringBuilder("order by ");

        String collect = orderByMap.keySet().stream()
                .map(key -> getClause(orderByMap.get(key), key))
                .filter(Objects::nonNull)
                .collect(Collectors.joining(", "));

        orderByClause.append(collect);
        System.out.println(orderByClause);

    }

    static String getClause(String mapKey, String key) {
        switch (key) {
            case EXERCISE_SUBCATEGORY_SORT_ORDER:
                return "c.sort_order " + mapKey;
            case EXERCISE_SUBCATEGORY_ID:
                return "c.id " + mapKey;
            case EXERCISE_SORT_ORDER:
                return "e.sort_order " + mapKey;
            case EXERCISE_LEVEL:
                return "e.level " + mapKey;
            case EXERCISE_ID:
                return "e.id " + mapKey;
            default:
            return null;
        }
    }


}
