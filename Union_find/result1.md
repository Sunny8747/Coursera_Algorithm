See the Assessment Guide for information on how to interpret this report.

Want to receive personalized feedback on this submission?
You can pay to have a teaching assistant read and provide
personalized feedback on your submission at https://mooc.codepost.io.

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Spotbugs:     PASSED
PMD:          FAILED (2 warnings)
Checkstyle:   FAILED (0 errors, 137 warnings)

Correctness:  17/33 tests passed
Memory:       8/8 tests passed
Timing:       18/20 tests passed

Aggregate score: 68.91%
[Compilation: 5%, API: 5%, Spotbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
4.6K May 14 15:06 Percolation.java
2.5K May 14 15:06 PercolationStats.java


********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac Percolation.java
*-----------------------------------------------------------

% javac PercolationStats.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Percolation:

PercolationStats:

================================================================


********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% spotbugs *.class
*-----------------------------------------------------------


================================================================


% pmd .
*-----------------------------------------------------------
Percolation.java:14: The private instance (or static) variable 'wquf' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PercolationStats.java:13: The private instance (or static) variable 'value_threshold' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PMD ends with 2 warnings.


================================================================


% checkstyle *.java
*-----------------------------------------------------------
[WARN] Percolation.java:3:3: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:5:8: Unused import statement for 'edu.princeton.cs.algs4.StdStats'. [UnusedImports]
[WARN] Percolation.java:6:8: Unused import statement for 'edu.princeton.cs.algs4.StdIn'. [UnusedImports]
[WARN] Percolation.java:7:8: Unused import statement for 'edu.princeton.cs.algs4.StdOut'. [UnusedImports]
[WARN] Percolation.java:11:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:13:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:16:23: The instance variable 'GRID_SIZE' must start with a lowercase letter and use camelCase. [MemberName]
[WARN] Percolation.java:16:34: The instance variable 'TOP_INDEX' must start with a lowercase letter and use camelCase. [MemberName]
[WARN] Percolation.java:16:45: The instance variable 'BOTTOM_INDEX' must start with a lowercase letter and use camelCase. [MemberName]
[WARN] Percolation.java:19:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:20:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:21:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:22:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:24:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:25:30: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:26:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:26:19: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:30:45: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:36:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:37:39: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:38:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:38:81: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:42:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:42:27: Boolean expression can be simplified, e.g., use 'if (!isEmpty)' instead of 'if (isEmpty == false)'. [SimplifyBooleanExpression]
[WARN] Percolation.java:42:36: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:47:7: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:48:18: The method 'check_adjacent_isOpen' must start with a lowercase letter and use camelCase. [MethodName]
[WARN] Percolation.java:48:57: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:51:11: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:52:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:52:21: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:53:32: ',' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:55:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:55:34: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:56:32: ',' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:59:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:59:21: '{' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:59:21: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:59:24: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
...
Checkstyle ends with 0 errors and 135 warnings.

% custom checkstyle checks for Percolation.java
*-----------------------------------------------------------
[INFO] Percolation.java:104: Using a loop in this method might be a performance bug. [Performance]

% custom checkstyle checks for PercolationStats.java
*-----------------------------------------------------------
[WARN] PercolationStats.java:1: The number (0) of calls to 'Integer.parseInt()' must equal the number (2) of integer command-line arguments. [CommandLineArgument]
[WARN] PercolationStats.java:1: Use 'StdStats.stddev()' to compute the standard deviation. [MethodCallCount]
Checkstyle ends with 0 errors and 2 warnings.


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Percolation
*-----------------------------------------------------------
Running 18 total tests.

Tests 1 through 8 create a Percolation object using your code, then repeatedly
open sites by calling open(). After each call to open(), it checks the return
values of isOpen(), percolates(), numberOfOpenSites(), and isFull() in that order.
Tests 11 through 14 create a Percolation object using your code, then repeatedly
call the methods open(), isOpen(), isFull(), percolates(), and, numberOfOpenSites()
in random order with probabilities p = (p1, p2, p3, p4, p5). The tests stop
immediately after the system percolates.

Tests 16 through 18 test backwash.

Except as noted, a site is opened at most once.

Test 1: open predetermined list of sites using file inputs
  * filename = input6.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 6) = false
    - reference isFull(1, 6) = true
  * filename = input8.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * filename = input8-no.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 6) = false
    - reference isFull(1, 6) = true
  * filename = input10-no.txt
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(1, 4) = false
    - reference isFull(1, 4) = true
  * filename = greeting57.txt
    - isFull() returns wrong value after 1979 sites opened
    - student   isFull(1, 45) = false
    - reference isFull(1, 45) = true
  * filename = heart25.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 7) = false
    - reference isFull(1, 7) = true
