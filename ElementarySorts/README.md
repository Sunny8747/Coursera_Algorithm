# Stack and Queues

Stack, Queue data structure

<hr/>

## 1. Selection, Insertion, Shell Sort

### 1) Selection

- LIFO : Last In First Out
-     [ a ][ b ][ c ][ d ][ e ][ f ][ g ]   <- push() or pop()

```c++
    class Stack(){
        Stack(); //create an empty stack

        void push(Item item);

        Item pop();

        bool isEmpty();

        int size();
    }
```

<hr/>
