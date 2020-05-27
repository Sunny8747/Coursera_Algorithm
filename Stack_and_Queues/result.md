See the Assessment Guide for information on how to interpret this report.

ASSESSMENT SUMMARY

Compilation: PASSED
API: PASSED

Spotbugs: PASSED
PMD: PASSED
Checkstyle: FAILED (0 errors, 32 warnings)

Correctness: 37/45 tests passed
Memory: 50/50 tests passed
Timing: 168/193 tests passed

Aggregate score: 86.74%
[Compilation: 5%, API: 5%, Spotbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

## The following files were submitted:

5.6K May 27 22:09 Deque.java
809 May 27 22:09 Permutation.java
7.5K May 27 22:09 RandomizedQueue.java

---

- COMPILING

---

% javac Deque.java
\*-----------------------------------------------------------

% javac RandomizedQueue.java
\*-----------------------------------------------------------

% javac Permutation.java
\*-----------------------------------------------------------

================================================================

Checking the APIs of your programs.
\*-----------------------------------------------------------
Deque:

RandomizedQueue:

Permutation:

================================================================

---

- CHECKING STYLE AND COMMON BUG PATTERNS

---

% spotbugs _.class
_-----------------------------------------------------------

================================================================

% pmd .
\*-----------------------------------------------------------

================================================================

% checkstyle _.java
_-----------------------------------------------------------
[WARN] Deque.java:1:3: '//' or '/_' is not followed by whitespace. [WhitespaceAfter][warn] Deque.java:9:17: The instance variable 'deque_size' must start with a lowercase letter and use camelCase. [MemberName][warn] Deque.java:13:22: The instance variable 'next_node' must start with a lowercase letter and use camelCase. [MemberName][warn] Deque.java:14:22: The instance variable 'prev_node' must start with a lowercase letter and use camelCase. [MemberName][warn] Deque.java:16:19: The parameter variable 'new_item' must start with a lowercase letter and use camelCase. [ParameterName][warn] Deque.java:32:9: Conditional logic can be removed. [SimplifyBooleanReturn][warn] Deque.java:52:14: The local variable 'new_node' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] Deque.java:54:35: '{' is not followed by whitespace. [WhitespaceAround][warn] Deque.java:58:40: '{' is not followed by whitespace. [WhitespaceAround][warn] Deque.java:64:18: The local variable 'old_first_node' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] Deque.java:79:14: The local variable 'new_node' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] Deque.java:81:35: '{' is not followed by whitespace. [WhitespaceAround][warn] Deque.java:85:40: '{' is not followed by whitespace. [WhitespaceAround][warn] Deque.java:91:18: The local variable 'old_last_node' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] Deque.java:112:18: The local variable 'second_node' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] Deque.java:133:18: The local variable 'second_node' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] Permutation.java:1:3: '//' or '/_' is not followed by whitespace. [WhitespaceAfter][warn] Permutation.java:12:13: The local variable 'output_number' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] RandomizedQueue.java:1:3: '//' or '/\*' is not followed by whitespace. [WhitespaceAfter][warn] RandomizedQueue.java:8:17: The instance variable 'queue_size' must start with a lowercase letter and use camelCase. [MemberName][warn] RandomizedQueue.java:14:22: The instance variable 'next_node' must start with a lowercase letter and use camelCase. [MemberName][warn] RandomizedQueue.java:15:22: The instance variable 'prev_node' must start with a lowercase letter and use camelCase. [MemberName][warn] RandomizedQueue.java:17:25: The parameter variable 'new_item' must start with a lowercase letter and use camelCase. [ParameterName][warn] RandomizedQueue.java:26:20: The local final variable 'init_node' must start with a lowercase letter and use camelCase (or be ALL_UPPERCASE if it is a constant). [LocalFinalVariableName][warn] RandomizedQueue.java:36:9: Conditional logic can be removed. [SimplifyBooleanReturn][warn] RandomizedQueue.java:55:20: The local final variable 'new_node' must start with a lowercase letter and use camelCase (or be ALL_UPPERCASE if it is a constant). [LocalFinalVariableName][warn] RandomizedQueue.java:62:24: The local final variable 'last_node' must start with a lowercase letter and use camelCase (or be ALL_UPPERCASE if it is a constant). [LocalFinalVariableName][warn] RandomizedQueue.java:82:23: The local final variable 'rand_num' must start with a lowercase letter and use camelCase (or be ALL_UPPERCASE if it is a constant). [LocalFinalVariableName][warn] RandomizedQueue.java:100:26: The local variable 'temp_node' must start with a lowercase letter and use camelCase. [LocalVariableName][warn] RandomizedQueue.java:106:32: The local final variable 'prev_node' must start with a lowercase letter and use camelCase (or be ALL_UPPERCASE if it is a constant). [LocalFinalVariableName][warn] RandomizedQueue.java:107:32: The local final variable 'next_node' must start with a lowercase letter and use camelCase (or be ALL_UPPERCASE if it is a constant). [LocalFinalVariableName][warn] RandomizedQueue.java:129:17: The local variable 'rand_num' must start with a lowercase letter and use camelCase. [LocalVariableName]
Checkstyle ends with 0 errors and 32 warnings.

% custom checkstyle checks for Deque.java
\*-----------------------------------------------------------

