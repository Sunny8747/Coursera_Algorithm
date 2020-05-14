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

# Assignment#1
- Percolation : JAVA
- 93/100
- Fail backwash test

