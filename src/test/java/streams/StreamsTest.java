package streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class StreamsTest {

    @InjectMocks
    streams.Streams streams;

    @Test
    public void testContainsFive_AllMatchEmptyList() {

        List<Long> longList = new ArrayList<>();
        boolean result = streams.containsFiveAllMatch(longList);

        assertTrue(result);
    }

    @Test
    public void testContainsFive_AllMatchNotOnlyFives() {

        List<Long> longList = new ArrayList<>();

        longList.add(10L);
        longList.add(5L);

        boolean result = streams.containsFiveAllMatch(longList);

        assertFalse(result);
    }

    @Test
    public void testContainsFive_AllMatchOnlyFives() {

        List<Long> longList = new ArrayList<>();

        longList.add(5L);
        longList.add(5L);

        boolean result = streams.containsFiveAllMatch(longList);

        assertTrue(result);
    }

    @Test
    public void testContainsFive_AnyMatchEmptyList() {

        List<Long> longList = new ArrayList<>();

        boolean result = streams.containsFiveAnyMatch(longList);

        assertFalse(result);
    }

    @Test
    public void testContainsFive_AnyMatchNotOnlyFives() {

        List<Long> longList = new ArrayList<>();

        longList.add(10L);
        longList.add(5L);

        boolean result = streams.containsFiveAnyMatch(longList);

        assertTrue(result);
    }

    @Test
    public void testContainsFive_AnyMatchOnlyFives() {

        List<Long> longList = new ArrayList<>();

        longList.add(5L);
        longList.add(5L);

        boolean result = streams.containsFiveAnyMatch(longList);

        assertTrue(result);
    }

    @Test
    public void testMapWithNullElements(){

        List<Integer> result = streams.mapWithNullElements();


        assertNotNull(result);
    }

    @Test
    public void testStreamRetainAll(){

        Streams.InnerObject obj1 = new Streams.InnerObject(1);
        Streams.InnerObject obj2 = new Streams.InnerObject(2);
        Streams.InnerObject obj3 = new Streams.InnerObject(3);
        Streams.InnerObject obj4 = new Streams.InnerObject(4);

        List<Streams.InnerObject> objList = new ArrayList<>();
        objList.add(obj1);
        objList.add(obj2);
        objList.add(obj3);
        objList.add(obj4);

        List<Streams.InnerObject> retainList = new ArrayList<>();
        retainList.add(obj1);
        retainList.add(obj2);

        List<Streams.InnerObject> result = streams.streamRetainAll(objList, retainList);


        assertNotNull(result);
        assertEquals(2, result.size());


    }

}
