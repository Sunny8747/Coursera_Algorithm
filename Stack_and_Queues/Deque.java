//package Stack_and_Queues;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private Node header;
    private Node tail;
    private int deque_size;

    private class Node {
        private final Item item;
        private Node next_node;
        private Node prev_node;

        Node(Item new_item) {
            this.item = new_item;
            this.next_node = null;
            this.prev_node = null;
        }
    }

    // construct an empty deque
    public Deque() {
        this.header = null;
        this.tail = null;
        this.deque_size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        if (this.deque_size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // return the number of items on the deque
    public int size() {
        return this.deque_size;
    }

    // add the item to the front
    // 헤더 테일 싹다시 해야됨
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        Node new_node = new Node(item);

        if (this.deque_size == 0) {// empty header tail
            this.header = new_node;
            this.tail = new_node;
        }
        else if (this.deque_size == 1) {// header tail points same node
            this.header = new_node;
            new_node.next_node = this.tail;
            this.tail.prev_node = new_node;
        }
        else {
            Node old_first_node = this.header;
            this.header = new_node;
            new_node.next_node = old_first_node;
            old_first_node.prev_node = new_node;
        }
        deque_size++;
    }

    // add the item to the back
    // [old_last] -> [new_node] -> [tail]
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        Node new_node = new Node(item);

        if (this.deque_size == 0) {// empty header tail
            this.header = new_node;
            this.tail = new_node;
        }
        else if (this.deque_size == 1) {// header tail points same node
            this.tail = new_node;
            new_node.prev_node = this.header;
            this.header.next_node = new_node;
        }
        else {
            Node old_last_node = this.tail;
            this.tail = new_node;
            new_node.prev_node = old_last_node;
            old_last_node.next_node = new_node;
        }
        deque_size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (this.deque_size <= 0) {
            throw new NoSuchElementException();
        }

        Item item = this.header.item;

        if (deque_size == 1) {
            this.header = null;
            this.tail = null;
        }
        else {
            Node second_node = this.header.next_node;
            this.header = second_node;
            second_node.prev_node = null;
        }
        deque_size--;
        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (this.deque_size <= 0) {
            throw new NoSuchElementException();
        }

        Item item = this.tail.item;

        if (deque_size == 1) {
            this.header = null;
            this.tail = null;
        }
        else {
            Node second_node = this.tail.prev_node;
            this.tail = second_node;
            second_node.next_node = null;
        }
        deque_size--;
        return item;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current = header;

        // non-null : true null : false
        public boolean hasNext() {
            if (current == header) {
                if (header.item == null) {
                    return false;
                }
            }
            return current != null;
        }

        public Item next() {
            if (current == null) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next_node;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException("remove() is Unsupported Oeration\n");
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        deque.addFirst(1);
        deque.addLast(99);
        deque.addFirst(2);
        deque.addLast(88);

        deque.removeFirst();

        deque.removeLast();

        deque.removeFirst();

        deque.removeLast();

        deque.addLast(50);
        deque.addLast(60);
        deque.addFirst(70);
        Iterator<Integer> iter = deque.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d\n", iter.next());
        }
        System.out.printf("\n");

        deque.removeFirst();

        iter = deque.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d\n", iter.next());
        }

        deque.removeFirst();
        deque.removeFirst();

        // iter = deque.iterator();
        // int something = iter.next();
        System.out.printf("tested all Exception");
    }
}