% custom checkstyle checks for RandomizedQueue.java
\*-----------------------------------------------------------
[INFO] RandomizedQueue.java:131: Using a loop in this method might be a performance bug. [Performance]

% custom checkstyle checks for Permutation.java
\*-----------------------------------------------------------

================================================================

---

- TESTING CORRECTNESS

---

Testing correctness of Deque
\*-----------------------------------------------------------
Running 17 total tests.

Tests 1-6 make random calls to addFirst(), addLast(), removeFirst(),
removeLast(), isEmpty(), and size(). The probabilities of each
operation are (p1, p2, p3, p4, p5, p6), respectively.

Test 1: check random calls to addFirst(), addLast(), and size()

- 5 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
- 50 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
- 500 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
- 1000 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
  ==> passed

Test 2: check random calls to addFirst(), removeFirst(), and isEmpty()

- 5 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
- 50 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
- 500 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
- 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
- 5 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
- 50 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
- 500 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
- 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
  ==> passed

Test 3: check random calls to addFirst(), removeLast(), and isEmpty()

- 5 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
- 50 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
- 500 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
- 1000 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
- 5 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
- 50 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
- 500 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
- 1000 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
  ==> passed

Test 4: check random calls to addLast(), removeLast(), and isEmpty()

- 5 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
- 50 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
- 500 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
- 1000 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
- 5 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
- 50 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
- 500 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
- 1000 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
  ==> passed

Test 5: check random calls to addLast(), removeFirst(), and isEmpty()

- 5 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
- 50 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
- 500 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
- 1000 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
- 5 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
- 50 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
- 500 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
- 1000 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
  ==> passed

Test 6: check random calls to addFirst(), addLast(), removeFirst(),
removeLast(), isEmpty(), and size()

- 5 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
- 50 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
- 500 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
- 1000 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
- 5 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
- 50 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
- 500 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
- 1000 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
  ==> passed

Test 7: check removeFirst() and removeLast() from an empty deque

- removeFirst()
- removeLast()
  ==> passed

Test 8: check whether two Deque objects can be created at the same time

- n = 10
- n = 1000
  ==> passed

Test 9: check iterator() after n calls to addFirst()

- n = 10
- n = 50
  ==> passed

Test 10: check iterator() after each of m intermixed calls to
addFirst(), addLast(), removeFirst(), and removeLast()

- m = 20

  java.lang.NullPointerException

  Deque$DequeIterator.hasNext(Deque.java:152)
    SafeIterable$SafeIterator.hasNext(SafeIterable.java:54)
  UtilCOS.compareAsSequences(UtilCOS.java:801)
  UtilCOS.compareAsSequences(UtilCOS.java:794)
  TestDeque.checkIteratorAfterIntermixedOperations(TestDeque.java:278)
  TestDeque.test10(TestDeque.java:715)
  TestDeque.main(TestDeque.java:977)

  - sequence of operations was:
    Deque deque<Integer> = new Deque<Integer>()
    deque.addFirst(1)
    deque.removeFirst() ==> 1

- m = 50

  java.lang.NullPointerException

  Deque$DequeIterator.hasNext(Deque.java:152)
    SafeIterable$SafeIterator.hasNext(SafeIterable.java:54)
  UtilCOS.compareAsSequences(UtilCOS.java:801)
  UtilCOS.compareAsSequences(UtilCOS.java:794)
  TestDeque.checkIteratorAfterIntermixedOperations(TestDeque.java:278)
  TestDeque.test10(TestDeque.java:716)
  TestDeque.main(TestDeque.java:977)

  - sequence of operations was:
    Deque deque<Integer> = new Deque<Integer>()
    deque.addLast(1)
    deque.removeFirst() ==> 1

- m = 100

  java.lang.NullPointerException

  Deque$DequeIterator.hasNext(Deque.java:152)
    SafeIterable$SafeIterator.hasNext(SafeIterable.java:54)
  UtilCOS.compareAsSequences(UtilCOS.java:801)
  UtilCOS.compareAsSequences(UtilCOS.java:794)
  TestDeque.checkIteratorAfterIntermixedOperations(TestDeque.java:278)
  TestDeque.test10(TestDeque.java:717)
  TestDeque.main(TestDeque.java:977)

  - sequence of operations was:
    Deque deque<Integer> = new Deque<Integer>()
    deque.addFirst(1)
    deque.addFirst(2)
    deque.removeLast() ==> 1
    deque.removeFirst() ==> 2

- m = 1000

  java.lang.NullPointerException

  Deque$DequeIterator.hasNext(Deque.java:152)
    SafeIterable$SafeIterator.hasNext(SafeIterable.java:54)
  UtilCOS.compareAsSequences(UtilCOS.java:801)
  UtilCOS.compareAsSequences(UtilCOS.java:794)
  TestDeque.checkIteratorAfterIntermixedOperations(TestDeque.java:278)
  TestDeque.test10(TestDeque.java:718)
  TestDeque.main(TestDeque.java:977)

  - sequence of operations was:
    Deque deque<Integer> = new Deque<Integer>()
    deque.addLast(1)
    deque.removeFirst() ==> 1

==> FAILED

Test 11: create two nested iterators to same deque

- n = 10
- n = 50
  ==> passed

Test 12: create two parallel iterators to same deque
==> passed

Test 13: create an iterator and check calls to next() and hasNext()

