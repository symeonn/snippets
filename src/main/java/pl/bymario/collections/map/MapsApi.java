package pl.bymario.collections.map;

import pl.bymario.Tuple;

import java.util.Map;

public class MapsApi {

    public Map<String, String> mapComputeIfAbsent(Map<String, String> initialMap, Tuple entryToAdd) {

        initialMap.computeIfAbsent(entryToAdd.getKey(), s -> {
            return entryToAdd.getValue();
        });

        return initialMap;
    }

    public Map<String, String> mapComputeIfPresent(Map<String, String> initialMap, Tuple entryToAdd) {

        initialMap.computeIfPresent(entryToAdd.getKey(), (key, val) -> {
            return val + " + " + entryToAdd.getValue();
        });

        return initialMap;
    }

    public Map<String, String> mapPutIfAbsent(Map<String, String> initialMap, Tuple entryToAdd) {

        initialMap.putIfAbsent(entryToAdd.getKey(), entryToAdd.getValue());

        return initialMap;
    }


}
