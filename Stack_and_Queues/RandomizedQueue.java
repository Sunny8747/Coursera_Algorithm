package Stack_and_Queues;

import java.util.Iterator;
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private int queue_size;
    private Node header;
    private Node tail;

    private class Node {
        private final Item item;
        private Node next_node;
        private Node prev_node;

        Node(final Item new_item) {
            this.item = new_item;
            this.next_node = null;
            this.prev_node = null;
        }
    }

    // construct an empty randomized queue
    public RandomizedQueue() {
        final Node init_node = new Node(null);
        this.header = init_node;
        this.tail = init_node;
        this.header.next_node = null;
        this.tail.prev_node = null;
        this.queue_size = 0;
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        if (this.queue_size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // return the number of items on the randomized queue
    public int size() {
        return this.queue_size;
    }

    // add the item
    public void enqueue(final Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        final Node new_node = new Node(item);

        if (this.queue_size == 0) {
            this.header = new_node;
            this.tail = new_node;
        }
        else {
            final Node last_node = this.tail;
            this.tail = new_node;
            new_node.prev_node = last_node;
            last_node.next_node = new_node;
        }
        queue_size++;
    }

    // remove and return a random item
    public Item dequeue() {
        if (this.queue_size == 0) {
            throw new NoSuchElementException();
        }
        Item result = null;
        if (queue_size == 1) {
            result = this.header.item;
            this.header = null;
            this.tail = null;
        }
        else {
            final int rand_num = StdRandom.uniform(1, queue_size + 1);
            // Iterator<Item> iter = this.iterator();

            // header node
            if (rand_num == 1) {
                result = this.header.item;
                this.header = this.header.next_node;
                this.header.prev_node = null;
            }
            else {
                // tail node
                if (rand_num == queue_size) {
                    result = this.tail.item;
                    this.tail = this.tail.prev_node;
                    this.tail.next_node = null;
                }
                else {
                    int count = 1;
                    Node temp_node = header;
                    while (rand_num != count) {
                        count++;
                        temp_node = temp_node.next_node;
                    }
                    result = temp_node.item;
                    final Node prev_node = temp_node.prev_node;
                    final Node next_node = temp_node.next_node;
                    prev_node.next_node = next_node;
                    next_node.prev_node = prev_node;
                }
            }
        }
        queue_size--;
        return result;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (this.queue_size == 0) {
            throw new NoSuchElementException("sample() size = 0 NoSuchElementException\n");
        }
        Item result = null;
        if (queue_size == 1) {
            result = this.header.item;
            this.header = null;
            this.tail = null;
        }
        else {
            int rand_num = StdRandom.uniform(1, queue_size + 1);
            final Iterator<Item> iter = this.iterator();
            while (rand_num != 0) {
                rand_num--;
                result = iter.next();
            }
        }
        return result;
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }

    private class RandomizedQueueIterator implements Iterator<Item> {
        private Node current = header;

        // non-null : true null : false
        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (current == null) {
                throw new NoSuchElementException("Iterator next() NoSuchElementException\n");
            }
            final Item item = current.item;
            current = current.next_node;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException("remove() is Unsupported Oeration\n");
        }
    }

    // unit testing (required)
    public static void main(final String[] args) {
        final RandomizedQueue<Integer> rdq = new RandomizedQueue<>();
        for (int i = 0; i < 10; i++) {
            rdq.enqueue(i);
        }
        Iterator<Integer> iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.sample());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");

        System.out.printf("%d\n", rdq.dequeue());
        iter = rdq.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.printf("\n");
        System.out.printf("size = %d\n", rdq.size());
    }
}