- 10 consecutive calls to hasNext() on a deque of size 10
- 10 consecutive calls to next() on a deque of size 10
- 50 random intermixed calls to next() and hasNext() on a deque of size 10
- 1000 random intermixed calls to next() and hasNext() on a deque of size 100
  ==> passed

Test 14: create Deque objects of different parameterized types
==> passed

Test 15: call addFirst() and addLast() with null argument
==> passed

Test 16: check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 17: call iterator() when the deque is empty

    java.lang.NullPointerException

    Deque$DequeIterator.hasNext(Deque.java:152)
    TestDeque.test17(TestDeque.java:922)
    TestDeque.main(TestDeque.java:998)

==> FAILED

Total: 15/17 tests passed!

================================================================
Testing correctness of RandomizedQueue
\*-----------------------------------------------------------
Running 19 total tests.

Tests 1-4 make random calls to enqueue(), dequeue(), sample(),
isEmpty(), and size(). The probabilities of each operation are
(p1, p2, p3, p4, p5), respectively.

Test 1: check random calls to enqueue() and size()

- 5 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
- 50 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
- 500 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
- 1000 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
  ==> passed

Test 2: check random calls to enqueue() and dequeue()

- 5 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
- 50 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
- 500 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
- 1000 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
- 5 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
- 50 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
- 500 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
- 1000 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
  ==> passed

Test 3: check random calls to enqueue(), sample(), and size()

- 5 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
- 50 random calls (0.8, 0.0, 0.1, 0.0, 0.1)


    java.lang.NullPointerException

    RandomizedQueue.enqueue(RandomizedQueue.java:65)
    TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:106)
    TestRandomizedQueue.test3(TestRandomizedQueue.java:861)
    TestRandomizedQueue.main(TestRandomizedQueue.java:1306)

    - failed on operation 4 of 50
    - sequence of dequeue operations was:
         RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>()
         rq.size()        ==> 0
         rq.enqueue(15)
         rq.sample()      ==> 15
         rq.enqueue(0)

- 500 random calls (0.8, 0.0, 0.1, 0.0, 0.1)


    java.lang.NullPointerException

    RandomizedQueue.enqueue(RandomizedQueue.java:65)
    TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:106)
    TestRandomizedQueue.test3(TestRandomizedQueue.java:862)
    TestRandomizedQueue.main(TestRandomizedQueue.java:1306)

    - failed on operation 3 of 500
    - sequence of dequeue operations was:
         RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>()
         rq.enqueue(42)
         rq.sample()      ==> 42
         rq.enqueue(233)

- 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
- 5 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
- 50 random calls (0.1, 0.0, 0.8, 0.0, 0.1)


    java.lang.NullPointerException

    RandomizedQueue.sample(RandomizedQueue.java:124)
    TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:154)
    TestRandomizedQueue.test3(TestRandomizedQueue.java:865)
    TestRandomizedQueue.main(TestRandomizedQueue.java:1306)

    - failed on operation 5 of 50
    - sequence of dequeue operations was:
         RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>()
         rq.size()        ==> 0
         rq.enqueue(24)
         rq.size()        ==> 1
         rq.sample()      ==> 24
         rq.sample()

- 500 random calls (0.1, 0.0, 0.8, 0.0, 0.1)


    java.lang.NullPointerException

    RandomizedQueue.sample(RandomizedQueue.java:124)
    TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:154)
    TestRandomizedQueue.test3(TestRandomizedQueue.java:866)
    TestRandomizedQueue.main(TestRandomizedQueue.java:1306)

    - failed on operation 3 of 500
    - sequence of dequeue operations was:
         RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>()
         rq.enqueue(482)
         rq.sample()      ==> 482
         rq.sample()

- 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.1)

  java.lang.NullPointerException

  RandomizedQueue.enqueue(RandomizedQueue.java:65)
  TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:106)
  TestRandomizedQueue.test3(TestRandomizedQueue.java:867)
  TestRandomizedQueue.main(TestRandomizedQueue.java:1306)

  - failed on operation 3 of 1000
  - sequence of dequeue operations was:
    RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>()
    rq.enqueue(44)
    rq.sample() ==> 44
    rq.enqueue(211)

==> FAILED

Test 4: check random calls to enqueue(), dequeue(), sample(), isEmpty(), and size()

- 5 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
- 50 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
- 500 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
- 1000 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
- 5 random calls (0.1, 0.6, 0.1, 0.1, 0.1)
- 50 random calls (0.1, 0.6, 0.1, 0.1, 0.1)


    java.lang.NullPointerException

    RandomizedQueue.dequeue(RandomizedQueue.java:77)
    TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:117)
    TestRandomizedQueue.test4(TestRandomizedQueue.java:879)
    TestRandomizedQueue.main(TestRandomizedQueue.java:1309)

    - failed on operation 34 of 50

- 500 random calls (0.1, 0.6, 0.1, 0.1, 0.1)


    java.lang.NullPointerException

    RandomizedQueue.sample(RandomizedQueue.java:124)
    TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:154)
    TestRandomizedQueue.test4(TestRandomizedQueue.java:880)
    TestRandomizedQueue.main(TestRandomizedQueue.java:1309)

    - failed on operation 8 of 500
    - sequence of dequeue operations was:
         RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>()
         rq.enqueue(390)
         rq.enqueue(330)
         rq.dequeue()     ==> 390
         rq.dequeue()     ==> 330
         rq.size()        ==> 0
         rq.enqueue(69)
         rq.sample()      ==> 69
         rq.sample()