==> FAILED

Test 2: open random sites until just before system percolates
  * n = 3
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * n = 5
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * n = 10
    - isFull() returns wrong value after 26 sites opened
    - student   isFull(10, 1) = true
    - reference isFull(10, 1) = false
  * n = 10
    - isFull() returns wrong value after 18 sites opened
    - student   isFull(8, 1) = true
    - reference isFull(8, 1) = false
  * n = 20
    - isFull() returns wrong value after 61 sites opened
    - student   isFull(9, 1) = true
    - reference isFull(9, 1) = false
  * n = 20
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(3, 1) = true
    - reference isFull(3, 1) = false
  * n = 50
    - isFull() returns wrong value after 14 sites opened
    - student   isFull(7, 1) = true
    - reference isFull(7, 1) = false
  * n = 50
    - isFull() returns wrong value after 37 sites opened
    - student   isFull(34, 1) = true
    - reference isFull(34, 1) = false
==> FAILED

Test 3: open predetermined sites for n = 1 and n = 2 (corner case test)
  * filename = input1.txt
  * filename = input1-no.txt
  * filename = input2.txt
  * filename = input2-no.txt
==> passed

Test 4: check predetermined sites with long percolating path
  * filename = snake13.txt
    - isFull() returns wrong value after 8 sites opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
  * filename = snake101.txt
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(96, 1) = true
    - reference isFull(96, 1) = false
==> FAILED

Test 5: open every site
  * filename = input5.txt
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(1, 4) = false
    - reference isFull(1, 4) = true
==> FAILED

Test 6: open random sites until just before system percolates,
        allowing open() to be called on a site more than once
  * n = 3
    - isFull() returns wrong value after 1 site opened
    - student   isFull(2, 1) = true
    - reference isFull(2, 1) = false
  * n = 5
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * n = 10
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * n = 10
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 8) = false
    - reference isFull(1, 8) = true
  * n = 20
    - isFull() returns wrong value after 10 sites opened
    - student   isFull(14, 1) = true
    - reference isFull(14, 1) = false
  * n = 20
    - isFull() returns wrong value after 11 sites opened
    - student   isFull(1, 2) = false
    - reference isFull(1, 2) = true
  * n = 50
    - isFull() returns wrong value after 31 sites opened
    - student   isFull(1, 5) = false
    - reference isFull(1, 5) = true
  * n = 50
    - isFull() returns wrong value after 49 sites opened
    - student   isFull(34, 1) = true
    - reference isFull(34, 1) = false
==> FAILED

Test 7: call methods with invalid arguments
  * n = 10, (row, col) = (-1, 5)
  * n = 10, (row, col) = (11, 5)
  * n = 10, (row, col) = (0, 5)
  * n = 10, (row, col) = (5, -1)
  * n = 10, (row, col) = (5, 11)
  * n = 10, (row, col) = (5, 0)
  * n = 10, (row, col) = (-2147483648, -2147483648)
  * n = 10, (row, col) = (2147483647, 2147483647)
==> passed

Test 8: call constructor with invalid argument
  * n = -10
  * n = -1
  * n = 0
==> passed

