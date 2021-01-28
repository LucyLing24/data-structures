public class LinkedListDeque<T> {

    private class Node {
        private final T item;
        private Node pre;
        private Node next;

        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }

    private int size;
    private final Node head;

    // Creates an empty linked list deque
    public LinkedListDeque() {
        head = new Node(null, null, null);
        head.next = head;
        head.pre = head;
        size = 0;
    }

    // Adds an item of type to the front of the deque
    public void addFirst(T item) {
        Node a = new Node(item, head, head.next);
        head.next.pre = a;
        head.next = a;
        size += 1;
    }

    // Adds an item of type to the back of the deque
    public void addLast(T item) {
        Node a = new Node(item, head.pre, head);
        head.pre.next = a;
        head.pre = a;
        size += 1;
    }

    // Returns true if deque is empty, false otherwise
    public boolean isEmpty() {
        return head.next == head;
    }

    // Returns the number of items in the deque
    public int size() {
        return size;
    }

    // Prints the items in the deque from first to last, separated by a space.
    public void printDeque() {
        Node p = head.next;
        for (int i = 0; i < size; i++) {
            System.out.print(p.item + " ");
            p = p.next;
        }
    }

    // Removes and returns the item at the front of the deque, else returns null
    public T removeFirst() {
        if (head.next == head) {
            return null;
        }
        T a = head.next.item;
        head.next.next.pre = head;
        head.next = head.next.next;
        size -= 1;
        return a;
    }

    // Removes and returns the item at the back of the deque, else returns null
    public T removeLast() {
        if (head.next == head) {
            return null;
        }
        T a = head.pre.item;
        head.pre.pre.next = head;
        head.pre = head.pre.pre;
        size -= 1;
        return a;
    }

    // Gets the item at the given index, begins at index 0
    public T get(int index) {
        Node p = head.next;
        if (index > size - 1) {
            return null;
        }
        for (int i = 0; i < size; i++, p = p.next) {
            if (i == index) {
                return p.item;
            }
        }
        return null;
    }

    // Same as get, but uses recursion
    public T getRecursive(int index) {
        if (index > size - 1) {
            return null;
        }
        T item = null;
        while (index >= 0) {
            item = getRecursive(index--);
        }
        return item;
    }
}