- 1000 random calls (0.1, 0.6, 0.1, 0.1, 0.1)

  java.lang.NullPointerException

  RandomizedQueue.dequeue(RandomizedQueue.java:77)
  TestRandomizedQueue.checkRandomIntermixedOperations(TestRandomizedQueue.java:117)
  TestRandomizedQueue.test4(TestRandomizedQueue.java:881)
  TestRandomizedQueue.main(TestRandomizedQueue.java:1309)

  - failed on operation 130 of 1000

==> FAILED

Test 5: call dequeue() and sample() from an empty randomized queue

- dequeue()
- sample()
  ==> passed

Test 6: create multiple randomized queue objects at the same time

- n = 10
- n = 100
  ==> passed

Test 7: check that iterator() returns correct items after a sequence
of n enqueue() operations

- n = 10
- n = 50
  ==> passed

Test 8: check that iterator() returns correct items after sequence
of m enqueue() and dequeue() operations

- m = 10
- m = 1000
  ==> passed

Test 9: create two nested iterators over the same randomized queue

- n = 10

  - two inner iterators return the same sequence of items
  - they should return the same set of items but in a
    different order

- n = 50
  - two inner iterators return the same sequence of items
  - they should return the same set of items but in a
    different order

==> FAILED

Test 10: create two parallel iterators over the same randomized queue

- n = 10

  - two iterators return the same sequence of values
  - they should return the same set of values but in a
    different order

- n = 50
  - two iterators return the same sequence of values
  - they should return the same set of values but in a
    different order

==> FAILED

Test 11: create two iterators over different randomized queues
==> passed

Test 12: create an iterator and check calls to next() and hasNext()

- 10 consecutive calls to hasNext() on a deque of size 10
- 10 consecutive calls to next() on a deque of size 10
- 50 random intermixed calls to next() and hasNext() on a deque of size 10
- 1000 random intermixed calls to next() and hasNext() on a deque of size 100
  ==> passed

Test 13: create RandomizedQueue objects of different parameterized types
==> passed

Test 14: check randomness of sample() by enqueueing n items, repeatedly calling
sample(), and counting the frequency of each item

- n = 3, trials = 12000
- n = 5, trials = 12000
- n = 8, trials = 12000
- n = 10, trials = 12000
  ==> passed

Test 15: check randomness of dequeue() by enqueueing n items, dequeueing n items,
and seeing whether each of the n! permutations is equally likely

- n = 2, trials = 12000
- n = 3, trials = 12000
- n = 4, trials = 12000
- n = 5, trials = 12000
  ==> passed

Test 16: check randomness of iterator() by enqueueing n items, iterating over those
n items, and seeing whether each of the n! permutations is equally likely

- n = 2, trials = 12000

          value  observed  expected   2*O*ln(O/E)
      -------------------------------------------
             AB     12000    6000.0      16635.53
             BA         0    6000.0          0.00
      -------------------------------------------
                    12000   12000.0      16635.53

  G-statistic = 16635.53 (p-value = 0.000000, reject if p-value <= 0.0001)
  Note: a correct solution will fail this test by bad luck 1 time in 10,000.

- n = 3, trials = 12000

          value  observed  expected   2*O*ln(O/E)
      -------------------------------------------
            ABC     12000    2000.0      43002.23
            ACB         0    2000.0          0.00
            BAC         0    2000.0          0.00
            BCA         0    2000.0          0.00
            CAB         0    2000.0          0.00
            CBA         0    2000.0          0.00
      -------------------------------------------
                    12000   12000.0      43002.23

  G-statistic = 43002.23 (p-value = 0.000000, reject if p-value <= 0.0001)
  Note: a correct solution will fail this test by bad luck 1 time in 10,000.

- n = 4, trials = 12000

          value  observed  expected   2*O*ln(O/E)
      -------------------------------------------
           ABCD     12000     500.0      76273.29
           ABDC         0     500.0          0.00
           ACBD         0     500.0          0.00
           ACDB         0     500.0          0.00
           ADBC         0     500.0          0.00
           ADCB         0     500.0          0.00
           BACD         0     500.0          0.00
           BADC         0     500.0          0.00
           BCAD         0     500.0          0.00
           BCDA         0     500.0          0.00
           BDAC         0     500.0          0.00
           BDCA         0     500.0          0.00
           CABD         0     500.0          0.00
           CADB         0     500.0          0.00
           CBAD         0     500.0          0.00
           CBDA         0     500.0          0.00
           CDAB         0     500.0          0.00
           CDBA         0     500.0          0.00
           DABC         0     500.0          0.00
           DACB         0     500.0          0.00
           DBAC         0     500.0          0.00
           DBCA         0     500.0          0.00
           DCAB         0     500.0          0.00
           DCBA         0     500.0          0.00
      -------------------------------------------
                    12000   12000.0      76273.29

  G-statistic = 76273.29 (p-value = 0.000000, reject if p-value <= 0.0001)
  Note: a correct solution will fail this test by bad luck 1 time in 10,000.

- n = 5, trials = 12000

==> FAILED