Test 9: create multiple Percolation objects at the same time
        (to make sure you didn't store data in static variables)
    - isFull() returns wrong value after 8 sites opened
    - student   isFull(2, 1) = true
    - reference isFull(2, 1) = false
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(6, 1) = true
    - reference isFull(6, 1) = false
    - isFull() returns wrong value after 1 site opened
    - student   isFull(10, 1) = true
    - reference isFull(10, 1) = false
==> FAILED

Test 10: open predetermined list of sites using file inputs,
         but permute the order in which methods are called
  * filename = input8.txt;  order =     isFull(),     isOpen(), percolates()
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * filename = input8.txt;  order =     isFull(), percolates(),     isOpen()
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * filename = input8.txt;  order =     isOpen(),     isFull(), percolates()
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * filename = input8.txt;  order =     isOpen(), percolates(),     isFull()
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * filename = input8.txt;  order = percolates(),     isOpen(),     isFull()
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * filename = input8.txt;  order = percolates(),     isFull(),     isOpen()
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
==> FAILED

Test 11: call open(), isOpen(), and numberOfOpenSites()
         in random order until system percolates
  * n = 3, trials = 40, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 5, trials = 20, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 7, trials = 10, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 10, trials = 5, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 20, trials = 2, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 50, trials = 1, p = (0.4, 0.4, 0.0, 0.0, 0.3)
==> passed

Test 12: call open() and percolates() in random order until system percolates
  * n = 3, trials = 40, p = (0.5, 0.0, 0.0, 0.5, 0.0)
    - percolates() returns wrong value after 5 sites opened
    - student   percolates() = false
    - reference percolates() = true

    - failed on trial 1 of 40
    - sequence of operations was:
         percolation.open(3, 2)
         percolation.percolates()
         percolation.percolates()
         percolation.open(2, 1)
         percolation.open(2, 3)
         percolation.open(3, 3)
         percolation.percolates()
         percolation.percolates()
         percolation.percolates()
         percolation.percolates()
         percolation.open(1, 3)
         percolation.percolates()

  * n = 5, trials = 20, p = (0.5, 0.0, 0.0, 0.5, 0.0)
    - percolates() returns wrong value after 12 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - percolates() returns wrong value after 12 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - failed on trial 2 of 20

  * n = 7, trials = 10, p = (0.5, 0.0, 0.0, 0.5, 0.0)
    - percolates() returns wrong value after 26 sites opened
    - student   percolates() = false
    - reference percolates() = true

    - failed on trial 1 of 10

  * n = 10, trials = 5, p = (0.5, 0.0, 0.0, 0.5, 0.0)
    - percolates() returns wrong value after 57 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - percolates() returns wrong value after 57 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - failed on trial 1 of 5

  * n = 20, trials = 2, p = (0.5, 0.0, 0.0, 0.5, 0.0)
    - percolates() returns wrong value after 244 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - percolates() returns wrong value after 244 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - failed on trial 2 of 2

  * n = 50, trials = 1, p = (0.5, 0.0, 0.0, 0.5, 0.0)
    - percolates() returns wrong value after 1529 sites opened
    - student   percolates() = false
    - reference percolates() = true

    - failed on trial 1 of 1

==> FAILED

Test 13: call open() and isFull() in random order until system percolates
  * n = 3, trials = 40, p = (0.5, 0.0, 0.5, 0.0, 0.0)
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(2, 1) = true
    - reference isFull(2, 1) = false
    - failed on trial 2 of 40

  * n = 5, trials = 20, p = (0.5, 0.0, 0.5, 0.0, 0.0)
    - isFull() returns wrong value after 6 sites opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - failed on trial 1 of 20
    - sequence of operations was:
         percolation.open(3, 2)
         percolation.open(3, 3)
         percolation.open(5, 1)
         percolation.open(2, 4)
         percolation.open(1, 1)
         percolation.open(2, 5)
         percolation.isFull(row, col) for each row and col

  * n = 7, trials = 10, p = (0.5, 0.0, 0.5, 0.0, 0.0)
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - failed on trial 1 of 10
    - sequence of operations was:
         percolation.open(2, 2)
         percolation.isFull(row, col) for each row and col
         percolation.open(1, 3)
         percolation.open(2, 5)
         percolation.isFull(row, col) for each row and col

  * n = 10, trials = 5, p = (0.5, 0.0, 0.5, 0.0, 0.0)
    - isFull() returns wrong value after 6 sites opened
    - student   isFull(10, 1) = true
    - reference isFull(10, 1) = false
    - failed on trial 1 of 5
    - sequence of operations was:
         percolation.open(2, 9)
         percolation.isFull(row, col) for each row and col
         percolation.open(5, 5)
         percolation.isFull(row, col) for each row and col
         percolation.open(5, 7)
         percolation.isFull(row, col) for each row and col
         percolation.open(4, 2)
         percolation.isFull(row, col) for each row and col
         percolation.open(10, 7)
         percolation.open(10, 1)
         percolation.isFull(row, col) for each row and col

  * n = 20, trials = 2, p = (0.5, 0.0, 0.5, 0.0, 0.0)
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(1, 2) = false
    - reference isFull(1, 2) = true
    - failed on trial 1 of 2
    - sequence of operations was:
         percolation.isFull(row, col) for each row and col
         percolation.open(12, 7)
         percolation.isFull(row, col) for each row and col
         percolation.isFull(row, col) for each row and col
         percolation.isFull(row, col) for each row and col
         percolation.open(12, 13)
         percolation.open(11, 14)
         percolation.open(20, 20)
         percolation.open(1, 2)
         percolation.isFull(row, col) for each row and col

  * n = 50, trials = 1, p = (0.5, 0.0, 0.5, 0.0, 0.0)
    - isFull() returns wrong value after 27 sites opened
    - student   isFull(1, 50) = false
    - reference isFull(1, 50) = true
    - failed on trial 1 of 1

==> FAILED

Test 14: call all methods in random order until system percolates
  * n = 3, trials = 40, p = (0.2, 0.2, 0.2, 0.2, 0.2)
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - percolates() returns wrong value after 5 sites opened
    - student   percolates() = false
    - reference percolates() = true

    - failed on trial 2 of 40

  * n = 5, trials = 20, p = (0.2, 0.2, 0.2, 0.2, 0.2)
    - isFull() returns wrong value after 1 site opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - isFull() returns wrong value after 7 sites opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - isFull() returns wrong value after 1 site opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - isFull() returns wrong value after 12 sites opened
    - student   isFull(1, 5) = false
    - reference isFull(1, 5) = true
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(3, 1) = true
    - reference isFull(3, 1) = false
    - isFull() returns wrong value after 14 sites opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(3, 1) = true
    - reference isFull(3, 1) = false
    - isFull() returns wrong value after 1 site opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(1, 5) = false
    - reference isFull(1, 5) = true
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(1, 5) = false
    - reference isFull(1, 5) = true
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - percolates() returns wrong value after 14 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - percolates() returns wrong value after 14 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - failed on trial 20 of 20

  * n = 7, trials = 10, p = (0.2, 0.2, 0.2, 0.2, 0.2)
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(1, 6) = false
    - reference isFull(1, 6) = true
    - isFull() returns wrong value after 10 sites opened
    - student   isFull(7, 1) = true
    - reference isFull(7, 1) = false
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(7, 1) = true
    - reference isFull(7, 1) = false
    - isFull() returns wrong value after 9 sites opened
    - student   isFull(1, 4) = false
    - reference isFull(1, 4) = true
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(1, 6) = false
    - reference isFull(1, 6) = true
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(1, 4) = false
    - reference isFull(1, 4) = true
    - isFull() returns wrong value after 10 sites opened
    - student   isFull(3, 1) = true
    - reference isFull(3, 1) = false
  * n = 10, trials = 5, p = (0.2, 0.2, 0.2, 0.2, 0.2)
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(1, 10) = false
    - reference isFull(1, 10) = true
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(9, 1) = true
    - reference isFull(9, 1) = false
    - isFull() returns wrong value after 4 sites opened
    - student   isFull(1, 7) = false
    - reference isFull(1, 7) = true
  * n = 20, trials = 2, p = (0.2, 0.2, 0.2, 0.2, 0.2)
    - isFull() returns wrong value after 6 sites opened
    - student   isFull(19, 1) = true
    - reference isFull(19, 1) = false
    - isFull() returns wrong value after 14 sites opened
    - student   isFull(11, 1) = true
    - reference isFull(11, 1) = false
  * n = 50, trials = 1, p = (0.2, 0.2, 0.2, 0.2, 0.2)
    - isFull() returns wrong value after 53 sites opened
    - student   isFull(25, 1) = true
    - reference isFull(25, 1) = false
==> FAILED

Test 15: call all methods in random order until almost all sites are open,
         but with inputs not prone to backwash
  * n = 3
    - percolates() returns wrong value after 5 sites opened
    - student   percolates() = true
    - reference percolates() = false

    - failed on trial 1 of 40

  * n = 5
    - isFull() returns wrong value after 9 sites opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - failed on trial 1 of 20

  * n = 7
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(6, 1) = true
    - reference isFull(6, 1) = false
    - failed on trial 1 of 10

  * n = 10
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(5, 1) = true
    - reference isFull(5, 1) = false
    - failed on trial 1 of 5

  * n = 20
    - isFull() returns wrong value after 6 sites opened
    - student   isFull(1, 16) = false
    - reference isFull(1, 16) = true
    - failed on trial 1 of 2

  * n = 50
    - isFull() returns wrong value after 14 sites opened
    - student   isFull(48, 1) = true
    - reference isFull(48, 1) = false
    - failed on trial 1 of 1

==> FAILED

Test 16: check for backwash with predetermined sites
  * filename = input20.txt
    - isFull() returns wrong value after 7 sites opened
    - student   isFull(12, 1) = true
    - reference isFull(12, 1) = false
  * filename = input10.txt
    - isFull() returns wrong value after 5 sites opened
    - student   isFull(1, 4) = false
    - reference isFull(1, 4) = true
  * filename = input50.txt
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(46, 1) = true
    - reference isFull(46, 1) = false
  * filename = jerry47.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 43) = false
    - reference isFull(1, 43) = true
  * filename = sedgewick60.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(44, 1) = true
    - reference isFull(44, 1) = false
  * filename = wayne98.txt
    - isFull() returns wrong value after 9 sites opened
    - student   isFull(1, 66) = false
    - reference isFull(1, 66) = true
