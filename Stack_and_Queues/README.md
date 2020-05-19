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

    }
```
<hr/>

## 3. Generic
- Make function style for modular programming.
- Undetermined data type.
- Similar to 'Template' in C++

<hr/>

## 4. Iterator
- pros and cons : linked list base, resizing array base
- generics - template of cpp? and in java generic type making array 불가
- iterator 중요
- 모듈러프로그래밍 관련 한줄적으면 좋을듯?

<hr/>