Test 17: call enqueue() with a null argument
==> passed

Test 18: check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 19: call iterator() when randomized queue is empty - hasNext() returns true

==> FAILED

Total: 13/19 tests passed!

================================================================

---

- TESTING CORRECTNESS (substituting reference RandomizedQueue and Deque)

---

Testing correctness of Permutation
\*-----------------------------------------------------------
Tests 1-5 call the main() function directly, resetting standard input
before each call.

Running 9 total tests.

Test 1a: check formatting for sample inputs from assignment specification
% java Permutation 3 < distinct.txt
E
G
D

% java Permutation 3 < distinct.txt
H
B
F

% java Permutation 8 < duplicates.txt
CC
BB
BB
CC
BB
AA
BB
BB

==> passed

Test 1b: check formatting for other inputs
% java Permutation 8 < mediumTale.txt
of
times
was
age
was
age
it
it

% java Permutation 0 < distinct.txt
[no output]

==> passed

Test 2: check that main() reads all data from standard input

- filename = distinct.txt, k = 3
- filename = distinct.txt, k = 3
- filename = duplicates.txt, k = 8
- filename = mediumTale.txt, k = 8
  ==> passed

Test 3a: check that main() prints each item from the sequence at most once
(for inputs with no duplicate strings)

- filename = distinct.txt, k = 3
- filename = distinct.txt, k = 1
- filename = distinct.txt, k = 9
- filename = permutation6.txt, k = 6
- filename = permutation10.txt, k = 10
  ==> passed

Test 3b: check that main() prints each item from the sequence at most once
(for inputs with duplicate strings)

- filename = duplicates.txt, k = 8
- filename = duplicates.txt, k = 3
- filename = permutation8.txt, k = 6
- filename = permutation8.txt, k = 2
- filename = tinyTale.txt, k = 10
  ==> passed

Test 3c: check that main() prints each item from the sequence at most once
(for inputs with newlines)

- filename = mediumTale.txt, k = 10
- filename = mediumTale.txt, k = 20
- filename = tale.txt, k = 10
- filename = tale.txt, k = 50
  ==> passed

Test 4: check main() when k = 0

- filename = distinct.txt, k = 0
- filename = distinct.txt, k = 0
  ==> passed

Test 5a: check that permutations are uniformly random
(for inputs with no duplicate strings)

- filename = permutation4.txt, k = 1
- filename = permutation4.txt, k = 2
- filename = permutation4.txt, k = 3
- filename = permutation4.txt, k = 4
- filename = permutation6.txt, k = 2
  ==> passed

Test 5b: check that permutations are uniformly random
(for inputs with duplicate strings)

- filename = permutation5.txt, k = 1
- filename = permutation5.txt, k = 2
- filename = permutation5.txt, k = 3
- filename = duplicates.txt, k = 3
- filename = permutation8.txt, k = 2
  ==> passed

Total: 9/9 tests passed!

================================================================

---

- TIMING (substituting reference RandomizedQueue and Deque)

---

Timing Permutation
\*-----------------------------------------------------------
Running 23 total tests.

Test 1: count calls to methods in StdIn

- java Permutation 5 < distinct.txt
- java Permutation 10 < permutation10.txt
- java Permutation 1 < mediumTale.txt
- java Permutation 20 < tale.txt
- java Permutation 100 < tale.txt
- java Permutation 16412 < tale.txt
  ==> passed

Test 2: count calls to methods in Deque and RandomizedQueue

- java Permutation 5 < distinct.txt
- java Permutation 10 < permutation10.txt
- java Permutation 1 < mediumTale.txt
- java Permutation 20 < tale.txt
- java Permutation 100 < tale.txt
- java Permutation 16412 < tale.txt
  ==> passed

Test 3: count calls to methods in StdRandom

- java Permutation 5 < distinct.txt
- java Permutation 10 < permutation10.txt
- java Permutation 1 < mediumTale.txt
- java Permutation 20 < tale.txt
- java Permutation 100 < tale.txt
- java Permutation 16412 < tale.txt
  ==> passed

Test 4: Time main() with k = 5, for inputs containing n random strings

                    n  seconds

---

=> passed 1000 0.00
=> passed 2000 0.00
=> passed 4000 0.00
=> passed 8000 0.00
=> passed 16000 0.01
=> passed 32000 0.02
=> passed 64000 0.18
=> passed 128000 0.08
=> passed 256000 0.09
=> passed 512000 0.16
==> 10/10 tests passed

Test 5: Time main() with k = 1000, for inputs containing n random strings

                    n  seconds

---

=> passed 1000 0.00
=> passed 2000 0.00
=> passed 4000 0.00
=> passed 8000 0.00
=> passed 16000 0.01
=> passed 32000 0.01
=> passed 64000 0.02
=> passed 128000 0.04
=> passed 256000 0.08
=> passed 512000 0.25
==> 10/10 tests passed

Total: 23/23 tests passed!

================================================================

---

- MEMORY

---

Analyzing memory of Permutation
\*-----------------------------------------------------------
Running 2 total tests.

Test 1: check that only one Deque or RandomizedQueue object is created

- filename = distinct.txt, n = 9, k = 1
- filename = distinct.txt, n = 9, k = 2
- filename = distinct.txt, n = 9, k = 4
- filename = tinyTale.txt, n = 12, k = 10
- filename = tale.txt, n = 138653, k = 50
  ==> passed