==> FAILED

Test 17: check for backwash with predetermined sites that have
         multiple percolating paths
  * filename = input3.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(1, 3) = false
    - reference isFull(1, 3) = true
  * filename = input4.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
  * filename = input7.txt
    - isFull() returns wrong value after 1 site opened
    - student   isFull(6, 1) = true
    - reference isFull(6, 1) = false
==> FAILED

Test 18: call all methods in random order until all sites are open,
         allowing isOpen() to be called on a site more than once
         (these inputs are prone to backwash)
  * n = 3
    - percolates() returns wrong value after 3 sites opened
    - student   percolates() = false
    - reference percolates() = true

    - failed on trial 1 of 40

  * n = 5
    - isFull() returns wrong value after 1 site opened
    - student   isFull(4, 1) = true
    - reference isFull(4, 1) = false
    - failed on trial 1 of 20

  * n = 7
    - isFull() returns wrong value after 3 sites opened
    - student   isFull(3, 1) = true
    - reference isFull(3, 1) = false
    - failed on trial 1 of 10

  * n = 10
    - isFull() returns wrong value after 2 sites opened
    - student   isFull(2, 1) = true
    - reference isFull(2, 1) = false
    - failed on trial 1 of 5

  * n = 20
    - isFull() returns wrong value after 9 sites opened
    - student   isFull(10, 1) = true
    - reference isFull(10, 1) = false
    - failed on trial 1 of 2

  * n = 50
    - isFull() returns wrong value after 30 sites opened
    - student   isFull(1, 26) = false
    - reference isFull(1, 26) = true
    - failed on trial 1 of 1

