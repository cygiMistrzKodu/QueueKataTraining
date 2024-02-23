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
}