Test 2: check that the maximum size of any Deque or RandomizedQueue object
created is between k and n

- filename = distinct.txt, n = 9, k = 1
- filename = distinct.txt, n = 9, k = 2
- filename = distinct.txt, n = 9, k = 4
- filename = tinyTale.txt, n = 12, k = 10
- filename = tale.txt, n = 138653, k = 5
- filename = tale.txt, n = 138653, k = 50
- filename = tale.txt, n = 138653, k = 500
- filename = tale.txt, n = 138653, k = 5000
- filename = tale.txt, n = 138653, k = 50000
  ==> passed

Test 3 (bonus): check that maximum size of any or Deque or RandomizedQueue object
created is equal to k

- filename = tale.txt, n = 138653, k = 5

  - max size of RandomizedQueue object = 138653

- filename = tale.txt, n = 138653, k = 50

  - max size of RandomizedQueue object = 138653

- filename = tale.txt, n = 138653, k = 500

  - max size of RandomizedQueue object = 138653

- filename = tale.txt, n = 138653, k = 5000

  - max size of RandomizedQueue object = 138653

- filename = tale.txt, n = 138653, k = 50000
  - max size of RandomizedQueue object = 138653

==> FAILED

Total: 2/2 tests passed!

================================================================

---

- MEMORY

---

Analyzing memory of Deque
\*-----------------------------------------------------------
For tests 1-4, the maximum amount of memory allowed for a Deque
containing n items is 48n + 192.

Running 48 total tests.

Test 1a-1i: total memory usage after inserting n items,
where n is a power of 2

                 n        bytes

---

=> passed 32 1576  
=> passed 64 3112  
=> passed 128 6184  
=> passed 256 12328  
=> passed 512 24616  
=> passed 1024 49192  
=> passed 2048 98344  
=> passed 4096 196648  
=> passed 8192 393256  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 2a-2i: Total memory usage after inserting n items,
when n is one more than a power of 2.

                 n        bytes

---

=> passed 33 1624  
=> passed 65 3160  
=> passed 129 6232  
=> passed 257 12376  
=> passed 513 24664  
=> passed 1025 49240  
=> passed 2049 98392  
=> passed 4097 196696  
=> passed 8193 393304  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 3a-3i: Total memory usage after inserting 2n-1 items, and then
deleting n-1 items, when n is one more than a power of 2.

                 n        bytes

---

=> passed 33 1624  
=> passed 65 3160  
=> passed 129 6232  
=> passed 257 12376  
=> passed 513 24664  
=> passed 1025 49240  
=> passed 2049 98392  
=> passed 4097 196696  
=> passed 8193 393304  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 4a-4e: Total memory usage after inserting n items,
and then deleting all but one item
(should not grow with n or be too large of a constant).

                 n        bytes

---

=> passed 32 88  
=> passed 64 88  
=> passed 128 88  
=> passed 256 88  
=> passed 512 88  
=> passed 1024 88  
=> passed 2048 88  
=> passed 4096 88  
=> passed 8192 88  
==> 9/9 tests passed

Memory: 88.00 (R^2 = 1.000)

Test 5a-5e: Total memory usage of iterator after inserting n items
(should not grow with n or be too large of a constant).

                 n        bytes

---

=> passed 32 32  
=> passed 64 32  
=> passed 128 32  
=> passed 256 32  
=> passed 512 32  
=> passed 1024 32  
=> passed 2048 32  
=> passed 4096 32  
=> passed 8192 32  
==> 9/9 tests passed

Memory: 32.00 (R^2 = 1.000)

Test 6a: Insert n strings; delete them one at a time, checking for
loitering after each deletion. The probabilities of addFirst()
and addLast() are (p1, p2), respectively. The probabilities of
removeFirst() and removeLast() are (q1, q2), respectively.

- 100 random insertions (1.0, 0.0) and 100 random deletions (1.0, 0.0)
- 100 random insertions (1.0, 0.0) and 100 random deletions (0.0, 1.0)
- 100 random insertions (0.0, 1.0) and 100 random deletions (1.0, 0.0)
- 100 random insertions (0.0, 1.0) and 100 random deletions (0.0, 1.0)
- 100 random insertions (0.5, 0.5) and 100 random deletions (0.5, 0.5)
  ==> passed

Test 6b: Perform random operations, checking for loitering after
each operation. The probabilities of addFirst(), addLast(),
removeFirst(), and removeLast() are (p1, p2, p3, p4),
respectively.

- 100 random operations (0.8, 0.0, 0.2, 0.0)
- 100 random operations (0.8, 0.0, 0.0, 0.2)
- 100 random operations (0.0, 0.8, 0.2, 0.0)
- 100 random operations (0.0, 0.8, 0.0, 0.2)
- 100 random operations (0.4, 0.4, 0.1, 0.1)
- 100 random operations (0.2, 0.2, 0.3, 0.3)
  ==> passed

Test 7: worst-case constant memory allocated or de-allocated
per deque operation?

- 128 random operations
- 256 random operations
- 512 random operations
  ==> passed

Min observed memory for Deque: 48.00 n + 40.00 (R^2 = 1.000)
Max observed memory for Deque: 48.00 n + 40.00 (R^2 = 1.000)

Total: 48/48 tests passed!