==> FAILED


Total: 4/18 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference Percolation)
********************************************************************************

Testing correctness of PercolationStats
*-----------------------------------------------------------
Running 15 total tests.

Test 1: check that methods in PercolationStats do not print to standard output
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 2: check that mean() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
==> passed

Test 3: check that stddev() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
==> passed

Test 4: check that PercolationStats creates trials Percolation objects, each of size n-by-n
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 5: check that PercolationStats calls open() until system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 6: check that PercolationStats does not call open() after system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 7: check that mean() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 8: check that stddev() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 9: check that confidenceLo() and confidenceHigh() are consistent with mean() and stddev()
  * n =  20, trials =  10
    - PercolationStats confidence low  = 0.5272216255199199
    - PercolationStats confidence high = 0.6317783744800801
    - PercolationStats mean            = 0.5795
    - PercolationStats stddev          = 0.027330284382794934
    - T                                = 10
    - student T                        = 10
    - mean - 1.96 * stddev / sqrt(T)   = 0.5625605142410468
    - mean + 1.96 * stddev / sqrt(T)   = 0.5964394857589532

  * n =  50, trials =  20
    - PercolationStats confidence low  = 0.5649671504564293
    - PercolationStats confidence high = 0.6239528495435707
    - PercolationStats mean            = 0.59446
    - PercolationStats stddev          = 0.017396563483993942
    - T                                = 20
    - student T                        = 20
    - mean - 1.96 * stddev / sqrt(T)   = 0.5868356198890802
    - mean + 1.96 * stddev / sqrt(T)   = 0.6020843801109198

  * n = 100, trials =  50
    - PercolationStats confidence low  = 0.5722186811973801
    - PercolationStats confidence high = 0.6088013188026195
    - PercolationStats mean            = 0.5905099999999998
    - PercolationStats stddev          = 0.016728617176953422
    - T                                = 50
    - student T                        = 50
    - mean - 1.96 * stddev / sqrt(T)   = 0.5858730638908863
    - mean + 1.96 * stddev / sqrt(T)   = 0.5951469361091132

  * n =  64, trials = 150
    - PercolationStats confidence low  = 0.5812894303764161
    - PercolationStats confidence high = 0.6071513248319172
    - PercolationStats mean            = 0.5942203776041667
    - PercolationStats stddev          = 0.02508140943103047
    - T                                = 150
    - student T                        = 150
    - mean - 1.96 * stddev / sqrt(T)   = 0.5902065161352908
    - mean + 1.96 * stddev / sqrt(T)   = 0.5982342390730425

