public class Queue {

    private int size;
    public boolean isEmpty() {
        return true;
    }

    public void add(int element) {
        size++;

    }

    public int size() {
        return size;
    }

    public int remove() {
        return size--;
    }
}