================================================================

Analyzing memory of RandomizedQueue
\*-----------------------------------------------------------
For Tests 1-5, the maximum amount of memory allowed for
a RandomizedQueue containing n items is 48n + 192.

For Test 6, the maximum amount of memory allowed for
a RandomizedQueue iterator over n items is 8n + 72.

Test 1a-1i: Total memory usage after inserting n items
when n is a power of 2.

                 n        bytes

---

=> passed 32 1576  
=> passed 64 3112  
=> passed 128 6184  
=> passed 256 12328  
=> passed 512 24616  
=> passed 1024 49192  
=> passed 2048 98344  
=> passed 4096 196648  
=> passed 8192 393256  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 2a-2i: Total memory usage after inserting n items,
when n is one more than a power of 2.

                 n        bytes

---

=> passed 33 1624  
=> passed 65 3160  
=> passed 129 6232  
=> passed 257 12376  
=> passed 513 24664  
=> passed 1025 49240  
=> passed 2049 98392  
=> passed 4097 196696  
=> passed 8193 393304  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 3a-3i: Total memory usage after inserting 2n-1 items, and then
deleting n-1 items, when n is one more than a power of 2.

                 n        bytes

---

=> passed 33 1624  
=> passed 65 3160  
=> passed 129 6232  
=> passed 257 12376  
=> passed 513 24664  
=> passed 1025 49240  
=> passed 2049 98392  
=> passed 4097 196696  
=> passed 8193 393304  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 4a-4i: Total memory usage after inserting n items, deleting n items,
then inserting n times, when n is a power of 2.

                 n        bytes

---

=> passed 32 1576  
=> passed 64 3112  
=> passed 128 6184  
=> passed 256 12328  
=> passed 512 24616  
=> passed 1024 49192  
=> passed 2048 98344  
=> passed 4096 196648  
=> passed 8192 393256  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 5a-5i: Total memory usage after inserting n items,
and then deleting all but one item.

                 n        bytes

---

=> passed 32 88  
=> passed 64 88  
=> passed 128 88  
=> passed 256 88  
=> passed 512 88  
=> passed 1024 88  
=> passed 2048 88  
=> passed 4096 88  
=> passed 8192 88  
==> 9/9 tests passed

Memory: 88.00 (R^2 = 1.000)

Test 6a-6i: Total memory usage of iterator after inserting n items.

                 n        bytes

---

=> passed 32 32  
=> passed 64 32  
=> passed 128 32  
=> passed 256 32  
=> passed 512 32  
=> passed 1024 32  
=> passed 2048 32  
=> passed 4096 32  
=> passed 8192 32  
==> 9/9 tests passed

Memory: 32.00 (R^2 = 1.000)

Test 7a: Insert 100 strings; delete them one at a time, checking
for loitering after each deletion.
==> passed

Test 7b: Perform random operations, checking for loitering after
each operation. The probabilities of enqueue(), dequeue(),
and sample() are (p1, p2, p3), respectively.

- 200 random operations (0.8, 0.2, 0.0)
- 200 random operations (0.2, 0.8, 0.0)
- 200 random operations (0.6, 0.2, 0.2)
- 200 random operations (0.2, 0.4, 0.4)

  java.lang.NullPointerException

  RandomizedQueue.sample(RandomizedQueue.java:124)
  MemoryOfRandomizedQueue.loiter(MemoryOfRandomizedQueue.java:411)
  MemoryOfRandomizedQueue.test7b(MemoryOfRandomizedQueue.java:539)
  MemoryOfRandomizedQueue.main(MemoryOfRandomizedQueue.java:755)

  - sequence of operations was:
    rq.enqueue("WBYLPATSPG")
    rq.sample() ==> "WBYLPATSPG"
    rq.sample()

==> FAILED

Test 8: Insert T items into queue; then iterate over queue and check
that worst-case constant memory is allocated or deallocated
per iterator operation.

- T = 64
- T = 128
- T = 256
  ==> passed

Test 9: Total memory usage after inserting n items, seeking to identify
values of n where memory usage is minimized as a function of n.

                 n        bytes

---

=> passed 8 424  
=> passed 16 808  
=> passed 32 1576  
=> passed 64 3112  
=> passed 128 6184  
=> passed 256 12328  
=> passed 512 24616  
=> passed 1024 49192  
=> passed 2048 98344  
==> 9/9 tests passed

Memory: 48.00 n + 40.00 (R^2 = 1.000)

Test 10: Total memory usage after inserting 4096 items, then successively
deleting items, seeking values of n where memory usage is maximized
as a function of n

                 n        bytes

---

WARNING: the time limit of 60 seconds was exceeded, so not all tests could be completed.
This usually indicates a performance bug or an infinite loop.

================================================================

---

- TIMING

---

Timing Deque
\*-----------------------------------------------------------
Running 103 total tests.

Test 1a-1k: make n calls to addFirst() followed by n calls to removeFirst()
n seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.05
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.00
=> passed 256000 0.01
=> passed 512000 0.01
=> passed 1024000 0.02
==> 11/11 tests passed

Test 2a-2k: make n calls to addLast() followed by n calls to removeLast()
n seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.00
=> passed 256000 0.01
=> passed 512000 0.01
=> passed 1024000 0.04
==> 11/11 tests passed

