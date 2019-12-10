package collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CompareListsTest {

    @Test
    public void testCompareLists_Same() {

        //given
        CompareLists compareLists = new CompareLists();

        List<String> list1 = new ArrayList();
        list1.addAll(Arrays.asList("A", "B", "C"));

        List<String> list2 = new ArrayList();
        list2.addAll(Arrays.asList("A", "B", "C"));

        //when
        boolean result = compareLists.compareLists(list1, list2);

        //then
        assertTrue(result);

    }

    @Test
    public void testCompareLists_Not_Same() {

        //given
        CompareLists compareLists = new CompareLists();

        List<String> list1 = new ArrayList();
        list1.addAll(Arrays.asList("A", "B", "C"));

        List<String> list2 = new ArrayList();
        list2.addAll(Arrays.asList("A", "B"));

        //when
        boolean result = compareLists.compareLists(list1, list2);

        //then
        assertFalse(result);

    }

    @Test
    public void testCompareLists_Same_Not_Ordered() {

        //given
        CompareLists compareLists = new CompareLists();

        List<String> list1 = new ArrayList();
        list1.addAll(Arrays.asList("A", "B", "C"));

        List<String> list2 = new ArrayList();
        list2.addAll(Arrays.asList("C", "A", "B"));

        //when
        boolean result = compareLists.compareLists(list1, list2);

        //then
        assertTrue(result);

    }
}
