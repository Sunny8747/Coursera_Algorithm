Union_find
===========

# Quick Find
Tag : flat, find, 
Defect :
    Union too expensive
    Trees are flat, but too expensive to keep them flat
Init - N
Union - N
Find - 1

# Quick Union
Tag : tree, forest, graph, find node
Defect :
    Trees can get tall
    Find too expensive
lazy approach
Init - N
Union - N * includes cost of finding roots
find - N *worst case

# Quick Union Improved
- Weighting : linking root of smaller tree to root of larger tree (height or rank)
Init - M
Union - lg N = ln N + log_10 N
find - lg N = ln N + log_10 N

- Path compression : make samll tree bring to up
- QU + path compression = N + M log N
- weighted QU + path compression = N + M lg N

# Application
- Percolation
- Dynamics connectivity
- Equivanlence of finite state automata
- Least common ancestor
- Matlab's bwlabel() in image processing
- Kruskal's minimum spanning tree algorithm

<hr/>

# Interview Question
1) Social network connectivity. Given a social network containing nn members and a log file containing mm timestamps at which times pairs of members formed friendships, design an algorithm to determine the earliest time at which all members are connected (i.e., every member is a friend of a friend of a friend ... of a friend). Assume that the log file is sorted by timestamp and that friendship is an equivalence relation. The running time of your algorithm should be m log n or better and use extra space proportional to n.
Note: these interview questions are ungraded and purely for your own enrichment. To get a hint, submit a solution.
answer :
- m number of union.
- all members have to connect
- the earliest time
-> Weighted QU or weighted QU + path-compression

2) Union-find with specific canonical element. Add a method \mathtt{find()}find() to the union-find data type so that \mathtt{find(i)}find(i) returns the largest element in the connected component containing ii. The operations, \mathtt{union()}union(), \mathtt{connected()}connected(), and \mathtt{find()}find() should all take logarithmic time or better.
For example, if one of the connected components is {1, 2, 6, 9}{1,2,6,9}, then the \mathtt{find()}find() method should return 99 for each of the four elements in the connected components.
answer : 


3) Successor with delete. Given a set of nn integers S = \{ 0, 1, ... , n-1 \}S={0,1,...,n−1} and a sequence of requests of the following form:
- Remove xx from SS
- Find the successor of xx: the smallest yy in SS such that y \ge xy≥x.
design a data type so that all operations (except construction) take logarithmic time or better in the worst case.

answer : 

<hr/>

# Assignment#1
- Percolation : JAVA