Test 3a-3k: make n calls to addFirst() followed by n calls to removeLast()
n seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.00
=> passed 256000 0.00
=> passed 512000 0.01
=> passed 1024000 0.03
==> 11/11 tests passed

Test 4a-4k: make n calls to addLast() followed by n calls to removeFirst()
n seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.00
=> passed 256000 0.14
=> passed 512000 0.02
=> passed 1024000 0.14
==> 11/11 tests passed

Test 5a-5g: make n random calls to addFirst(), removeFirst(), isEmpty(), and size()
with probabilities (0.7, 0.1, 0.1, 0.1)

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.01
=> passed 256000 0.01
=> passed 512000 0.02
=> passed 1024000 0.14
=> passed 2048000 0.16
==> 12/12 tests passed

Test 6a-6g: make n random calls to addLast(), removeLast(), isEmpty(), and size(),
with probabilities (0.7, 0.1, 0.1, 0.1)

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.01
=> passed 256000 0.01
=> passed 512000 0.02
=> passed 1024000 0.04
=> passed 2048000 0.08
==> 12/12 tests passed

Test 7a-7g: make n random calls to addFirst(), addLast(), removeFirst(), removeLast(),
isEmpty(), and size() with probabilities (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.01
=> passed 256000 0.01
=> passed 512000 0.02
=> passed 1024000 0.04
=> passed 2048000 0.08
==> 12/12 tests passed

Test 8a-8g: make n calls to addFirst(); iterate over the n items by calling
next() and hasNext()

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.00
=> passed 256000 0.01
=> passed 512000 0.01
=> passed 1024000 0.02
=> passed 2048000 0.05
==> 12/12 tests passed

Test 9a-9k: make n calls to addFirst()/addLast(); interleave n calls each to
removeFirst(), removeLast(), addFirst(), and addLast()

                    n  seconds

---

=> passed 1025 0.00
=> passed 2049 0.00
=> passed 4097 0.00
=> passed 8193 0.00
=> passed 16385 0.00
=> passed 32769 0.00
=> passed 65537 0.00
=> passed 128001 0.01
=> passed 256001 0.02
=> passed 512001 0.04
=> passed 1024001 0.07
==> 11/11 tests passed

Total: 103/103 tests passed!

================================================================

Timing RandomizedQueue
\*-----------------------------------------------------------
Running 67 total tests.

Test 1: make n calls to enqueue() followed by n calls to dequeue();
count calls to StdRandom

- n = 10
- n = 100
- n = 1000
  ==> passed

Test 2: make n calls to enqueue() follwed by n calls to sample();
count calls to StdRandom

- n = 10
- n = 100
- n = 1000
  ==> passed

Test 3: make n calls to enqueue() and iterate over the n items;
count calls to StdRandom

- n = 10
- n = 100
- n = 1000
  ==> passed

Test 4a-k: make n calls to enqueue() followed by n calls to dequeue()

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.01
=> passed 8192 0.05
=> passed 16384 0.21
=> passed 32768 0.88
=> FAILED 65536 4.44
[ Most likely one of your operations is not constant time. ]

==> 6/11 tests passed

Test 5a-k: make n calls to enqueue() followed by n random calls to
enqueue(), sample(), dequeue(), isEmpty(), and size()
with probabilities (0.2, 0.2, 0.2, 0.2, 0.2)

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.01
=> passed 8192 0.03
=> passed 16384 0.14
=> passed 32768 0.57
=> FAILED 65536 2.19
[ Most likely one of your operations is not constant time. ]

==> 6/11 tests passed

Test 6a-k: make n calls to enqueue() followed by n random calls to
enqueue(), sample(), dequeue(), isEmpty(), and size()
with probabilities (0.6, 0.1, 0.1, 0.1, 0.1)

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.02
=> passed 16384 0.07
=> passed 32768 0.32
=> FAILED 65536 1.32
[ Most likely one of your operations is not constant time. ]

==> 6/11 tests passed

Test 7a-k: make n calls to enqueue() followed by n random calls to
enqueue(), sample(), dequeue(), isEmpty(), and size()
with probabilities (0.1, 0.1, 0.6, 0.1, 0.1)

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.01
=> passed 8192 0.06
=> passed 16384 0.22
=> passed 32768 0.93
=> FAILED 65536 3.88
[ Most likely one of your operations is not constant time. ]

==> 6/11 tests passed

Test 8a-k: make n calls to enqueue() followed by n calls each to
next() and hasNext().

                    n  seconds

---

=> passed 1024 0.00
=> passed 2048 0.00
=> passed 4096 0.00
=> passed 8192 0.00
=> passed 16384 0.00
=> passed 32768 0.00
=> passed 65536 0.00
=> passed 128000 0.00
=> passed 256000 0.00
=> passed 512000 0.01
=> passed 1024000 0.03
==> 11/11 tests passed

Test 9a-i: make 100 calls to enqueue; 99 calls to dequeue;
n calls to enqueue(); then call dequeue() three times,
followed by enqueue() three times, and repeat n times.

                    n  seconds

---

=> passed 1024 0.01
=> passed 2048 0.02
=> passed 4096 0.09
=> passed 8192 0.37
=> FAILED 16384 1.61
[ Most likely one of your operations is not constant time. ]

==> 4/9 tests passed

Total: 42/67 tests passed!

================================================================
