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
        assertEquals(1,queue.size());
    }

    @Test
    public void addTwoElementsSizeIs2(){
        queue.add(0);
        queue.add(1);
        assertEquals(2,queue.size());
    }

    @Test
    void addTwoElementAndRemoveTwoAndIsEmpty() {
        queue.add(0);
        queue.add(1);
        queue.remove();
        queue.remove();
        assertEquals(0,queue.size());

    }
  }
