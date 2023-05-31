import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    List<Time> list = new LinkedList<>();
    List<Integer> result = new ArrayList<>();
    RuntimeException m;

    @Test
    void everyBranchStatement() {
        list.add(new Time(2,2,2));
        result.add(7322);
        assertEquals(result, SILab2.function(list));

        list.add(new Time(24,0,0));
        result.add(86400);
        assertEquals(result, SILab2.function(list));

        list.add(new Time(-1,10,10));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list));
        assertTrue(m.getMessage().contains("The hours are smaller than the minimum"));

        List<Time> list1 = new LinkedList<>();
        list1.add(new Time(25,23,23));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list1));
        assertTrue(m.getMessage().contains("The hours are grater than the maximum"));

        List<Time> list2 = new LinkedList<>();
        list2.add(new Time(23,-1,10));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list2));
        assertTrue(m.getMessage().contains("The minutes are not valid!"));

        List<Time> list3 = new LinkedList<>();
        list3.add(new Time(23,23,60));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list3));
        assertTrue(m.getMessage().contains("The seconds are not valid"));

        List<Time> list4 = new LinkedList<>();
        list4.add(new Time(24,1,1));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list4));
        assertTrue(m.getMessage().contains("The time is greater than the maximum"));

        List<Time> list5 = new LinkedList<>();
        List<Integer> r = new ArrayList<>();
        assertEquals(r, SILab2.function(list5));
    }
    @Test
    void multipleCondition(){

        list.add(new Time(-1,1,24));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list));
        assertTrue(m.getMessage().contains("The hours are smaller than the minimum"));

        List<Time> list1 = new LinkedList<>();
        list1.add(new Time(25,10,10));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list1));
        assertTrue(m.getMessage().contains("The hours are grater than the maximum"));

        List<Time> list2 = new LinkedList<>();
        list2.add(new Time(3,-2,50));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list2));
        assertTrue(m.getMessage().contains("The minutes are not valid!"));

        List<Time> list3 = new LinkedList<>();
        list3.add(new Time(2,10,61));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list3));
        assertTrue(m.getMessage().contains("The seconds are not valid"));

        List<Time> list4 = new LinkedList<>();
        list4.add(new Time(24,1,1));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list4));
        assertTrue(m.getMessage().contains("The time is greater than the maximum"));

        List<Integer> r = new ArrayList<>();

        List<Time> list5 = new LinkedList<>();
        list5.add(new Time(2,2,2));
        r.add(7322);
        assertEquals(r, SILab2.function(list5));

        List<Time> list6 = new LinkedList<>();
        list6.add(new Time(24,5,0));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list6));
        assertTrue(m.getMessage().contains("The time is greater than the maximum"));

        List<Time> list7 = new LinkedList<>();
        list7.add(new Time(24,0,5));
        m = assertThrows(RuntimeException.class, () -> SILab2.function(list7));
        assertTrue(m.getMessage().contains("The time is greater than the maximum"));
    }
}