==> FAILED

Test 10: check that exception is thrown if either n or trials is out of bounds
  * n = -23, trials =  42
  * n =  23, trials =   0
    - fails to throw an exception when calling constructor with invalid arguments

  * n = -42, trials =   0
    - fails to throw an exception when calling constructor with invalid arguments

  * n =  42, trials =  -1
    - throws wrong exception when calling constructor with invalid arguments
    - throws a java.lang.NegativeArraySizeException
    - should throw a java.lang.IllegalArgumentException

  * n = -2147483648, trials = -2147483648
    - throws wrong exception when calling constructor with invalid arguments
    - throws a java.lang.NegativeArraySizeException
    - should throw a java.lang.IllegalArgumentException

==> FAILED

Test 11: create two PercolationStats objects at the same time and check mean()
         (to make sure you didn't store data in static variables)
  * n1 =  50, trials1 =  10, n2 =  50, trials2 =   5
  * n1 =  50, trials1 =   5, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  25, trials2 =  10
  * n1 =  25, trials1 =  10, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  15, trials2 = 100
  * n1 =  15, trials1 = 100, n2 =  50, trials2 =  10
==> passed

Test 12: check that the methods return the same value, regardless of
         the order in which they are called
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 13: check that no calls to StdRandom.setSeed()
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 14: check distribution of number of sites opened until percolation
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed

Test 15: check that each site is opened the expected number of times
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed


Total: 13/15 tests passed!


================================================================
********************************************************************************
*  MEMORY (substituting reference Percolation)
********************************************************************************

Analyzing memory of PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: check memory usage as a function of T trials for n = 100
            (max allowed: 8*T + 128 bytes)

                 T        bytes
--------------------------------------------
=> passed       16          176         
=> passed       32          304         
=> passed       64          560         
=> passed      128         1072         
==> 4/4 tests passed


Estimated student memory = 8.00 T + 48.00   (R^2 = 1.000)

Total: 4/4 tests passed!


================================================================



********************************************************************************
*  TIMING (substituting reference Percolation)
********************************************************************************

Timing PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1: count calls to StdStats.mean() and StdStats.stddev()
  * n =  20, trials =  10
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 6
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 0
    - number of reference calls to StdStats.stddev() = 1

  * n =  50, trials =  20
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 6
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 0
    - number of reference calls to StdStats.stddev() = 1

  * n = 100, trials =  50
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 6
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 0
    - number of reference calls to StdStats.stddev() = 1

  * n =  64, trials = 150
    - calls StdStats.mean() the wrong number of times
    - number of student   calls to StdStats.mean() = 6
    - number of reference calls to StdStats.mean() = 1

    - calls StdStats.stddev() the wrong number of times
    - number of student   calls to StdStats.stddev() = 0
    - number of reference calls to StdStats.stddev() = 1

==> FAILED

Test 2: count calls to methods in StdRandom
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 3: count calls to methods in Percolation
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 4: Call PercolationStats methods with trials = 3 and values of n that go up
        by a factor of sqrt(2). The test passes when n reaches 2,896.

     The approximate order-of-growth is n ^ (log ratio)

         n  seconds log ratio
     ------------------------
       512     0.16       2.7
       724     0.33       2.0
      1024     0.78       2.5
      1448     1.63       2.1
      2048     3.37       2.1
      2896     7.05       2.1
==> passed


Total: 3/4 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Percolation
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: check that total memory <= 17 n^2 + 128 n + 1024 bytes

                 n        bytes
--------------------------------------------
=> passed       64        37048         
=> passed      256       590008         
=> passed      512      2359480         
=> passed     1024      9437368         
==> 4/4 tests passed


Estimated student memory = 9.00 n^2 + 0.00 n + 184.00   (R^2 = 1.000)


Test 2 (bonus): check that total memory <= 11 n^2 + 128 n + 1024 bytes
   -  bonus available only if solution passes backwash correctness test
==> FAILED


Total: 4/4 tests passed!


================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing Percolation
*-----------------------------------------------------------
Running 16 total tests.

Test 1a-1e: Creates an n-by-n percolation system; open sites at random until
            the system percolates, interleaving calls to percolates() and open().
            Count calls to connected(), union() and find().

                                       2 * connected()
                 n       union()              + find()        constructor
-----------------------------------------------------------------------------------
=> passed       16          207                   320                   1         
=> passed       32          758                  1244                   1         
=> passed       64         2706                  4688                   1         
=> passed      128        11150                 18986                   1         
=> passed      256        45832                 77388                   1         
=> passed      512       185679                311820                   1         
=> passed     1024       747061               1251094                   1         
==> 7/7 tests passed


If one of the values in the table violates the performance limits
the factor by which you failed the test appears in parentheses.
For example, (9.6x) in the union() column indicates that it uses
9.6x too many calls.


Tests 2a-2f: Check whether the number of calls to union(), connected(), and find()
             is a constant per call to open(), isOpen(), isFull(), and percolates().
             The table shows the maximum number of union() and find() calls made
             during a single call to open(), isOpen(), isFull(), and percolates().
             One call to connected() counts as two calls to find().

                 n     per open()      per isOpen()    per isFull()    per percolates() 
---------------------------------------------------------------------------------------------
=> passed       16        4               0               2               2         
=> passed       32        4               0               2               2         
=> passed       64        4               0               2               2         
=> passed      128        4               0               2               2         
=> passed      256        4               0               2               2         
=> passed      512        4               0               2               2         
=> passed     1024        4               0               2               2         
==> 7/7 tests passed



Running time (in seconds) depends on the machine on which the script runs.


Test 3: Create an n-by-n percolation system; interleave calls to percolates()
        and open() until the system percolates. The values of n go up by a
        factor of sqrt(2). The test is passed if n >= 4096 in under 10 seconds.

     The approximate order-of-growth is n ^ (log ratio)

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
      1024     0.17     1.8      2720626     2.0
      1448     0.43     2.7      5453308     2.0
      2048     0.89     2.1     10863874     2.0
      2896     2.13     2.5     21812520     2.0
      4096     3.84     1.7     43454208     2.0
==> passed



Test 4: Create an n-by-n percolation system; interleave calls to open(),
        percolates(), isOpen(), isFull(), and numberOfOpenSites() until.
        the system percolates. The values of n go up by a factor of sqrt(2).
        The test is passed if n >= 4096 in under 10 seconds.

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
       181     0.38     4.0       123976     2.1
       256     1.53     4.0       247704     2.0
       362     6.12     4.0       484206     1.9
       512    26.61     4.2       992782     2.1
     [ exceeded the time limit of 10.0 seconds ]

==> FAILED


Total: 15/16 tests passed!


================================================================



