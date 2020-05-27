# Stack and Queues

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

- 장점 : 일관된 퍼포머스를 유지가능 (Maintain consistent performance)
- 단점 : Use More memory(pointer), More slower

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
- Cons : Less wated memory, 리사이징 하는순간 많은 작업이 걸림 따라서 비연속적인 작업 발생 (Resizing makes uncontinueous operation)

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

## 3. Generic (나중에 추가로 따로정리)

- Make function style for **modular programming**.
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

## 4. Iterator (나중에 추가로 따로정리해야됨)

- iterator : hasNext(), next() 함수가 존재하게 만드는 인터페이스
- iterable : public Iterator iterator() 가 존재하게 만드는 인터페이스
- interface

  - 클래스의 뼈대 'blueprint' 라고 볼수있다
  - **_추상화(virtualization)_** 를 하기위함이다.
  - **다중상속** 을 지원한다

  https://javatpoint.com/interface-in-java

```java
    public class Stack<Item> implements Iterable<Item>{
        ...
        public Iterator<Item> iterator() { return new ListIterator();}

        //이것이 위에서 콜링된다 전형적인 encapsulation
        private class ListIterator implements Iterator<Item>{
            private Node current = first;

            public boolean hasNext(){...}
            public Item next(){...}
            public void remove(){...}
        }
    }
```

## 5. Aplication

- java.util.List
- java.util.Stack -> Bad designed
- java.util.Queue : Interface
- java.util.Bag

<hr/>

## 6. Assignment

- complete later
