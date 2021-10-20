import org.junit.Test;

import static org.junit.Assert.*;

public class DLinkedListTest {
    @Test
    public void test_pushBack() {
        var list = new DLinkedList<Integer>();
        list.pushBack(1);
        list.pushBack(2);
        assertEquals(2, list.getSize());
        assertEquals(1, list.get(0).intValue());
    }

    @Test
    public void test_pushFront() {
        var list = new DLinkedList<Integer>();
        list.pushFront(1);
        list.pushFront(2);
        assertEquals(2, list.getSize());
        assertEquals(2, list.get(0).intValue());
    }

    @Test
    public void test_popFront() {
        var list = new DLinkedList<Integer>();
        list.pushBack(1);
        list.pushBack(2);
        list.popFront();
        assertEquals(1, list.getSize());
        assertEquals(2, list.get(0).intValue());
    }

    @Test
    public void test_popBack() {
        var list = new DLinkedList<Integer>();
        list.pushBack(1);
        list.pushBack(2);
        list.popBack();
        assertEquals(1, list.getSize());
        assertEquals(1, list.get(0).intValue());
    }

    @Test
    public void test_delete() {
        var list = new DLinkedList<Integer>();
        list.pushBack(1);
        list.pushBack(2);
        list.delete(0);
        assertEquals(1, list.getSize());
        assertEquals(2, list.get(0).intValue());
    }

    @Test
    public void test_insert() {
        var list = new DLinkedList<Integer>();
        list.insert(0, 1);
        list.insert(0, 2);
        list.insert(1, 66);
        assertEquals(3, list.getSize());
        assertEquals(66, list.get(1).intValue());
    }
}