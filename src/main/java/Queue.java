public class Queue {

    private int addIndex;

    private int removeIndex;

    private int elements[] = new int[6];

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
        addIndex--;
        return elements[removeIndex++];

    }
}
