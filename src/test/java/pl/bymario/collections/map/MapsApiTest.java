package pl.bymario.collections.map;

import org.junit.jupiter.api.Test;
import pl.bymario.Tuple;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapsApiTest {

    private MapsApi mapsApi = new MapsApi();

    @Test
    void testMapComputeIfAbsent_Absent() {
        
        //given
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //when
        Tuple entryToAdd = new Tuple("key3", "value3");
        Map<String, String> result = mapsApi.mapComputeIfAbsent(map, entryToAdd);

        //then
        assertEquals(result, map);
        assertFalse(result.isEmpty());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
        assertEquals("value3", result.get("key3"));
    }

    @Test
    void testMapComputeIfAbsent_Present() {

        //given
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //when
        Tuple entryToAdd = new Tuple("key2", "value3");
        Map<String, String> result = mapsApi.mapComputeIfAbsent(map, entryToAdd);

        //then
        assertEquals(result, map);
        assertFalse(result.isEmpty());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testMapComputeIfPresent_Absent() {

        //given
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //when
        Tuple entryToAdd = new Tuple("key3", "value3");
        Map<String, String> result = mapsApi.mapComputeIfPresent(map, entryToAdd);

        //then
        assertEquals(result, map);
        assertFalse(result.isEmpty());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testMapComputeIfPresent_Present() {

        //given
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //when
        Tuple entryToAdd = new Tuple("key2", "value3");
        Map<String, String> result = mapsApi.mapComputeIfPresent(map, entryToAdd);

        //then
        assertEquals(result, map);
        assertFalse(result.isEmpty());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2 + value3", result.get("key2"));
    }

    @Test
    void testMapPutIfAbsent_NoKey() {

        //given
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //when
        Tuple entryToAdd = new Tuple("key3", "value3");
        Map<String, String> result = mapsApi.mapPutIfAbsent(map, entryToAdd);

        //then
        assertEquals(result, map);
        assertFalse(result.isEmpty());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
        assertEquals("value3", result.get("key3"));
    }

    @Test
    void testMapPutIfAbsent_PresentNoValue() {

        //given
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //when
        Tuple entryToAdd = new Tuple("key2", "value3");
        Map<String, String> result = mapsApi.mapPutIfAbsent(map, entryToAdd);

        //then
        assertEquals(result, map);
        assertFalse(result.isEmpty());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testMapPutIfAbsent_Present() {

        //given
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //when
        Tuple entryToAdd = new Tuple("key2", "value2");
        Map<String, String> result = mapsApi.mapPutIfAbsent(map, entryToAdd);

        //then
        assertEquals(result, map);
        assertFalse(result.isEmpty());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }
}