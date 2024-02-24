import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private Queue queue = new Queue();

    @Test
    void canCreateQueue() {

        assertTrue(queue.isEmpty());


    }

    @Test
    public void canAddElementToQueue() {
        queue.add(0);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void addTwoElementsSizeIs2() {
        queue.add(0);
        queue.add(1);
        assertEquals(2, queue.size());
    }

    @Test
    void addTwoElementAndRemoveTwoAndQueueIsEmpty() {
        queue.add(0);
        queue.add(1);
        queue.remove();
        queue.remove();
        assertTrue(queue.isEmpty());

    }

    @Test
    void addOneElementAndRemoveReturnThisElement() {
        queue.add(4);
        assertEquals(4, queue.remove());
    }

    @Test
    void addTwoElementsOnOneRemoveReturnFirst() {
        queue.add(0);
        queue.add(1);

        assertEquals(0, queue.remove());
    }

    @Test
    void add3ElementsRemove2timesQueueSizeIs1() {
        queue.add(3);
        queue.add(4);
        queue.add(7);
        queue.remove();

        assertEquals(4, queue.remove());
        assertEquals(1,queue.size());
    }

    @Test
    void ifAddMoreElementThanQueueSizeLastElementMoveOnFront() {

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        assertEquals(7, queue.remove());
    }

    @Test
    void addOneRemoveOneAddTwoRemoveOne() {
       queue.add(1);
       queue.remove();
       queue.add(3);
       queue.add(4);

       assertEquals(3,queue.remove());
    }

    @Test
    void whenRemovePassMaxCapacityItMoveOnStartOfQueue() {
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        assertEquals(-1,queue.remove());
    }

    @Test
    void whenRemovePassMaxCapacityAndAdElementThenThisElementIsRemoved() {
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add(8);

        assertEquals(8,queue.remove());
    }

    @Test
    void addMoreElementsThanCapacityThenQueueRestart() {
        queue.add(4);
        queue.remove();
        queue.remove();
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);

        assertEquals(14,queue.remove());
        assertEquals(15,queue.remove());
        assertEquals(16,queue.remove());
        assertEquals(11,queue.remove());
        assertEquals(12,queue.remove());
        assertEquals(13,queue.remove());
        assertEquals(-1,queue.remove());


    }
}
