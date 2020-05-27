//package Stack_and_Queues;

import edu.princeton.cs.algs4.StdIn;

// import Stack_and_Queues.Deque;
// import Stack_and_Queues.RandomizedQueue;

public class Permutation {
    // test module?
    public static void main(String[] args) {
        // read number
        int output_number = Integer.parseInt(args[0]);
        // if (StdIn.readString() == "<") {
        // continue;
        // }

        // read txt file name
        // String filename = StdIn.readString();\
        // System.out.println(args[0]);
        RandomizedQueue<String> rdq = new RandomizedQueue<>();
        while (!StdIn.isEmpty()) {
            rdq.enqueue(StdIn.readString());
        }
        for (int i = 0; i < output_number; i++) {
            System.out.println(rdq.dequeue());
        }
    }
}