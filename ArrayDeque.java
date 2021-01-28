public class ArrayDeque<T> {

    private int size;
    private int front;
    private int back;
    private T[] items;

    // Creates an empty array deque
    public ArrayDeque() {
        items = (T[]) new Object[8];
        front = 0;
        back = 1;
        size = 0;
    }

    // Finds out the next one
    private int NextOne(int a) {
        return (a + 1) % items.length;
    }

    // Finds out the previous one
    private int PreOne(int a) {
        return (a - 1 + items.length) % items.length;
    }

    // Resizes the array
    private void resize(int length) {
        T[] NewItems = (T[]) new Object[length];
        int OldIndex = NextOne(front);
        for (int i = 0; i < size; i++) {
            NewItems[i] = items[OldIndex];
            OldIndex = NextOne(OldIndex);
        }
        this.items = NewItems;
        front = items.length - 1;
        back = size;
    }

    // Adds an item of type to the front of the deque
    public void addFirst(T item) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[front] = item;
        front = PreOne(front);
        size += 1;
    }

    // Adds an item of type to the back of the deque
    public void addLast(T item) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[back] = item;
        back = NextOne(back);
        size += 1;
    }

    // Returns true if deque is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the number of items in the deque
    public int size() {
        return size;
    }

    // Prints the items in the deque from first to last, separated by a space.
    public void printDeque() {
        int i = NextOne(front);
        for (int j = 0; j < size; j++) {
            System.out.print(items[i] + " ");
            i = NextOne(i);
        }
    }

    // Removes and returns the item at the front of the deque, else returns null
    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        T a = items[NextOne(front)];
        items[NextOne(front)] = null;
        front = NextOne(front);
        size -= 1;
        if (items.length >= 16 && size < (items.length / 4)) {
            resize(items.length / 2);
        }
        return a;
    }

    // Removes and returns the item at the back of the deque, else returns null
    public T removeLast() {
        if (size == 0) {
            return null;
        }
        T a = items[PreOne(back)];
        items[PreOne(back)] = null;
        back = PreOne(back);
        size -= 1;
        if (items.length >= 16 && size < (items.length / 4)) {
            resize(items.length / 2);
        }
        return a;
    }

    // Gets the item at the given index, begins at index 0
    public T get(int index) {
        if (index >= size) {
            return null;
        }
        int start = NextOne(front);
        return items[(start + index) % items.length];
    }
}
