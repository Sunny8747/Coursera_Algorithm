Stack and Queues
===========
Stack, Queue data structure
<hr/>

## 1. Stack, Queue
### 1) Stack
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

### 2) Queue
- FIFO : Fisrt In First Out
-     dequeue() <--- [ a ][ b ][ c ][ d ][ e ][ f ][ g ]   <--- Enqueue()
```c++
    class Queue(){
        Queue(); //create an empty queue

        void enqueue(Item item);

        Item dequeue();

        bool isEmpty();

        int size();
    }
```
<hr/>

## 2. Linked List, Resizing Array

### 1) Linked List
- Pros : Continueous uniform operation
- Cons : Use More memory(pointer), More slower

```c++
    class LinkedList(){
        class Node(){
            Item item;
            Node next;
            Node previous; // double linked list
        }

        Node first = null;

        void push/enqueue(Item item);

        Item pop/dequeue();

        bool isEmpty();

        int size();
    }
```

### 2) Resizing Array
- Pros : More faster
- Cons : Less wated memory, Resizing makes uncontinueous operation

```c++
    class Resizing_Array(){
        int MAX_SIZE;

        void resize(Item[] old_array, int capacity) {
            Item[] new_array = new Item[capacity];
            if(capacity < MAX_SIZE) {
                for(int i = 0; i < capacity; i++) {
                    new_array[i] = old_array[i];
                }
            }
            else {
                for(int i = 0; i < capacity/2; i++){
                    new_array[i] = old_array[i];
                }
            }
            delete old_array;
            MAX_SIZE = capacity;
        }

        void push(Item item){
            if(Max_SIZE == array.length()) {
                resize(array, MAX_SIZE * 2);
                array[MAX_SIZE] = item;
            }
        }

        Item pop() {
            if(array.length() <= MAX_SIZE/4 && Max_SIZE/4 > 1) {
                resize(array, MAX_SIZE/4);
                array[MAX_SIZE] = item;
            }
        }
    }
```
<hr/>

## 3. Generic
- Make function style for __modular programming__.
- Undetermined data type.
- Similar to 'Template' in C++
- Java -> Generic
- C++ -> template (! it has differences but similar)

```java
    //java
    public class something<Item> {
        private Item[] item;

        public something(int size){
            item = (Item[]) new Object[size];//!!! Java have to Type casting
        }

        public void push(Item item);

        public Item pop();
        ...
    } 
```

```c++
    //c++ template
    using namespace std;
    template <typename T>
    class something {
        T* item;

        //constructor
        public:
            somthing(int n = 1) : item(new T[n]) {}

        void push(T item);

        T pop();
        ...
    }
```
<hr/>

## 4. Iterator
- iterator 중요

<hr/>
