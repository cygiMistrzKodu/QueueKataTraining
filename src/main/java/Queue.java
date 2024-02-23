public class Queue {

    private int addIndex;

    private int removeIndex;

    private int element[] = new int[6];
    public boolean isEmpty() {
        return addIndex == 0;
    }

    public void add(int element) {
        this.element[addIndex++] = element;

    }

    public int size() {
        return addIndex;
    }

    public int remove() {
        addIndex--;
        return element[removeIndex++];

    }
}
