package streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

}
