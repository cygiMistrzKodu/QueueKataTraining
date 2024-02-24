import java.util.Arrays;

public class Queue {

    private int addIndex;

    private int removeIndex;

    private int elements[] = new int[6];

    public Queue() {
        Arrays.fill(this.elements,-1);
    }

    public boolean isEmpty() {
        return addIndex == 0;
    }

    public void add(int element) {

        if (addIndex >= elements.length) {
            addIndex = 0;
        }

        this.elements[addIndex++] = element;
        removeIndex = 0;

    }

    public int size() {
        return addIndex;
    }

    public int remove() {

        if (addIndex <= 0) {
            addIndex = 0;
        } else {

            addIndex--;
        }

        if (removeIndex >= elements.length) {
            removeIndex = 0;
        }

        int  removedElement = elements[removeIndex++];
        this.elements[removeIndex-1] = -1;

        return removedElement;

    }
}
